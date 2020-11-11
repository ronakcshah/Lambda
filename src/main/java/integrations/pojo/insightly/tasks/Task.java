package integrations.pojo.insightly.tasks;

import com.fasterxml.jackson.annotation.*;
import com.insightly.lambda.pojo.customFields.CustomField;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ASSIGNED_BY_USER_ID",
        "ASSIGNED_DATE_UTC",
        "ASSIGNED_TEAM_ID",
        "CATEGORY_ID",
        "COMPLETED",
        "COMPLETED_DATE_UTC",
        "CREATED_USER_ID",
        "CUSTOMFIELDS",
        "DATE_CREATED_UTC",
        "DATE_UPDATED_UTC",
        "DETAILS",
        "DUE_DATE",
        "EMAIL_ID",
        "MILESTONE_ID",
        "OPPORTUNITY_ID",
        "OWNER_USER_ID",
        "OWNER_VISIBLE",
        "PARENT_TASK_ID",
        "PERCENT_COMPLETE",
        "PRIORITY",
        "PROJECT_ID",
        "RECURRENCE",
        "REMINDER_DATE_UTC",
        "REMINDER_SENT",
        "RESPONSIBLE_USER_ID",
        "STAGE_ID",
        "START_DATE",
        "STATUS",
        "TASK_ID",
        "TITLE"
})
public class Task {

    @JsonProperty("ASSIGNED_BY_USER_ID")
    private Integer aSSIGNEDBYUSERID;
    @JsonProperty("ASSIGNED_DATE_UTC")
    private String aSSIGNEDDATEUTC;
    @JsonProperty("ASSIGNED_TEAM_ID")
    private Integer aSSIGNEDTEAMID;
    @JsonProperty("CATEGORY_ID")
    private Integer cATEGORYID;
    @JsonProperty("COMPLETED")
    private Boolean cOMPLETED;
    @JsonProperty("COMPLETED_DATE_UTC")
    private String cOMPLETEDDATEUTC;
    @JsonProperty("CREATED_USER_ID")
    private Integer cREATEDUSERID;
    @JsonProperty("CUSTOMFIELDS")
    private List<CustomField> cUSTOMFIELDS = null;
    @JsonProperty("DATE_CREATED_UTC")
    private String dATECREATEDUTC;
    @JsonProperty("DATE_UPDATED_UTC")
    private String dATEUPDATEDUTC;
    @JsonProperty("DETAILS")
    private String dETAILS;
    @JsonProperty("DUE_DATE")
    private String dUEDATE;
    @JsonProperty("EMAIL_ID")
    private Integer eMAILID;
    @JsonProperty("MILESTONE_ID")
    private Integer mILESTONEID;
    @JsonProperty("OPPORTUNITY_ID")
    private Integer oPPORTUNITYID;
    @JsonProperty("OWNER_USER_ID")
    private Integer oWNERUSERID;
    @JsonProperty("OWNER_VISIBLE")
    private Boolean oWNERVISIBLE;
    @JsonProperty("PARENT_TASK_ID")
    private Integer pARENTTASKID;
    @JsonProperty("PERCENT_COMPLETE")
    private Integer pERCENTCOMPLETE;
    @JsonProperty("PRIORITY")
    private Integer pRIORITY;
    @JsonProperty("PROJECT_ID")
    private Integer pROJECTID;
    @JsonProperty("RECURRENCE")
    private String rECURRENCE;
    @JsonProperty("REMINDER_DATE_UTC")
    private String rEMINDERDATEUTC;
    @JsonProperty("REMINDER_SENT")
    private Boolean rEMINDERSENT;
    @JsonProperty("RESPONSIBLE_USER_ID")
    private Integer rESPONSIBLEUSERID;
    @JsonProperty("STAGE_ID")
    private Integer sTAGEID;
    @JsonProperty("START_DATE")
    private String sTARTDATE;
    @JsonProperty("STATUS")
    private String sTATUS;
    @JsonProperty("TASK_ID")
    private Integer tASKID;
    @JsonProperty("TITLE")
    private String tITLE;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ASSIGNED_BY_USER_ID")
    public Integer getASSIGNEDBYUSERID() {
        return aSSIGNEDBYUSERID;
    }

    @JsonProperty("ASSIGNED_BY_USER_ID")
    public void setASSIGNEDBYUSERID(Integer aSSIGNEDBYUSERID) {
        this.aSSIGNEDBYUSERID = aSSIGNEDBYUSERID;
    }

    @JsonProperty("ASSIGNED_DATE_UTC")
    public String getASSIGNEDDATEUTC() {
        return aSSIGNEDDATEUTC;
    }

    @JsonProperty("ASSIGNED_DATE_UTC")
    public void setASSIGNEDDATEUTC(String aSSIGNEDDATEUTC) {
        this.aSSIGNEDDATEUTC = aSSIGNEDDATEUTC;
    }

    @JsonProperty("ASSIGNED_TEAM_ID")
    public Integer getASSIGNEDTEAMID() {
        return aSSIGNEDTEAMID;
    }

    @JsonProperty("ASSIGNED_TEAM_ID")
    public void setASSIGNEDTEAMID(Integer aSSIGNEDTEAMID) {
        this.aSSIGNEDTEAMID = aSSIGNEDTEAMID;
    }

    @JsonProperty("CATEGORY_ID")
    public Integer getCATEGORYID() {
        return cATEGORYID;
    }

    @JsonProperty("CATEGORY_ID")
    public void setCATEGORYID(Integer cATEGORYID) {
        this.cATEGORYID = cATEGORYID;
    }

    @JsonProperty("COMPLETED")
    public Boolean getCOMPLETED() {
        return cOMPLETED;
    }

    @JsonProperty("COMPLETED")
    public void setCOMPLETED(Boolean cOMPLETED) {
        this.cOMPLETED = cOMPLETED;
    }

    @JsonProperty("COMPLETED_DATE_UTC")
    public String getCOMPLETEDDATEUTC() {
        return cOMPLETEDDATEUTC;
    }

    @JsonProperty("COMPLETED_DATE_UTC")
    public void setCOMPLETEDDATEUTC(String cOMPLETEDDATEUTC) {
        this.cOMPLETEDDATEUTC = cOMPLETEDDATEUTC;
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

    @JsonProperty("DETAILS")
    public String getDETAILS() {
        return dETAILS;
    }

    @JsonProperty("DETAILS")
    public void setDETAILS(String dETAILS) {
        this.dETAILS = dETAILS;
    }

    @JsonProperty("DUE_DATE")
    public String getDUEDATE() {
        return dUEDATE;
    }

    @JsonProperty("DUE_DATE")
    public void setDUEDATE(String dUEDATE) {
        this.dUEDATE = dUEDATE;
    }

    @JsonProperty("EMAIL_ID")
    public Integer getEMAILID() {
        return eMAILID;
    }

    @JsonProperty("EMAIL_ID")
    public void setEMAILID(Integer eMAILID) {
        this.eMAILID = eMAILID;
    }

    @JsonProperty("MILESTONE_ID")
    public Integer getMILESTONEID() {
        return mILESTONEID;
    }

    @JsonProperty("MILESTONE_ID")
    public void setMILESTONEID(Integer mILESTONEID) {
        this.mILESTONEID = mILESTONEID;
    }

    @JsonProperty("OPPORTUNITY_ID")
    public Integer getOPPORTUNITYID() {
        return oPPORTUNITYID;
    }

    @JsonProperty("OPPORTUNITY_ID")
    public void setOPPORTUNITYID(Integer oPPORTUNITYID) {
        this.oPPORTUNITYID = oPPORTUNITYID;
    }

    @JsonProperty("OWNER_USER_ID")
    public Integer getOWNERUSERID() {
        return oWNERUSERID;
    }

    @JsonProperty("OWNER_USER_ID")
    public void setOWNERUSERID(Integer oWNERUSERID) {
        this.oWNERUSERID = oWNERUSERID;
    }

    @JsonProperty("OWNER_VISIBLE")
    public Boolean getOWNERVISIBLE() {
        return oWNERVISIBLE;
    }

    @JsonProperty("OWNER_VISIBLE")
    public void setOWNERVISIBLE(Boolean oWNERVISIBLE) {
        this.oWNERVISIBLE = oWNERVISIBLE;
    }

    @JsonProperty("PARENT_TASK_ID")
    public Integer getPARENTTASKID() {
        return pARENTTASKID;
    }

    @JsonProperty("PARENT_TASK_ID")
    public void setPARENTTASKID(Integer pARENTTASKID) {
        this.pARENTTASKID = pARENTTASKID;
    }

    @JsonProperty("PERCENT_COMPLETE")
    public Integer getPERCENTCOMPLETE() {
        return pERCENTCOMPLETE;
    }

    @JsonProperty("PERCENT_COMPLETE")
    public void setPERCENTCOMPLETE(Integer pERCENTCOMPLETE) {
        this.pERCENTCOMPLETE = pERCENTCOMPLETE;
    }

    @JsonProperty("PRIORITY")
    public Integer getPRIORITY() {
        return pRIORITY;
    }

    @JsonProperty("PRIORITY")
    public void setPRIORITY(Integer pRIORITY) {
        this.pRIORITY = pRIORITY;
    }

    @JsonProperty("PROJECT_ID")
    public Integer getPROJECTID() {
        return pROJECTID;
    }

    @JsonProperty("PROJECT_ID")
    public void setPROJECTID(Integer pROJECTID) {
        this.pROJECTID = pROJECTID;
    }

    @JsonProperty("RECURRENCE")
    public String getRECURRENCE() {
        return rECURRENCE;
    }

    @JsonProperty("RECURRENCE")
    public void setRECURRENCE(String rECURRENCE) {
        this.rECURRENCE = rECURRENCE;
    }

    @JsonProperty("REMINDER_DATE_UTC")
    public String getREMINDERDATEUTC() {
        return rEMINDERDATEUTC;
    }

    @JsonProperty("REMINDER_DATE_UTC")
    public void setREMINDERDATEUTC(String rEMINDERDATEUTC) {
        this.rEMINDERDATEUTC = rEMINDERDATEUTC;
    }

    @JsonProperty("REMINDER_SENT")
    public Boolean getREMINDERSENT() {
        return rEMINDERSENT;
    }

    @JsonProperty("REMINDER_SENT")
    public void setREMINDERSENT(Boolean rEMINDERSENT) {
        this.rEMINDERSENT = rEMINDERSENT;
    }

    @JsonProperty("RESPONSIBLE_USER_ID")
    public Integer getRESPONSIBLEUSERID() {
        return rESPONSIBLEUSERID;
    }

    @JsonProperty("RESPONSIBLE_USER_ID")
    public void setRESPONSIBLEUSERID(Integer rESPONSIBLEUSERID) {
        this.rESPONSIBLEUSERID = rESPONSIBLEUSERID;
    }

    @JsonProperty("STAGE_ID")
    public Integer getSTAGEID() {
        return sTAGEID;
    }

    @JsonProperty("STAGE_ID")
    public void setSTAGEID(Integer sTAGEID) {
        this.sTAGEID = sTAGEID;
    }

    @JsonProperty("START_DATE")
    public String getSTARTDATE() {
        return sTARTDATE;
    }

    @JsonProperty("START_DATE")
    public void setSTARTDATE(String sTARTDATE) {
        this.sTARTDATE = sTARTDATE;
    }

    @JsonProperty("STATUS")
    public String getSTATUS() {
        return sTATUS;
    }

    @JsonProperty("STATUS")
    public void setSTATUS(String sTATUS) {
        this.sTATUS = sTATUS;
    }

    @JsonProperty("TASK_ID")
    public Integer getTASKID() {
        return tASKID;
    }

    @JsonProperty("TASK_ID")
    public void setTASKID(Integer tASKID) {
        this.tASKID = tASKID;
    }

    @JsonProperty("TITLE")
    public String getTITLE() {
        return tITLE;
    }

    @JsonProperty("TITLE")
    public void setTITLE(String tITLE) {
        this.tITLE = tITLE;
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
