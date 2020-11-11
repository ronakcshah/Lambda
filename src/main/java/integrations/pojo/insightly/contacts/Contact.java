
package integrations.pojo.insightly.contacts;

import com.fasterxml.jackson.annotation.*;
import com.insightly.lambda.pojo.customFields.CustomField;
import com.insightly.lambda.pojo.tags.Tags;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "CONTACT_ID",
        "SALUTATION",
        "FIRST_NAME",
        "LAST_NAME",
        "IMAGE_URL",
        "BACKGROUND",
        "OWNER_USER_ID",
        "DATE_CREATED_UTC",
        "DATE_UPDATED_UTC",
        "SOCIAL_LINKEDIN",
        "SOCIAL_FACEBOOK",
        "SOCIAL_TWITTER",
        "DATE_OF_BIRTH",
        "PHONE",
        "PHONE_HOME",
        "PHONE_MOBILE",
        "PHONE_OTHER",
        "PHONE_ASSISTANT",
        "PHONE_FAX",
        "EMAIL_ADDRESS",
        "ASSISTANT_NAME",
        "ADDRESS_MAIL_STREET",
        "ADDRESS_MAIL_CITY",
        "ADDRESS_MAIL_STATE",
        "ADDRESS_MAIL_POSTCODE",
        "ADDRESS_MAIL_COUNTRY",
        "ADDRESS_OTHER_STREET",
        "ADDRESS_OTHER_CITY",
        "ADDRESS_OTHER_STATE",
        "ADDRESS_OTHER_POSTCODE",
        "ADDRESS_OTHER_COUNTRY",
        "LAST_ACTIVITY_DATE_UTC",
        "NEXT_ACTIVITY_DATE_UTC",
        "ORGANISATION_ID",
        "TITLE",
        "CUSTOMFIELDS",
        "TAGS",
        "DATES"
})
public class Contact {

    @JsonProperty("CONTACT_ID")
    private Long cONTACTID;
    @JsonProperty("SALUTATION")
    private Object sALUTATION;
    @JsonProperty("FIRST_NAME")
    private String fIRSTNAME;
    @JsonProperty("LAST_NAME")
    private String lASTNAME;
    @JsonProperty("IMAGE_URL")
    private Object iMAGEURL;
    @JsonProperty("BACKGROUND")
    private String bACKGROUND;
    @JsonProperty("OWNER_USER_ID")
    private Long oWNERUSERID;
    @JsonProperty("DATE_CREATED_UTC")
    private String dATECREATEDUTC;
    @JsonProperty("DATE_UPDATED_UTC")
    private String dATEUPDATEDUTC;
    @JsonProperty("SOCIAL_LINKEDIN")
    private String sOCIALLINKEDIN;
    @JsonProperty("SOCIAL_FACEBOOK")
    private String sOCIALFACEBOOK;
    @JsonProperty("SOCIAL_TWITTER")
    private Object sOCIALTWITTER;
    @JsonProperty("DATE_OF_BIRTH")
    private String dATEOFBIRTH;
    @JsonProperty("PHONE")
    private String pHONE;
    @JsonProperty("PHONE_HOME")
    private Object pHONEHOME;
    @JsonProperty("PHONE_MOBILE")
    private Object pHONEMOBILE;
    @JsonProperty("PHONE_OTHER")
    private Object pHONEOTHER;
    @JsonProperty("PHONE_ASSISTANT")
    private Object pHONEASSISTANT;
    @JsonProperty("PHONE_FAX")
    private Object pHONEFAX;
    @JsonProperty("EMAIL_ADDRESS")
    private String eMAILADDRESS;
    @JsonProperty("ASSISTANT_NAME")
    private Object aSSISTANTNAME;
    @JsonProperty("ADDRESS_MAIL_STREET")
    private String aDDRESSMAILSTREET;
    @JsonProperty("ADDRESS_MAIL_CITY")
    private String aDDRESSMAILCITY;
    @JsonProperty("ADDRESS_MAIL_STATE")
    private String aDDRESSMAILSTATE;
    @JsonProperty("ADDRESS_MAIL_POSTCODE")
    private String aDDRESSMAILPOSTCODE;
    @JsonProperty("ADDRESS_MAIL_COUNTRY")
    private String aDDRESSMAILCOUNTRY;
    @JsonProperty("ADDRESS_OTHER_STREET")
    private Object aDDRESSOTHERSTREET;
    @JsonProperty("ADDRESS_OTHER_CITY")
    private Object aDDRESSOTHERCITY;
    @JsonProperty("ADDRESS_OTHER_STATE")
    private Object aDDRESSOTHERSTATE;
    @JsonProperty("ADDRESS_OTHER_POSTCODE")
    private Object aDDRESSOTHERPOSTCODE;
    @JsonProperty("ADDRESS_OTHER_COUNTRY")
    private Object aDDRESSOTHERCOUNTRY;
    @JsonProperty("LAST_ACTIVITY_DATE_UTC")
    private String lASTACTIVITYDATEUTC;
    @JsonProperty("NEXT_ACTIVITY_DATE_UTC")
    private String nEXTACTIVITYDATEUTC;
    @JsonProperty("ORGANISATION_ID")
    private Long oRGANISATIONID;
    @JsonProperty("TITLE")
    private String tITLE;
    @JsonProperty("CUSTOMFIELDS")
    private List<CustomField> cUSTOMFIELDS = null;
    @JsonProperty("TAGS")
    private List<Tags> tAGS = null;
    @JsonProperty("DATES")
    private List<Contact_Date> dATES = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CONTACT_ID")
    public Long getCONTACTID() {
        return cONTACTID;
    }

    @JsonProperty("CONTACT_ID")
    public void setCONTACTID(Long cONTACTID) {
        this.cONTACTID = cONTACTID;
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

    @JsonProperty("IMAGE_URL")
    public Object getIMAGEURL() {
        return iMAGEURL;
    }

    @JsonProperty("IMAGE_URL")
    public void setIMAGEURL(Object iMAGEURL) {
        this.iMAGEURL = iMAGEURL;
    }

    @JsonProperty("BACKGROUND")
    public String getBACKGROUND() {
        return bACKGROUND;
    }

    @JsonProperty("BACKGROUND")
    public void setBACKGROUND(String bACKGROUND) {
        this.bACKGROUND = bACKGROUND;
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

    @JsonProperty("SOCIAL_LINKEDIN")
    public String getSOCIALLINKEDIN() {
        return sOCIALLINKEDIN;
    }

    @JsonProperty("SOCIAL_LINKEDIN")
    public void setSOCIALLINKEDIN(String sOCIALLINKEDIN) {
        this.sOCIALLINKEDIN = sOCIALLINKEDIN;
    }

    @JsonProperty("SOCIAL_FACEBOOK")
    public String getSOCIALFACEBOOK() {
        return sOCIALFACEBOOK;
    }

    @JsonProperty("SOCIAL_FACEBOOK")
    public void setSOCIALFACEBOOK(String sOCIALFACEBOOK) {
        this.sOCIALFACEBOOK = sOCIALFACEBOOK;
    }

    @JsonProperty("SOCIAL_TWITTER")
    public Object getSOCIALTWITTER() {
        return sOCIALTWITTER;
    }

    @JsonProperty("SOCIAL_TWITTER")
    public void setSOCIALTWITTER(Object sOCIALTWITTER) {
        this.sOCIALTWITTER = sOCIALTWITTER;
    }

    @JsonProperty("DATE_OF_BIRTH")
    public String getDATEOFBIRTH() {
        return dATEOFBIRTH;
    }

    @JsonProperty("DATE_OF_BIRTH")
    public void setDATEOFBIRTH(String dATEOFBIRTH) {
        this.dATEOFBIRTH = dATEOFBIRTH;
    }

    @JsonProperty("PHONE")
    public String getPHONE() {
        return pHONE;
    }

    @JsonProperty("PHONE")
    public void setPHONE(String pHONE) {
        this.pHONE = pHONE;
    }

    @JsonProperty("PHONE_HOME")
    public Object getPHONEHOME() {
        return pHONEHOME;
    }

    @JsonProperty("PHONE_HOME")
    public void setPHONEHOME(Object pHONEHOME) {
        this.pHONEHOME = pHONEHOME;
    }

    @JsonProperty("PHONE_MOBILE")
    public Object getPHONEMOBILE() {
        return pHONEMOBILE;
    }

    @JsonProperty("PHONE_MOBILE")
    public void setPHONEMOBILE(Object pHONEMOBILE) {
        this.pHONEMOBILE = pHONEMOBILE;
    }

    @JsonProperty("PHONE_OTHER")
    public Object getPHONEOTHER() {
        return pHONEOTHER;
    }

    @JsonProperty("PHONE_OTHER")
    public void setPHONEOTHER(Object pHONEOTHER) {
        this.pHONEOTHER = pHONEOTHER;
    }

    @JsonProperty("PHONE_ASSISTANT")
    public Object getPHONEASSISTANT() {
        return pHONEASSISTANT;
    }

    @JsonProperty("PHONE_ASSISTANT")
    public void setPHONEASSISTANT(Object pHONEASSISTANT) {
        this.pHONEASSISTANT = pHONEASSISTANT;
    }

    @JsonProperty("PHONE_FAX")
    public Object getPHONEFAX() {
        return pHONEFAX;
    }

    @JsonProperty("PHONE_FAX")
    public void setPHONEFAX(Object pHONEFAX) {
        this.pHONEFAX = pHONEFAX;
    }

    @JsonProperty("EMAIL_ADDRESS")
    public String getEMAILADDRESS() {
        return eMAILADDRESS;
    }

    @JsonProperty("EMAIL_ADDRESS")
    public void setEMAILADDRESS(String eMAILADDRESS) {
        this.eMAILADDRESS = eMAILADDRESS;
    }

    @JsonProperty("ASSISTANT_NAME")
    public Object getASSISTANTNAME() {
        return aSSISTANTNAME;
    }

    @JsonProperty("ASSISTANT_NAME")
    public void setASSISTANTNAME(Object aSSISTANTNAME) {
        this.aSSISTANTNAME = aSSISTANTNAME;
    }

    @JsonProperty("ADDRESS_MAIL_STREET")
    public String getADDRESSMAILSTREET() {
        return aDDRESSMAILSTREET;
    }

    @JsonProperty("ADDRESS_MAIL_STREET")
    public void setADDRESSMAILSTREET(String aDDRESSMAILSTREET) {
        this.aDDRESSMAILSTREET = aDDRESSMAILSTREET;
    }

    @JsonProperty("ADDRESS_MAIL_CITY")
    public String getADDRESSMAILCITY() {
        return aDDRESSMAILCITY;
    }

    @JsonProperty("ADDRESS_MAIL_CITY")
    public void setADDRESSMAILCITY(String aDDRESSMAILCITY) {
        this.aDDRESSMAILCITY = aDDRESSMAILCITY;
    }

    @JsonProperty("ADDRESS_MAIL_STATE")
    public String getADDRESSMAILSTATE() {
        return aDDRESSMAILSTATE;
    }

    @JsonProperty("ADDRESS_MAIL_STATE")
    public void setADDRESSMAILSTATE(String aDDRESSMAILSTATE) {
        this.aDDRESSMAILSTATE = aDDRESSMAILSTATE;
    }

    @JsonProperty("ADDRESS_MAIL_POSTCODE")
    public String getADDRESSMAILPOSTCODE() {
        return aDDRESSMAILPOSTCODE;
    }

    @JsonProperty("ADDRESS_MAIL_POSTCODE")
    public void setADDRESSMAILPOSTCODE(String aDDRESSMAILPOSTCODE) {
        this.aDDRESSMAILPOSTCODE = aDDRESSMAILPOSTCODE;
    }

    @JsonProperty("ADDRESS_MAIL_COUNTRY")
    public String getADDRESSMAILCOUNTRY() {
        return aDDRESSMAILCOUNTRY;
    }

    @JsonProperty("ADDRESS_MAIL_COUNTRY")
    public void setADDRESSMAILCOUNTRY(String aDDRESSMAILCOUNTRY) {
        this.aDDRESSMAILCOUNTRY = aDDRESSMAILCOUNTRY;
    }

    @JsonProperty("ADDRESS_OTHER_STREET")
    public Object getADDRESSOTHERSTREET() {
        return aDDRESSOTHERSTREET;
    }

    @JsonProperty("ADDRESS_OTHER_STREET")
    public void setADDRESSOTHERSTREET(Object aDDRESSOTHERSTREET) {
        this.aDDRESSOTHERSTREET = aDDRESSOTHERSTREET;
    }

    @JsonProperty("ADDRESS_OTHER_CITY")
    public Object getADDRESSOTHERCITY() {
        return aDDRESSOTHERCITY;
    }

    @JsonProperty("ADDRESS_OTHER_CITY")
    public void setADDRESSOTHERCITY(Object aDDRESSOTHERCITY) {
        this.aDDRESSOTHERCITY = aDDRESSOTHERCITY;
    }

    @JsonProperty("ADDRESS_OTHER_STATE")
    public Object getADDRESSOTHERSTATE() {
        return aDDRESSOTHERSTATE;
    }

    @JsonProperty("ADDRESS_OTHER_STATE")
    public void setADDRESSOTHERSTATE(Object aDDRESSOTHERSTATE) {
        this.aDDRESSOTHERSTATE = aDDRESSOTHERSTATE;
    }

    @JsonProperty("ADDRESS_OTHER_POSTCODE")
    public Object getADDRESSOTHERPOSTCODE() {
        return aDDRESSOTHERPOSTCODE;
    }

    @JsonProperty("ADDRESS_OTHER_POSTCODE")
    public void setADDRESSOTHERPOSTCODE(Object aDDRESSOTHERPOSTCODE) {
        this.aDDRESSOTHERPOSTCODE = aDDRESSOTHERPOSTCODE;
    }

    @JsonProperty("ADDRESS_OTHER_COUNTRY")
    public Object getADDRESSOTHERCOUNTRY() {
        return aDDRESSOTHERCOUNTRY;
    }

    @JsonProperty("ADDRESS_OTHER_COUNTRY")
    public void setADDRESSOTHERCOUNTRY(Object aDDRESSOTHERCOUNTRY) {
        this.aDDRESSOTHERCOUNTRY = aDDRESSOTHERCOUNTRY;
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

    @JsonProperty("ORGANISATION_ID")
    public Long getORGANISATIONID() {
        return oRGANISATIONID;
    }

    @JsonProperty("ORGANISATION_ID")
    public void setORGANISATIONID(Long oRGANISATIONID) {
        this.oRGANISATIONID = oRGANISATIONID;
    }

    @JsonProperty("TITLE")
    public String getTITLE() {
        return tITLE;
    }

    @JsonProperty("TITLE")
    public void setTITLE(String tITLE) {
        this.tITLE = tITLE;
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

    @JsonProperty("DATES")
    public List<Contact_Date> getDATES() {
        return dATES;
    }

    @JsonProperty("DATES")
    public void setDATES(List<Contact_Date> dATES) {
        this.dATES = dATES;
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
