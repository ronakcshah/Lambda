
package integrations.pojo.insightly.leads;

import com.fasterxml.jackson.annotation.*;
import com.insightly.lambda.pojo.customFields.CustomField;
import com.insightly.lambda.pojo.tags.Tags;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "LEAD_ID",
        "SALUTATION",
        "FIRST_NAME",
        "LAST_NAME",
        "LEAD_SOURCE_ID",
        "LEAD_STATUS_ID",
        "TITLE",
        "CONVERTED",
        "CONVERTED_CONTACT_ID",
        "CONVERTED_DATE_UTC",
        "CONVERTED_OPPORTUNITY_ID",
        "CONVERTED_ORGANISATION_ID",
        "DATE_CREATED_UTC",
        "DATE_UPDATED_UTC",
        "EMAIL",
        "EMPLOYEE_COUNT",
        "FAX",
        "INDUSTRY",
        "LEAD_DESCRIPTION",
        "LEAD_RATING",
        "MOBILE",
        "OWNER_USER_ID",
        "PHONE",
        "RESPONSIBLE_USER_ID",
        "WEBSITE",
        "ADDRESS_STREET",
        "ADDRESS_CITY",
        "ADDRESS_STATE",
        "ADDRESS_POSTCODE",
        "ADDRESS_COUNTRY",
        "LAST_ACTIVITY_DATE_UTC",
        "NEXT_ACTIVITY_DATE_UTC",
        "ORGANISATION_NAME",
        "IMAGE_URL",
        "CUSTOMFIELDS",
        "TAGS"
})
public class Lead {

    @JsonProperty("LEAD_ID")
    private Long lEADID;
    @JsonProperty("SALUTATION")
    private Object sALUTATION;
    @JsonProperty("FIRST_NAME")
    private String fIRSTNAME;
    @JsonProperty("LAST_NAME")
    private String lASTNAME;
    @JsonProperty("LEAD_SOURCE_ID")
    private Long lEADSOURCEID;
    @JsonProperty("LEAD_STATUS_ID")
    private Long lEADSTATUSID;
    @JsonProperty("TITLE")
    private String tITLE;
    @JsonProperty("CONVERTED")
    private Boolean cONVERTED;
    @JsonProperty("CONVERTED_CONTACT_ID")
    private Object cONVERTEDCONTACTID;
    @JsonProperty("CONVERTED_DATE_UTC")
    private Object cONVERTEDDATEUTC;
    @JsonProperty("CONVERTED_OPPORTUNITY_ID")
    private Object cONVERTEDOPPORTUNITYID;
    @JsonProperty("CONVERTED_ORGANISATION_ID")
    private Object cONVERTEDORGANISATIONID;
    @JsonProperty("DATE_CREATED_UTC")
    private String dATECREATEDUTC;
    @JsonProperty("DATE_UPDATED_UTC")
    private String dATEUPDATEDUTC;
    @JsonProperty("EMAIL")
    private String eMAIL;
    @JsonProperty("EMPLOYEE_COUNT")
    private Long eMPLOYEECOUNT;
    @JsonProperty("FAX")
    private Object fAX;
    @JsonProperty("INDUSTRY")
    private String iNDUSTRY;
    @JsonProperty("LEAD_DESCRIPTION")
    private String lEADDESCRIPTION;
    @JsonProperty("LEAD_RATING")
    private Long lEADRATING;
    @JsonProperty("MOBILE")
    private Object mOBILE;
    @JsonProperty("OWNER_USER_ID")
    private Long oWNERUSERID;
    @JsonProperty("PHONE")
    private String pHONE;
    @JsonProperty("RESPONSIBLE_USER_ID")
    private Long rESPONSIBLEUSERID;
    @JsonProperty("WEBSITE")
    private String wEBSITE;
    @JsonProperty("ADDRESS_STREET")
    private String aDDRESSSTREET;
    @JsonProperty("ADDRESS_CITY")
    private String aDDRESSCITY;
    @JsonProperty("ADDRESS_STATE")
    private String aDDRESSSTATE;
    @JsonProperty("ADDRESS_POSTCODE")
    private String aDDRESSPOSTCODE;
    @JsonProperty("ADDRESS_COUNTRY")
    private String aDDRESSCOUNTRY;
    @JsonProperty("LAST_ACTIVITY_DATE_UTC")
    private String lASTACTIVITYDATEUTC;
    @JsonProperty("NEXT_ACTIVITY_DATE_UTC")
    private String nEXTACTIVITYDATEUTC;
    @JsonProperty("ORGANISATION_NAME")
    private String oRGANISATIONNAME;
    @JsonProperty("IMAGE_URL")
    private Object iMAGEURL;
    @JsonProperty("CUSTOMFIELDS")
    private List<CustomField> cUSTOMFIELDS = null;
    @JsonProperty("TAGS")
    private List<Tags> tAGS = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("LEAD_ID")
    public Long getLEADID() {
        return lEADID;
    }

    @JsonProperty("LEAD_ID")
    public void setLEADID(Long lEADID) {
        this.lEADID = lEADID;
    }

    @JsonProperty("SALUTATION")
    public Object getSALUTATION() {
        return sALUTATION;
    }

    @JsonProperty("SALUTATION")
    public void setSALUTATION(Object sALUTATION) {
        this.sALUTATION = sALUTATION;
    }

    @JsonProperty("FIRST_NAME")
    public String getFIRSTNAME() {
        return fIRSTNAME;
    }

    @JsonProperty("FIRST_NAME")
    public void setFIRSTNAME(String fIRSTNAME) {
        this.fIRSTNAME = fIRSTNAME;
    }

    @JsonProperty("LAST_NAME")
    public String getLASTNAME() {
        return lASTNAME;
    }

    @JsonProperty("LAST_NAME")
    public void setLASTNAME(String lASTNAME) {
        this.lASTNAME = lASTNAME;
    }

    @JsonProperty("LEAD_SOURCE_ID")
    public Long getLEADSOURCEID() {
        return lEADSOURCEID;
    }

    @JsonProperty("LEAD_SOURCE_ID")
    public void setLEADSOURCEID(Long lEADSOURCEID) {
        this.lEADSOURCEID = lEADSOURCEID;
    }

    @JsonProperty("LEAD_STATUS_ID")
    public Long getLEADSTATUSID() {
        return lEADSTATUSID;
    }

    @JsonProperty("LEAD_STATUS_ID")
    public void setLEADSTATUSID(Long lEADSTATUSID) {
        this.lEADSTATUSID = lEADSTATUSID;
    }

    @JsonProperty("TITLE")
    public String getTITLE() {
        return tITLE;
    }

    @JsonProperty("TITLE")
    public void setTITLE(String tITLE) {
        this.tITLE = tITLE;
    }

    @JsonProperty("CONVERTED")
    public Boolean getCONVERTED() {
        return cONVERTED;
    }

    @JsonProperty("CONVERTED")
    public void setCONVERTED(Boolean cONVERTED) {
        this.cONVERTED = cONVERTED;
    }

    @JsonProperty("CONVERTED_CONTACT_ID")
    public Object getCONVERTEDCONTACTID() {
        return cONVERTEDCONTACTID;
    }

    @JsonProperty("CONVERTED_CONTACT_ID")
    public void setCONVERTEDCONTACTID(Object cONVERTEDCONTACTID) {
        this.cONVERTEDCONTACTID = cONVERTEDCONTACTID;
    }

    @JsonProperty("CONVERTED_DATE_UTC")
    public Object getCONVERTEDDATEUTC() {
        return cONVERTEDDATEUTC;
    }

    @JsonProperty("CONVERTED_DATE_UTC")
    public void setCONVERTEDDATEUTC(Object cONVERTEDDATEUTC) {
        this.cONVERTEDDATEUTC = cONVERTEDDATEUTC;
    }

    @JsonProperty("CONVERTED_OPPORTUNITY_ID")
    public Object getCONVERTEDOPPORTUNITYID() {
        return cONVERTEDOPPORTUNITYID;
    }

    @JsonProperty("CONVERTED_OPPORTUNITY_ID")
    public void setCONVERTEDOPPORTUNITYID(Object cONVERTEDOPPORTUNITYID) {
        this.cONVERTEDOPPORTUNITYID = cONVERTEDOPPORTUNITYID;
    }

    @JsonProperty("CONVERTED_ORGANISATION_ID")
    public Object getCONVERTEDORGANISATIONID() {
        return cONVERTEDORGANISATIONID;
    }

    @JsonProperty("CONVERTED_ORGANISATION_ID")
    public void setCONVERTEDORGANISATIONID(Object cONVERTEDORGANISATIONID) {
        this.cONVERTEDORGANISATIONID = cONVERTEDORGANISATIONID;
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

    @JsonProperty("EMAIL")
    public String getEMAIL() {
        return eMAIL;
    }

    @JsonProperty("EMAIL")
    public void setEMAIL(String eMAIL) {
        this.eMAIL = eMAIL;
    }

    @JsonProperty("EMPLOYEE_COUNT")
    public Long getEMPLOYEECOUNT() {
        return eMPLOYEECOUNT;
    }

    @JsonProperty("EMPLOYEE_COUNT")
    public void setEMPLOYEECOUNT(Long eMPLOYEECOUNT) {
        this.eMPLOYEECOUNT = eMPLOYEECOUNT;
    }

    @JsonProperty("FAX")
    public Object getFAX() {
        return fAX;
    }

    @JsonProperty("FAX")
    public void setFAX(Object fAX) {
        this.fAX = fAX;
    }

    @JsonProperty("INDUSTRY")
    public String getINDUSTRY() {
        return iNDUSTRY;
    }

    @JsonProperty("INDUSTRY")
    public void setINDUSTRY(String iNDUSTRY) {
        this.iNDUSTRY = iNDUSTRY;
    }

    @JsonProperty("LEAD_DESCRIPTION")
    public String getLEADDESCRIPTION() {
        return lEADDESCRIPTION;
    }

    @JsonProperty("LEAD_DESCRIPTION")
    public void setLEADDESCRIPTION(String lEADDESCRIPTION) {
        this.lEADDESCRIPTION = lEADDESCRIPTION;
    }

    @JsonProperty("LEAD_RATING")
    public Long getLEADRATING() {
        return lEADRATING;
    }

    @JsonProperty("LEAD_RATING")
    public void setLEADRATING(Long lEADRATING) {
        this.lEADRATING = lEADRATING;
    }

    @JsonProperty("MOBILE")
    public Object getMOBILE() {
        return mOBILE;
    }

    @JsonProperty("MOBILE")
    public void setMOBILE(Object mOBILE) {
        this.mOBILE = mOBILE;
    }

    @JsonProperty("OWNER_USER_ID")
    public Long getOWNERUSERID() {
        return oWNERUSERID;
    }

    @JsonProperty("OWNER_USER_ID")
    public void setOWNERUSERID(Long oWNERUSERID) {
        this.oWNERUSERID = oWNERUSERID;
    }

    @JsonProperty("PHONE")
    public String getPHONE() {
        return pHONE;
    }

    @JsonProperty("PHONE")
    public void setPHONE(String pHONE) {
        this.pHONE = pHONE;
    }

    @JsonProperty("RESPONSIBLE_USER_ID")
    public Long getRESPONSIBLEUSERID() {
        return rESPONSIBLEUSERID;
    }

    @JsonProperty("RESPONSIBLE_USER_ID")
    public void setRESPONSIBLEUSERID(Long rESPONSIBLEUSERID) {
        this.rESPONSIBLEUSERID = rESPONSIBLEUSERID;
    }

    @JsonProperty("WEBSITE")
    public String getWEBSITE() {
        return wEBSITE;
    }

    @JsonProperty("WEBSITE")
    public void setWEBSITE(String wEBSITE) {
        this.wEBSITE = wEBSITE;
    }

    @JsonProperty("ADDRESS_STREET")
    public String getADDRESSSTREET() {
        return aDDRESSSTREET;
    }

    @JsonProperty("ADDRESS_STREET")
    public void setADDRESSSTREET(String aDDRESSSTREET) {
        this.aDDRESSSTREET = aDDRESSSTREET;
    }

    @JsonProperty("ADDRESS_CITY")
    public String getADDRESSCITY() {
        return aDDRESSCITY;
    }

    @JsonProperty("ADDRESS_CITY")
    public void setADDRESSCITY(String aDDRESSCITY) {
        this.aDDRESSCITY = aDDRESSCITY;
    }

    @JsonProperty("ADDRESS_STATE")
    public String getADDRESSSTATE() {
        return aDDRESSSTATE;
    }

    @JsonProperty("ADDRESS_STATE")
    public void setADDRESSSTATE(String aDDRESSSTATE) {
        this.aDDRESSSTATE = aDDRESSSTATE;
    }

    @JsonProperty("ADDRESS_POSTCODE")
    public String getADDRESSPOSTCODE() {
        return aDDRESSPOSTCODE;
    }

    @JsonProperty("ADDRESS_POSTCODE")
    public void setADDRESSPOSTCODE(String aDDRESSPOSTCODE) {
        this.aDDRESSPOSTCODE = aDDRESSPOSTCODE;
    }

    @JsonProperty("ADDRESS_COUNTRY")
    public String getADDRESSCOUNTRY() {
        return aDDRESSCOUNTRY;
    }

    @JsonProperty("ADDRESS_COUNTRY")
    public void setADDRESSCOUNTRY(String aDDRESSCOUNTRY) {
        this.aDDRESSCOUNTRY = aDDRESSCOUNTRY;
    }

    @JsonProperty("LAST_ACTIVITY_DATE_UTC")
    public String getLASTACTIVITYDATEUTC() {
        return lASTACTIVITYDATEUTC;
    }

    @JsonProperty("LAST_ACTIVITY_DATE_UTC")
    public void setLASTACTIVITYDATEUTC(String lASTACTIVITYDATEUTC) {
        this.lASTACTIVITYDATEUTC = lASTACTIVITYDATEUTC;
    }

    @JsonProperty("NEXT_ACTIVITY_DATE_UTC")
    public String getNEXTACTIVITYDATEUTC() {
        return nEXTACTIVITYDATEUTC;
    }

    @JsonProperty("NEXT_ACTIVITY_DATE_UTC")
    public void setNEXTACTIVITYDATEUTC(String nEXTACTIVITYDATEUTC) {
        this.nEXTACTIVITYDATEUTC = nEXTACTIVITYDATEUTC;
    }

    @JsonProperty("ORGANISATION_NAME")
    public String getORGANISATIONNAME() {
        return oRGANISATIONNAME;
    }

    @JsonProperty("ORGANISATION_NAME")
    public void setORGANISATIONNAME(String oRGANISATIONNAME) {
        this.oRGANISATIONNAME = oRGANISATIONNAME;
    }

    @JsonProperty("IMAGE_URL")
    public Object getIMAGEURL() {
        return iMAGEURL;
    }

    @JsonProperty("IMAGE_URL")
    public void setIMAGEURL(Object iMAGEURL) {
        this.iMAGEURL = iMAGEURL;
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
