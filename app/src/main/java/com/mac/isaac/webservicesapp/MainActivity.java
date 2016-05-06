package com.mac.isaac.webservicesapp;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mac.isaac.webservicesapp.gson.RelatedTopic;
import com.mac.isaac.webservicesapp.gson.WebService;

import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RVAdapter rvAdapter;
    LinearLayoutManager llmanager;
    List<String> characters;
    Button btnGson;
    Button btnImage;
    ImageView ivImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnGson = (Button) findViewById(R.id.btn_request_gson);
        btnImage = (Button) findViewById(R.id.btn_request_image);
        ivImage = (ImageView) findViewById(R.id.iv_image);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        llmanager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(llmanager);
        characters = new ArrayList<String>();
        /*rvAdapter = new RVAdapter(characters);
        recyclerView.setAdapter(rvAdapter);*/
    }

    public void requestImage(View view) {
        Log.i("MYTAG", "Requesting image");
        RequestQueue queue = Volley.newRequestQueue(MainActivity.this);
        String url = getResources().getString(R.string.image_url);
        ImageRequest imageRequest = new ImageRequest(url,
                new Response.Listener<Bitmap>() {
                    @Override
                    public void onResponse(Bitmap bitmap) {
                        ivImage.setImageBitmap(bitmap);
                    }
                }, 0, 0, null,
                new Response.ErrorListener() {
                    public void onErrorResponse(VolleyError error) {
                        ivImage.setImageResource(android.R.drawable.stat_notify_error);
                    }
                });
        //add request to queue
        queue.add(imageRequest);
    }

    public void requestGson(View view) {
        fetchInfo("GSON");
    }

    public void requestJackson(View view) {
        fetchInfo("Jackson");
    }

    public void fetchInfo(final String parser) {
        String response = "";
        characters = new ArrayList<String>();
        recyclerView.swapAdapter(null, true);
        RequestQueue queue = Volley.newRequestQueue(MainActivity.this);
        String url = getResources().getString(R.string.api_url);
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(  Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            if (parser.equals("GSON"))
                                parseGson(response.toString());
                            else
                                parseJackson(response.toString());
                            Log.i("VOLLEY", response.toString());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });
        //add request to queue
        queue.add(jsonObjectRequest);
    }

    public void parseGson(String json) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        WebService webService = gson.fromJson(json, WebService.class);
        List<RelatedTopic> list = webService.getRelatedTopics();
        for (int i=0; i<list.size(); i++) {
            characters.add(list.get(i).getText());
        }
        rvAdapter = new RVAdapter(characters);
        recyclerView.swapAdapter(rvAdapter, true);
    }

    public void parseJackson(String json) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            com.mac.isaac.webservicesapp.jackson.WebService webService = mapper.readValue(json,
                    com.mac.isaac.webservicesapp.jackson.WebService.class);
            List<com.mac.isaac.webservicesapp.jackson.RelatedTopic> list = webService.getRelatedTopics();
            for (int i=0; i<list.size(); i++) {
                characters.add(list.get(i).getText());
            }
            rvAdapter = new RVAdapter(characters);
            recyclerView.swapAdapter(rvAdapter, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
