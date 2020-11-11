
package integrations.pojo.insightly.projects;

import com.fasterxml.jackson.annotation.*;
import com.insightly.lambda.pojo.customFields.CustomField;
import com.insightly.lambda.pojo.tags.Tags;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "PROJECT_ID",
        "PROJECT_NAME",
        "STATUS",
        "PROJECT_DETAILS",
        "STARTED_DATE",
        "COMPLETED_DATE",
        "OPPORTUNITY_ID",
        "CATEGORY_ID",
        "PIPELINE_ID",
        "STAGE_ID",
        "IMAGE_URL",
        "OWNER_USER_ID",
        "DATE_CREATED_UTC",
        "DATE_UPDATED_UTC",
        "LAST_ACTIVITY_DATE_UTC",
        "NEXT_ACTIVITY_DATE_UTC",
        "RESPONSIBLE_USER_ID",
        "CUSTOMFIELDS",
        "TAGS"
})
public class Project {

    @JsonProperty("PROJECT_ID")
    private Long pROJECTID;
    @JsonProperty("PROJECT_NAME")
    private String pROJECTNAME;
    @JsonProperty("STATUS")
    private String sTATUS;
    @JsonProperty("PROJECT_DETAILS")
    private String pROJECTDETAILS;
    @JsonProperty("STARTED_DATE")
    private String sTARTEDDATE;
    @JsonProperty("COMPLETED_DATE")
    private Object cOMPLETEDDATE;
    @JsonProperty("OPPORTUNITY_ID")
    private Object oPPORTUNITYID;
    @JsonProperty("CATEGORY_ID")
    private Long cATEGORYID;
    @JsonProperty("PIPELINE_ID")
    private Long pIPELINEID;
    @JsonProperty("STAGE_ID")
    private Long sTAGEID;
    @JsonProperty("IMAGE_URL")
    private Object iMAGEURL;
    @JsonProperty("OWNER_USER_ID")
    private Long oWNERUSERID;
    @JsonProperty("DATE_CREATED_UTC")
    private String dATECREATEDUTC;
    @JsonProperty("DATE_UPDATED_UTC")
    private String dATEUPDATEDUTC;
    @JsonProperty("LAST_ACTIVITY_DATE_UTC")
    private Object lASTACTIVITYDATEUTC;
    @JsonProperty("NEXT_ACTIVITY_DATE_UTC")
    private Object nEXTACTIVITYDATEUTC;
    @JsonProperty("RESPONSIBLE_USER_ID")
    private Long rESPONSIBLEUSERID;
    @JsonProperty("CUSTOMFIELDS")
    private List<CustomField> cUSTOMFIELDS = null;
    @JsonProperty("TAGS")
    private List<Tags> tAGS = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("PROJECT_ID")
    public Long getPROJECTID() {
        return pROJECTID;
    }

    @JsonProperty("PROJECT_ID")
    public void setPROJECTID(Long pROJECTID) {
        this.pROJECTID = pROJECTID;
    }

    @JsonProperty("PROJECT_NAME")
    public String getPROJECTNAME() {
        return pROJECTNAME;
    }

    @JsonProperty("PROJECT_NAME")
    public void setPROJECTNAME(String pROJECTNAME) {
        this.pROJECTNAME = pROJECTNAME;
    }

    @JsonProperty("STATUS")
    public String getSTATUS() {
        return sTATUS;
    }

    @JsonProperty("STATUS")
    public void setSTATUS(String sTATUS) {
        this.sTATUS = sTATUS;
    }

    @JsonProperty("PROJECT_DETAILS")
    public String getPROJECTDETAILS() {
        return pROJECTDETAILS;
    }

    @JsonProperty("PROJECT_DETAILS")
    public void setPROJECTDETAILS(String pROJECTDETAILS) {
        this.pROJECTDETAILS = pROJECTDETAILS;
    }

    @JsonProperty("STARTED_DATE")
    public String getSTARTEDDATE() {
        return sTARTEDDATE;
    }

    @JsonProperty("STARTED_DATE")
    public void setSTARTEDDATE(String sTARTEDDATE) {
        this.sTARTEDDATE = sTARTEDDATE;
    }

    @JsonProperty("COMPLETED_DATE")
    public Object getCOMPLETEDDATE() {
        return cOMPLETEDDATE;
    }

    @JsonProperty("COMPLETED_DATE")
    public void setCOMPLETEDDATE(Object cOMPLETEDDATE) {
        this.cOMPLETEDDATE = cOMPLETEDDATE;
    }

    @JsonProperty("OPPORTUNITY_ID")
    public Object getOPPORTUNITYID() {
        return oPPORTUNITYID;
    }

    @JsonProperty("OPPORTUNITY_ID")
    public void setOPPORTUNITYID(Object oPPORTUNITYID) {
        this.oPPORTUNITYID = oPPORTUNITYID;
    }

    @JsonProperty("CATEGORY_ID")
    public Long getCATEGORYID() {
        return cATEGORYID;
    }

    @JsonProperty("CATEGORY_ID")
    public void setCATEGORYID(Long cATEGORYID) {
        this.cATEGORYID = cATEGORYID;
    }

    @JsonProperty("PIPELINE_ID")
    public Long getPIPELINEID() {
        return pIPELINEID;
    }

    @JsonProperty("PIPELINE_ID")
    public void setPIPELINEID(Long pIPELINEID) {
        this.pIPELINEID = pIPELINEID;
    }

    @JsonProperty("STAGE_ID")
    public Long getSTAGEID() {
        return sTAGEID;
    }

    @JsonProperty("STAGE_ID")
    public void setSTAGEID(Long sTAGEID) {
        this.sTAGEID = sTAGEID;
    }

    @JsonProperty("IMAGE_URL")
    public Object getIMAGEURL() {
        return iMAGEURL;
    }

    @JsonProperty("IMAGE_URL")
    public void setIMAGEURL(Object iMAGEURL) {
        this.iMAGEURL = iMAGEURL;
    }

    @JsonProperty("OWNER_USER_ID")
    public Long getOWNERUSERID() {
        return oWNERUSERID;
    }

    @JsonProperty("OWNER_USER_ID")
    public void setOWNERUSERID(Long oWNERUSERID) {
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

    @JsonProperty("LAST_ACTIVITY_DATE_UTC")
    public Object getLASTACTIVITYDATEUTC() {
        return lASTACTIVITYDATEUTC;
    }

    @JsonProperty("LAST_ACTIVITY_DATE_UTC")
    public void setLASTACTIVITYDATEUTC(Object lASTACTIVITYDATEUTC) {
        this.lASTACTIVITYDATEUTC = lASTACTIVITYDATEUTC;
    }

    @JsonProperty("NEXT_ACTIVITY_DATE_UTC")
    public Object getNEXTACTIVITYDATEUTC() {
        return nEXTACTIVITYDATEUTC;
    }

    @JsonProperty("NEXT_ACTIVITY_DATE_UTC")
    public void setNEXTACTIVITYDATEUTC(Object nEXTACTIVITYDATEUTC) {
        this.nEXTACTIVITYDATEUTC = nEXTACTIVITYDATEUTC;
    }

    @JsonProperty("RESPONSIBLE_USER_ID")
    public Long getRESPONSIBLEUSERID() {
        return rESPONSIBLEUSERID;
    }

    @JsonProperty("RESPONSIBLE_USER_ID")
    public void setRESPONSIBLEUSERID(Long rESPONSIBLEUSERID) {
        this.rESPONSIBLEUSERID = rESPONSIBLEUSERID;
    }

    @JsonProperty("CUSTOMFIELDS")
    public List<CustomField> getCUSTOMFIELDS() {
        return cUSTOMFIELDS;
    }

    @JsonProperty("CUSTOMFIELDS")
    public void setCUSTOMFIELDS(List<CustomField> cUSTOMFIELDS) {
        this.cUSTOMFIELDS = cUSTOMFIELDS;
    }

    @JsonProperty("TAGS")
    public List<Tags> getTAGS() {
        return tAGS;
    }

    @JsonProperty("TAGS")
    public void setTAGS(List<Tags> tAGS) {
        this.tAGS = tAGS;
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
