
package integrations.pojo.insightly.contacts;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "DATE_ID",
        "OCCASION_NAME",
        "OCCASION_DATE",
        "REPEAT_YEARLY",
        "CREATE_TASK_YEARLY"
})
public class Contact_Date {

    @JsonProperty("DATE_ID")
    private Long dATEID;
    @JsonProperty("OCCASION_NAME")
    private String oCCASIONNAME;
    @JsonProperty("OCCASION_DATE")
    private String oCCASIONDATE;
    @JsonProperty("REPEAT_YEARLY")
    private Boolean rEPEATYEARLY;
    @JsonProperty("CREATE_TASK_YEARLY")
    private Boolean cREATETASKYEARLY;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("DATE_ID")
    public Long getDATEID() {
        return dATEID;
    }

    @JsonProperty("DATE_ID")
    public void setDATEID(Long dATEID) {
        this.dATEID = dATEID;
    }

    @JsonProperty("OCCASION_NAME")
    public String getOCCASIONNAME() {
        return oCCASIONNAME;
    }

    @JsonProperty("OCCASION_NAME")
    public void setOCCASIONNAME(String oCCASIONNAME) {
        this.oCCASIONNAME = oCCASIONNAME;
    }

    @JsonProperty("OCCASION_DATE")
    public String getOCCASIONDATE() {
        return oCCASIONDATE;
    }

    @JsonProperty("OCCASION_DATE")
    public void setOCCASIONDATE(String oCCASIONDATE) {
        this.oCCASIONDATE = oCCASIONDATE;
    }

    @JsonProperty("REPEAT_YEARLY")
    public Boolean getREPEATYEARLY() {
        return rEPEATYEARLY;
    }

    @JsonProperty("REPEAT_YEARLY")
    public void setREPEATYEARLY(Boolean rEPEATYEARLY) {
        this.rEPEATYEARLY = rEPEATYEARLY;
    }

    @JsonProperty("CREATE_TASK_YEARLY")
    public Boolean getCREATETASKYEARLY() {
        return cREATETASKYEARLY;
    }

    @JsonProperty("CREATE_TASK_YEARLY")
    public void setCREATETASKYEARLY(Boolean cREATETASKYEARLY) {
        this.cREATETASKYEARLY = cREATETASKYEARLY;
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
