package com.mac.isaac.webservicesapp.jackson;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Result",
    "Icon",
    "FirstURL",
    "Text"
})
public class RelatedTopic {

    @JsonProperty("Result")
    private String Result;
    @JsonProperty("Icon")
    private com.mac.isaac.webservicesapp.jackson.Icon Icon;
    @JsonProperty("FirstURL")
    private String FirstURL;
    @JsonProperty("Text")
    private String Text;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Result
     */
    @JsonProperty("Result")
    public String getResult() {
        return Result;
    }

    /**
     * 
     * @param Result
     *     The Result
     */
    @JsonProperty("Result")
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * 
     * @return
     *     The Icon
     */
    @JsonProperty("Icon")
    public com.mac.isaac.webservicesapp.jackson.Icon getIcon() {
        return Icon;
    }

    /**
     * 
     * @param Icon
     *     The Icon
     */
    @JsonProperty("Icon")
    public void setIcon(com.mac.isaac.webservicesapp.jackson.Icon Icon) {
        this.Icon = Icon;
    }

    /**
     * 
     * @return
     *     The FirstURL
     */
    @JsonProperty("FirstURL")
    public String getFirstURL() {
        return FirstURL;
    }

    /**
     * 
     * @param FirstURL
     *     The FirstURL
     */
    @JsonProperty("FirstURL")
    public void setFirstURL(String FirstURL) {
        this.FirstURL = FirstURL;
    }

    /**
     * 
     * @return
     *     The Text
     */
    @JsonProperty("Text")
    public String getText() {
        return Text;
    }

    /**
     * 
     * @param Text
     *     The Text
     */
    @JsonProperty("Text")
    public void setText(String Text) {
        this.Text = Text;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
