package integrations.pojo.insightly.customObjects;

import com.fasterxml.jackson.annotation.*;
import com.insightly.lambda.pojo.customFields.CustomField;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "RECORD_ID",
        "RECORD_NAME",
        "OWNER_USER_ID",
        "DATE_CREATED_UTC",
        "DATE_UPDATED_UTC",
        "CREATED_USER_ID",
        "CUSTOMFIELDS"
})
public class CustomObject {

    @JsonProperty("RECORD_ID")
    private Integer rECORDID;
    @JsonProperty("RECORD_NAME")
    private String rECORDNAME;
    @JsonProperty("OWNER_USER_ID")
    private Integer oWNERUSERID;
    @JsonProperty("DATE_CREATED_UTC")
    private String dATECREATEDUTC;
    @JsonProperty("DATE_UPDATED_UTC")
    private String dATEUPDATEDUTC;
    @JsonProperty("CREATED_USER_ID")
    private Integer cREATEDUSERID;
    @JsonProperty("CUSTOMFIELDS")
    private List<CustomField> cUSTOMFIELDS = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("RECORD_ID")
    public Integer getRECORDID() {
        return rECORDID;
    }

    @JsonProperty("RECORD_ID")
    public void setRECORDID(Integer rECORDID) {
        this.rECORDID = rECORDID;
    }

    @JsonProperty("RECORD_NAME")
    public String getRECORDNAME() {
        return rECORDNAME;
    }

    @JsonProperty("RECORD_NAME")
    public void setRECORDNAME(String rECORDNAME) {
        this.rECORDNAME = rECORDNAME;
    }

    @JsonProperty("OWNER_USER_ID")
    public Integer getOWNERUSERID() {
        return oWNERUSERID;
    }

    @JsonProperty("OWNER_USER_ID")
    public void setOWNERUSERID(Integer oWNERUSERID) {
        this.oWNERUSERID = oWNERUSERID;
    }

    @JsonProperty("DATE_CREATED_UTC")
    public String getDATECREATEDUTC() {
        return dATECREATEDUTC;
    }

    @JsonProperty("DATE_CREATED_UTC")
    public void setDATECREATEDUTC(String dATECREATEDUTC) {
        this.dATECREATEDUTC = dATECREATEDUTC;
    }

    @JsonProperty("DATE_UPDATED_UTC")
    public String getDATEUPDATEDUTC() {
        return dATEUPDATEDUTC;
    }

    @JsonProperty("DATE_UPDATED_UTC")
    public void setDATEUPDATEDUTC(String dATEUPDATEDUTC) {
        this.dATEUPDATEDUTC = dATEUPDATEDUTC;
    }

    @JsonProperty("CREATED_USER_ID")
    public Integer getCREATEDUSERID() {
        return cREATEDUSERID;
    }

    @JsonProperty("CREATED_USER_ID")
    public void setCREATEDUSERID(Integer cREATEDUSERID) {
        this.cREATEDUSERID = cREATEDUSERID;
    }

    @JsonProperty("CUSTOMFIELDS")
    public List<CustomField> getCUSTOMFIELDS() {
        return cUSTOMFIELDS;
    }

    @JsonProperty("CUSTOMFIELDS")
    public void setCUSTOMFIELDS(List<CustomField> cUSTOMFIELDS) {
        this.cUSTOMFIELDS = cUSTOMFIELDS;
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
