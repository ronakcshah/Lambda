package integrations.pojo.insightly.links;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "LINK_ID",
        "OBJECT_NAME",
        "OBJECT_ID",
        "LINK_OBJECT_NAME",
        "LINK_OBJECT_ID",
        "ROLE",
        "DETAILS",
        "RELATIONSHIP_ID",
        "IS_FORWARD"
})
public class Links {

    @JsonProperty("LINK_ID")
    private Integer lINKID;
    @JsonProperty("OBJECT_NAME")
    private String oBJECTNAME;
    @JsonProperty("OBJECT_ID")
    private Integer oBJECTID;
    @JsonProperty("LINK_OBJECT_NAME")
    private String lINKOBJECTNAME;
    @JsonProperty("LINK_OBJECT_ID")
    private Integer lINKOBJECTID;
    @JsonProperty("ROLE")
    private String rOLE;
    @JsonProperty("DETAILS")
    private String dETAILS;
    @JsonProperty("RELATIONSHIP_ID")
    private Integer rELATIONSHIPID;
    @JsonProperty("IS_FORWARD")
    private Boolean iSFORWARD;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("LINK_ID")
    public Integer getLINKID() {
        return lINKID;
    }

    @JsonProperty("LINK_ID")
    public void setLINKID(Integer lINKID) {
        this.lINKID = lINKID;
    }

    @JsonProperty("OBJECT_NAME")
    public String getOBJECTNAME() {
        return oBJECTNAME;
    }

    @JsonProperty("OBJECT_NAME")
    public void setOBJECTNAME(String oBJECTNAME) {
        this.oBJECTNAME = oBJECTNAME;
    }

    @JsonProperty("OBJECT_ID")
    public Integer getOBJECTID() {
        return oBJECTID;
    }

    @JsonProperty("OBJECT_ID")
    public void setOBJECTID(Integer oBJECTID) {
        this.oBJECTID = oBJECTID;
    }

    @JsonProperty("LINK_OBJECT_NAME")
    public String getLINKOBJECTNAME() {
        return lINKOBJECTNAME;
    }

    @JsonProperty("LINK_OBJECT_NAME")
    public void setLINKOBJECTNAME(String lINKOBJECTNAME) {
        this.lINKOBJECTNAME = lINKOBJECTNAME;
    }

    @JsonProperty("LINK_OBJECT_ID")
    public Integer getLINKOBJECTID() {
        return lINKOBJECTID;
    }

    @JsonProperty("LINK_OBJECT_ID")
    public void setLINKOBJECTID(Integer lINKOBJECTID) {
        this.lINKOBJECTID = lINKOBJECTID;
    }

    @JsonProperty("ROLE")
    public String getROLE() {
        return rOLE;
    }

    @JsonProperty("ROLE")
    public void setROLE(String rOLE) {
        this.rOLE = rOLE;
    }

    @JsonProperty("DETAILS")
    public String getDETAILS() {
        return dETAILS;
    }

    @JsonProperty("DETAILS")
    public void setDETAILS(String dETAILS) {
        this.dETAILS = dETAILS;
    }

    @JsonProperty("RELATIONSHIP_ID")
    public Integer getRELATIONSHIPID() {
        return rELATIONSHIPID;
    }

    @JsonProperty("RELATIONSHIP_ID")
    public void setRELATIONSHIPID(Integer rELATIONSHIPID) {
        this.rELATIONSHIPID = rELATIONSHIPID;
    }

    @JsonProperty("IS_FORWARD")
    public Boolean getISFORWARD() {
        return iSFORWARD;
    }

    @JsonProperty("IS_FORWARD")
    public void setISFORWARD(Boolean iSFORWARD) {
        this.iSFORWARD = iSFORWARD;
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
