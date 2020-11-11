
package integrations.pojo.insightly.opportunities;

import com.fasterxml.jackson.annotation.*;
import com.insightly.lambda.pojo.customFields.CustomField;
import com.insightly.lambda.pojo.tags.Tags;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "OPPORTUNITY_STATE_REASON_ID",
        "OPPORTUNITY_ID",
        "OPPORTUNITY_NAME",
        "OPPORTUNITY_DETAILS",
        "OPPORTUNITY_STATE",
        "RESPONSIBLE_USER_ID",
        "CATEGORY_ID",
        "IMAGE_URL",
        "BID_CURRENCY",
        "BID_AMOUNT",
        "BID_TYPE",
        "BID_DURATION",
        "ACTUAL_CLOSE_DATE",
        "DATE_CREATED_UTC",
        "DATE_UPDATED_UTC",
        "OPPORTUNITY_VALUE",
        "PROBABILITY",
        "FORECAST_CLOSE_DATE",
        "OWNER_USER_ID",
        "LAST_ACTIVITY_DATE_UTC",
        "NEXT_ACTIVITY_DATE_UTC",
        "PIPELINE_ID",
        "STAGE_ID",
        "ORGANISATION_ID",
        "CUSTOMFIELDS",
        "TAGS"
})
public class Opportunity {

    @JsonProperty("OPPORTUNITY_STATE_REASON_ID")
    private Object oPPORTUNITYSTATEREASONID;
    @JsonProperty("OPPORTUNITY_ID")
    private Long oPPORTUNITYID;
    @JsonProperty("OPPORTUNITY_NAME")
    private String oPPORTUNITYNAME;
    @JsonProperty("OPPORTUNITY_DETAILS")
    private String oPPORTUNITYDETAILS;
    @JsonProperty("OPPORTUNITY_STATE")
    private String oPPORTUNITYSTATE;
    @JsonProperty("RESPONSIBLE_USER_ID")
    private Long rESPONSIBLEUSERID;
    @JsonProperty("CATEGORY_ID")
    private Long cATEGORYID;
    @JsonProperty("IMAGE_URL")
    private Object iMAGEURL;
    @JsonProperty("BID_CURRENCY")
    private String bIDCURRENCY;
    @JsonProperty("BID_AMOUNT")
    private Long bIDAMOUNT;
    @JsonProperty("BID_TYPE")
    private String bIDTYPE;
    @JsonProperty("BID_DURATION")
    private Long bIDDURATION;
    @JsonProperty("ACTUAL_CLOSE_DATE")
    private String aCTUALCLOSEDATE;
    @JsonProperty("DATE_CREATED_UTC")
    private String dATECREATEDUTC;
    @JsonProperty("DATE_UPDATED_UTC")
    private String dATEUPDATEDUTC;
    @JsonProperty("OPPORTUNITY_VALUE")
    private Long oPPORTUNITYVALUE;
    @JsonProperty("PROBABILITY")
    private Long pROBABILITY;
    @JsonProperty("FORECAST_CLOSE_DATE")
    private String fORECASTCLOSEDATE;
    @JsonProperty("OWNER_USER_ID")
    private Long oWNERUSERID;
    @JsonProperty("LAST_ACTIVITY_DATE_UTC")
    private Object lASTACTIVITYDATEUTC;
    @JsonProperty("NEXT_ACTIVITY_DATE_UTC")
    private Object nEXTACTIVITYDATEUTC;
    @JsonProperty("PIPELINE_ID")
    private Long pIPELINEID;
    @JsonProperty("STAGE_ID")
    private Long sTAGEID;
    @JsonProperty("ORGANISATION_ID")
    private Long oRGANISATIONID;
    @JsonProperty("CUSTOMFIELDS")
    private List<CustomField> cUSTOMFIELDS = null;
    @JsonProperty("TAGS")
    private List<Tags> tAGS = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("OPPORTUNITY_STATE_REASON_ID")
    public Object getOPPORTUNITYSTATEREASONID() {
        return oPPORTUNITYSTATEREASONID;
    }

    @JsonProperty("OPPORTUNITY_STATE_REASON_ID")
    public void setOPPORTUNITYSTATEREASONID(Object oPPORTUNITYSTATEREASONID) {
        this.oPPORTUNITYSTATEREASONID = oPPORTUNITYSTATEREASONID;
    }

    @JsonProperty("OPPORTUNITY_ID")
    public Long getOPPORTUNITYID() {
        return oPPORTUNITYID;
    }

    @JsonProperty("OPPORTUNITY_ID")
    public void setOPPORTUNITYID(Long oPPORTUNITYID) {
        this.oPPORTUNITYID = oPPORTUNITYID;
    }

    @JsonProperty("OPPORTUNITY_NAME")
    public String getOPPORTUNITYNAME() {
        return oPPORTUNITYNAME;
    }

    @JsonProperty("OPPORTUNITY_NAME")
    public void setOPPORTUNITYNAME(String oPPORTUNITYNAME) {
        this.oPPORTUNITYNAME = oPPORTUNITYNAME;
    }

    @JsonProperty("OPPORTUNITY_DETAILS")
    public String getOPPORTUNITYDETAILS() {
        return oPPORTUNITYDETAILS;
    }

    @JsonProperty("OPPORTUNITY_DETAILS")
    public void setOPPORTUNITYDETAILS(String oPPORTUNITYDETAILS) {
        this.oPPORTUNITYDETAILS = oPPORTUNITYDETAILS;
    }

    @JsonProperty("OPPORTUNITY_STATE")
    public String getOPPORTUNITYSTATE() {
        return oPPORTUNITYSTATE;
    }

    @JsonProperty("OPPORTUNITY_STATE")
    public void setOPPORTUNITYSTATE(String oPPORTUNITYSTATE) {
        this.oPPORTUNITYSTATE = oPPORTUNITYSTATE;
    }

    @JsonProperty("RESPONSIBLE_USER_ID")
    public Long getRESPONSIBLEUSERID() {
        return rESPONSIBLEUSERID;
    }

    @JsonProperty("RESPONSIBLE_USER_ID")
    public void setRESPONSIBLEUSERID(Long rESPONSIBLEUSERID) {
        this.rESPONSIBLEUSERID = rESPONSIBLEUSERID;
    }

    @JsonProperty("CATEGORY_ID")
    public Long getCATEGORYID() {
        return cATEGORYID;
    }

    @JsonProperty("CATEGORY_ID")
    public void setCATEGORYID(Long cATEGORYID) {
        this.cATEGORYID = cATEGORYID;
    }

    @JsonProperty("IMAGE_URL")
    public Object getIMAGEURL() {
        return iMAGEURL;
    }

    @JsonProperty("IMAGE_URL")
    public void setIMAGEURL(Object iMAGEURL) {
        this.iMAGEURL = iMAGEURL;
    }

    @JsonProperty("BID_CURRENCY")
    public String getBIDCURRENCY() {
        return bIDCURRENCY;
    }

    @JsonProperty("BID_CURRENCY")
    public void setBIDCURRENCY(String bIDCURRENCY) {
        this.bIDCURRENCY = bIDCURRENCY;
    }

    @JsonProperty("BID_AMOUNT")
    public Long getBIDAMOUNT() {
        return bIDAMOUNT;
    }

    @JsonProperty("BID_AMOUNT")
    public void setBIDAMOUNT(Long bIDAMOUNT) {
        this.bIDAMOUNT = bIDAMOUNT;
    }

    @JsonProperty("BID_TYPE")
    public String getBIDTYPE() {
        return bIDTYPE;
    }

    @JsonProperty("BID_TYPE")
    public void setBIDTYPE(String bIDTYPE) {
        this.bIDTYPE = bIDTYPE;
    }

    @JsonProperty("BID_DURATION")
    public Long getBIDDURATION() {
        return bIDDURATION;
    }

    @JsonProperty("BID_DURATION")
    public void setBIDDURATION(Long bIDDURATION) {
        this.bIDDURATION = bIDDURATION;
    }

    @JsonProperty("ACTUAL_CLOSE_DATE")
    public String getACTUALCLOSEDATE() {
        return aCTUALCLOSEDATE;
    }

    @JsonProperty("ACTUAL_CLOSE_DATE")
    public void setACTUALCLOSEDATE(String aCTUALCLOSEDATE) {
        this.aCTUALCLOSEDATE = aCTUALCLOSEDATE;
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

    @JsonProperty("OPPORTUNITY_VALUE")
    public Long getOPPORTUNITYVALUE() {
        return oPPORTUNITYVALUE;
    }

    @JsonProperty("OPPORTUNITY_VALUE")
    public void setOPPORTUNITYVALUE(Long oPPORTUNITYVALUE) {
        this.oPPORTUNITYVALUE = oPPORTUNITYVALUE;
    }

    @JsonProperty("PROBABILITY")
    public Long getPROBABILITY() {
        return pROBABILITY;
    }

    @JsonProperty("PROBABILITY")
    public void setPROBABILITY(Long pROBABILITY) {
        this.pROBABILITY = pROBABILITY;
    }

    @JsonProperty("FORECAST_CLOSE_DATE")
    public String getFORECASTCLOSEDATE() {
        return fORECASTCLOSEDATE;
    }

    @JsonProperty("FORECAST_CLOSE_DATE")
    public void setFORECASTCLOSEDATE(String fORECASTCLOSEDATE) {
        this.fORECASTCLOSEDATE = fORECASTCLOSEDATE;
    }

    @JsonProperty("OWNER_USER_ID")
    public Long getOWNERUSERID() {
        return oWNERUSERID;
    }

    @JsonProperty("OWNER_USER_ID")
    public void setOWNERUSERID(Long oWNERUSERID) {
        this.oWNERUSERID = oWNERUSERID;
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

    @JsonProperty("ORGANISATION_ID")
    public Long getORGANISATIONID() {
        return oRGANISATIONID;
    }

    @JsonProperty("ORGANISATION_ID")
    public void setORGANISATIONID(Long oRGANISATIONID) {
        this.oRGANISATIONID = oRGANISATIONID;
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
