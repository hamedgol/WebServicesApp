package com.mac.isaac.webservicesapp.jackson;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DefinitionSource",
    "Heading",
    "ImageWidth",
    "RelatedTopics",
    "Entity",
    "meta",
    "Type",
    "Redirect",
    "DefinitionURL",
    "AbstractURL",
    "Definition",
    "AbstractSource",
    "Infobox",
    "Image",
    "ImageIsLogo",
    "Abstract",
    "AbstractText",
    "AnswerType",
    "ImageHeight",
    "Answer",
    "Results"
})
public class WebService {

    @JsonProperty("DefinitionSource")
    private String DefinitionSource;
    @JsonProperty("Heading")
    private String Heading;
    @JsonProperty("ImageWidth")
    private Integer ImageWidth;
    @JsonProperty("RelatedTopics")
    private List<RelatedTopic> RelatedTopics = new ArrayList<RelatedTopic>();
    @JsonProperty("Entity")
    private String Entity;
    @JsonProperty("meta")
    private Meta meta;
    @JsonProperty("Type")
    private String Type;
    @JsonProperty("Redirect")
    private String Redirect;
    @JsonProperty("DefinitionURL")
    private String DefinitionURL;
    @JsonProperty("AbstractURL")
    private String AbstractURL;
    @JsonProperty("Definition")
    private String Definition;
    @JsonProperty("AbstractSource")
    private String AbstractSource;
    @JsonProperty("Infobox")
    private String Infobox;
    @JsonProperty("Image")
    private String Image;
    @JsonProperty("ImageIsLogo")
    private Integer ImageIsLogo;
    @JsonProperty("Abstract")
    private String Abstract;
    @JsonProperty("AbstractText")
    private String AbstractText;
    @JsonProperty("AnswerType")
    private String AnswerType;
    @JsonProperty("ImageHeight")
    private Integer ImageHeight;
    @JsonProperty("Answer")
    private String Answer;
    @JsonProperty("Results")
    private List<Object> Results = new ArrayList<Object>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The DefinitionSource
     */
    @JsonProperty("DefinitionSource")
    public String getDefinitionSource() {
        return DefinitionSource;
    }

    /**
     * 
     * @param DefinitionSource
     *     The DefinitionSource
     */
    @JsonProperty("DefinitionSource")
    public void setDefinitionSource(String DefinitionSource) {
        this.DefinitionSource = DefinitionSource;
    }

    /**
     * 
     * @return
     *     The Heading
     */
    @JsonProperty("Heading")
    public String getHeading() {
        return Heading;
    }

    /**
     * 
     * @param Heading
     *     The Heading
     */
    @JsonProperty("Heading")
    public void setHeading(String Heading) {
        this.Heading = Heading;
    }

    /**
     * 
     * @return
     *     The ImageWidth
     */
    @JsonProperty("ImageWidth")
    public Integer getImageWidth() {
        return ImageWidth;
    }

    /**
     * 
     * @param ImageWidth
     *     The ImageWidth
     */
    @JsonProperty("ImageWidth")
    public void setImageWidth(Integer ImageWidth) {
        this.ImageWidth = ImageWidth;
    }

    /**
     * 
     * @return
     *     The RelatedTopics
     */
    @JsonProperty("RelatedTopics")
    public List<RelatedTopic> getRelatedTopics() {
        return RelatedTopics;
    }

    /**
     * 
     * @param RelatedTopics
     *     The RelatedTopics
     */
    @JsonProperty("RelatedTopics")
    public void setRelatedTopics(List<RelatedTopic> RelatedTopics) {
        this.RelatedTopics = RelatedTopics;
    }

    /**
     * 
     * @return
     *     The Entity
     */
    @JsonProperty("Entity")
    public String getEntity() {
        return Entity;
    }

    /**
     * 
     * @param Entity
     *     The Entity
     */
    @JsonProperty("Entity")
    public void setEntity(String Entity) {
        this.Entity = Entity;
    }

    /**
     * 
     * @return
     *     The meta
     */
    @JsonProperty("meta")
    public Meta getMeta() {
        return meta;
    }

    /**
     * 
     * @param meta
     *     The meta
     */
    @JsonProperty("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    /**
     * 
     * @return
     *     The Type
     */
    @JsonProperty("Type")
    public String getType() {
        return Type;
    }

    /**
     * 
     * @param Type
     *     The Type
     */
    @JsonProperty("Type")
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * 
     * @return
     *     The Redirect
     */
    @JsonProperty("Redirect")
    public String getRedirect() {
        return Redirect;
    }

    /**
     * 
     * @param Redirect
     *     The Redirect
     */
    @JsonProperty("Redirect")
    public void setRedirect(String Redirect) {
        this.Redirect = Redirect;
    }

    /**
     * 
     * @return
     *     The DefinitionURL
     */
    @JsonProperty("DefinitionURL")
    public String getDefinitionURL() {
        return DefinitionURL;
    }

    /**
     * 
     * @param DefinitionURL
     *     The DefinitionURL
     */
    @JsonProperty("DefinitionURL")
    public void setDefinitionURL(String DefinitionURL) {
        this.DefinitionURL = DefinitionURL;
    }

    /**
     * 
     * @return
     *     The AbstractURL
     */
    @JsonProperty("AbstractURL")
    public String getAbstractURL() {
        return AbstractURL;
    }

    /**
     * 
     * @param AbstractURL
     *     The AbstractURL
     */
    @JsonProperty("AbstractURL")
    public void setAbstractURL(String AbstractURL) {
        this.AbstractURL = AbstractURL;
    }

    /**
     * 
     * @return
     *     The Definition
     */
    @JsonProperty("Definition")
    public String getDefinition() {
        return Definition;
    }

    /**
     * 
     * @param Definition
     *     The Definition
     */
    @JsonProperty("Definition")
    public void setDefinition(String Definition) {
        this.Definition = Definition;
    }

    /**
     * 
     * @return
     *     The AbstractSource
     */
    @JsonProperty("AbstractSource")
    public String getAbstractSource() {
        return AbstractSource;
    }

    /**
     * 
     * @param AbstractSource
     *     The AbstractSource
     */
    @JsonProperty("AbstractSource")
    public void setAbstractSource(String AbstractSource) {
        this.AbstractSource = AbstractSource;
    }

    /**
     * 
     * @return
     *     The Infobox
     */
    @JsonProperty("Infobox")
    public String getInfobox() {
        return Infobox;
    }

    /**
     * 
     * @param Infobox
     *     The Infobox
     */
    @JsonProperty("Infobox")
    public void setInfobox(String Infobox) {
        this.Infobox = Infobox;
    }

    /**
     * 
     * @return
     *     The Image
     */
    @JsonProperty("Image")
    public String getImage() {
        return Image;
    }

    /**
     * 
     * @param Image
     *     The Image
     */
    @JsonProperty("Image")
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * 
     * @return
     *     The ImageIsLogo
     */
    @JsonProperty("ImageIsLogo")
    public Integer getImageIsLogo() {
        return ImageIsLogo;
    }

    /**
     * 
     * @param ImageIsLogo
     *     The ImageIsLogo
     */
    @JsonProperty("ImageIsLogo")
    public void setImageIsLogo(Integer ImageIsLogo) {
        this.ImageIsLogo = ImageIsLogo;
    }

    /**
     * 
     * @return
     *     The Abstract
     */
    @JsonProperty("Abstract")
    public String getAbstract() {
        return Abstract;
    }

    /**
     * 
     * @param Abstract
     *     The Abstract
     */
    @JsonProperty("Abstract")
    public void setAbstract(String Abstract) {
        this.Abstract = Abstract;
    }

    /**
     * 
     * @return
     *     The AbstractText
     */
    @JsonProperty("AbstractText")
    public String getAbstractText() {
        return AbstractText;
    }

    /**
     * 
     * @param AbstractText
     *     The AbstractText
     */
    @JsonProperty("AbstractText")
    public void setAbstractText(String AbstractText) {
        this.AbstractText = AbstractText;
    }

    /**
     * 
     * @return
     *     The AnswerType
     */
    @JsonProperty("AnswerType")
    public String getAnswerType() {
        return AnswerType;
    }

    /**
     * 
     * @param AnswerType
     *     The AnswerType
     */
    @JsonProperty("AnswerType")
    public void setAnswerType(String AnswerType) {
        this.AnswerType = AnswerType;
    }

    /**
     * 
     * @return
     *     The ImageHeight
     */
    @JsonProperty("ImageHeight")
    public Integer getImageHeight() {
        return ImageHeight;
    }

    /**
     * 
     * @param ImageHeight
     *     The ImageHeight
     */
    @JsonProperty("ImageHeight")
    public void setImageHeight(Integer ImageHeight) {
        this.ImageHeight = ImageHeight;
    }

    /**
     * 
     * @return
     *     The Answer
     */
    @JsonProperty("Answer")
    public String getAnswer() {
        return Answer;
    }

    /**
     * 
     * @param Answer
     *     The Answer
     */
    @JsonProperty("Answer")
    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }

    /**
     * 
     * @return
     *     The Results
     */
    @JsonProperty("Results")
    public List<Object> getResults() {
        return Results;
    }

    /**
     * 
     * @param Results
     *     The Results
     */
    @JsonProperty("Results")
    public void setResults(List<Object> Results) {
        this.Results = Results;
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
