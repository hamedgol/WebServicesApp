package com.mac.isaac.webservicesapp;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.RVViewHolder> {

    public List<String> characters;
    public Context mContext;

    public RVAdapter(List<String> characters){
        this.characters = characters;
    }

    public void addRelatedTopic(String character) {
        characters.add(character);
        notifyItemInserted(getItemCount()-1);
    }
    public void removeDummy() {
        if (getItemCount()>0 && characters.get(0) == null) {
            characters.remove(0);
        }
    }

    public void updateList(List<String> relatedTopicsList) {
        this.characters = relatedTopicsList;
        notifyDataSetChanged();
    }

    @Override
    public RVViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_viewholder, parent, false);
        RVViewHolder rvvh = new RVViewHolder(v, mContext);
        return rvvh;
    }

    @Override
    public void onBindViewHolder(RVViewHolder holder, int position) {
        try {
            holder.characterName.setText(characters.get(position));
        } catch (Exception e) {
            Log.d("MYTAG", "Error onBindViewHolder: " + e.getMessage());
        }
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public void removeItem(View v) {

    }

    @Override
    public int getItemCount() {
        return characters.size();
    }

    public static class RVViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;
        TextView characterName;

        public RVViewHolder(View itemView, Context mContext) {
            super(itemView);
            cardView = (CardView)itemView.findViewById(R.id.card_view);
            characterName = (TextView)itemView.findViewById(R.id.character_name);
        }

    }

}
