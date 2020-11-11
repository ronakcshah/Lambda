
package integrations.pojo.insightly.organizations;

import com.fasterxml.jackson.annotation.*;
import com.insightly.lambda.pojo.customFields.CustomField;
import com.insightly.lambda.pojo.tags.Tags;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ORGANISATION_ID",
        "ORGANISATION_NAME",
        "BACKGROUND",
        "IMAGE_URL",
        "OWNER_USER_ID",
        "DATE_CREATED_UTC",
        "DATE_UPDATED_UTC",
        "LAST_ACTIVITY_DATE_UTC",
        "NEXT_ACTIVITY_DATE_UTC",
        "PHONE",
        "PHONE_FAX",
        "WEBSITE",
        "ADDRESS_BILLING_STREET",
        "ADDRESS_BILLING_CITY",
        "ADDRESS_BILLING_STATE",
        "ADDRESS_BILLING_COUNTRY",
        "ADDRESS_BILLING_POSTCODE",
        "ADDRESS_SHIP_STREET",
        "ADDRESS_SHIP_CITY",
        "ADDRESS_SHIP_STATE",
        "ADDRESS_SHIP_POSTCODE",
        "ADDRESS_SHIP_COUNTRY",
        "SOCIAL_LINKEDIN",
        "SOCIAL_FACEBOOK",
        "SOCIAL_TWITTER",
        "CUSTOMFIELDS",
        "TAGS",
        "DATES",
        "EMAILDOMAINS"
})
public class Organization {

    @JsonProperty("ORGANISATION_ID")
    private Long oRGANISATIONID;
    @JsonProperty("ORGANISATION_NAME")
    private String oRGANISATIONNAME;
    @JsonProperty("BACKGROUND")
    private String bACKGROUND;
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
    @JsonProperty("PHONE")
    private String pHONE;
    @JsonProperty("PHONE_FAX")
    private Object pHONEFAX;
    @JsonProperty("WEBSITE")
    private String wEBSITE;
    @JsonProperty("ADDRESS_BILLING_STREET")
    private Object aDDRESSBILLINGSTREET;
    @JsonProperty("ADDRESS_BILLING_CITY")
    private Object aDDRESSBILLINGCITY;
    @JsonProperty("ADDRESS_BILLING_STATE")
    private Object aDDRESSBILLINGSTATE;
    @JsonProperty("ADDRESS_BILLING_COUNTRY")
    private Object aDDRESSBILLINGCOUNTRY;
    @JsonProperty("ADDRESS_BILLING_POSTCODE")
    private Object aDDRESSBILLINGPOSTCODE;
    @JsonProperty("ADDRESS_SHIP_STREET")
    private String aDDRESSSHIPSTREET;
    @JsonProperty("ADDRESS_SHIP_CITY")
    private String aDDRESSSHIPCITY;
    @JsonProperty("ADDRESS_SHIP_STATE")
    private String aDDRESSSHIPSTATE;
    @JsonProperty("ADDRESS_SHIP_POSTCODE")
    private String aDDRESSSHIPPOSTCODE;
    @JsonProperty("ADDRESS_SHIP_COUNTRY")
    private Object aDDRESSSHIPCOUNTRY;
    @JsonProperty("SOCIAL_LINKEDIN")
    private Object sOCIALLINKEDIN;
    @JsonProperty("SOCIAL_FACEBOOK")
    private Object sOCIALFACEBOOK;
    @JsonProperty("SOCIAL_TWITTER")
    private Object sOCIALTWITTER;
    @JsonProperty("CUSTOMFIELDS")
    private List<CustomField> cUSTOMFIELDS = null;
    @JsonProperty("TAGS")
    private List<Tags> tAGS = null;
    @JsonProperty("DATES")
    private List<Organization_Date> dATES = null;
    @JsonProperty("EMAILDOMAINS")
    private List<Organization_EmailDomain> eMAILDOMAINS = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ORGANISATION_ID")
    public Long getORGANISATIONID() {
        return oRGANISATIONID;
    }

    @JsonProperty("ORGANISATION_ID")
    public void setORGANISATIONID(Long oRGANISATIONID) {
        this.oRGANISATIONID = oRGANISATIONID;
    }

    @JsonProperty("ORGANISATION_NAME")
    public String getORGANISATIONNAME() {
        return oRGANISATIONNAME;
    }

    @JsonProperty("ORGANISATION_NAME")
    public void setORGANISATIONNAME(String oRGANISATIONNAME) {
        this.oRGANISATIONNAME = oRGANISATIONNAME;
    }

    @JsonProperty("BACKGROUND")
    public String getBACKGROUND() {
        return bACKGROUND;
    }

    @JsonProperty("BACKGROUND")
    public void setBACKGROUND(String bACKGROUND) {
        this.bACKGROUND = bACKGROUND;
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

    @JsonProperty("PHONE")
    public String getPHONE() {
        return pHONE;
    }

    @JsonProperty("PHONE")
    public void setPHONE(String pHONE) {
        this.pHONE = pHONE;
    }

    @JsonProperty("PHONE_FAX")
    public Object getPHONEFAX() {
        return pHONEFAX;
    }

    @JsonProperty("PHONE_FAX")
    public void setPHONEFAX(Object pHONEFAX) {
        this.pHONEFAX = pHONEFAX;
    }

    @JsonProperty("WEBSITE")
    public String getWEBSITE() {
        return wEBSITE;
    }

    @JsonProperty("WEBSITE")
    public void setWEBSITE(String wEBSITE) {
        this.wEBSITE = wEBSITE;
    }

    @JsonProperty("ADDRESS_BILLING_STREET")
    public Object getADDRESSBILLINGSTREET() {
        return aDDRESSBILLINGSTREET;
    }

    @JsonProperty("ADDRESS_BILLING_STREET")
    public void setADDRESSBILLINGSTREET(Object aDDRESSBILLINGSTREET) {
        this.aDDRESSBILLINGSTREET = aDDRESSBILLINGSTREET;
    }

    @JsonProperty("ADDRESS_BILLING_CITY")
    public Object getADDRESSBILLINGCITY() {
        return aDDRESSBILLINGCITY;
    }

    @JsonProperty("ADDRESS_BILLING_CITY")
    public void setADDRESSBILLINGCITY(Object aDDRESSBILLINGCITY) {
        this.aDDRESSBILLINGCITY = aDDRESSBILLINGCITY;
    }

    @JsonProperty("ADDRESS_BILLING_STATE")
    public Object getADDRESSBILLINGSTATE() {
        return aDDRESSBILLINGSTATE;
    }

    @JsonProperty("ADDRESS_BILLING_STATE")
    public void setADDRESSBILLINGSTATE(Object aDDRESSBILLINGSTATE) {
        this.aDDRESSBILLINGSTATE = aDDRESSBILLINGSTATE;
    }

    @JsonProperty("ADDRESS_BILLING_COUNTRY")
    public Object getADDRESSBILLINGCOUNTRY() {
        return aDDRESSBILLINGCOUNTRY;
    }

    @JsonProperty("ADDRESS_BILLING_COUNTRY")
    public void setADDRESSBILLINGCOUNTRY(Object aDDRESSBILLINGCOUNTRY) {
        this.aDDRESSBILLINGCOUNTRY = aDDRESSBILLINGCOUNTRY;
    }

    @JsonProperty("ADDRESS_BILLING_POSTCODE")
    public Object getADDRESSBILLINGPOSTCODE() {
        return aDDRESSBILLINGPOSTCODE;
    }

    @JsonProperty("ADDRESS_BILLING_POSTCODE")
    public void setADDRESSBILLINGPOSTCODE(Object aDDRESSBILLINGPOSTCODE) {
        this.aDDRESSBILLINGPOSTCODE = aDDRESSBILLINGPOSTCODE;
    }

    @JsonProperty("ADDRESS_SHIP_STREET")
    public String getADDRESSSHIPSTREET() {
        return aDDRESSSHIPSTREET;
    }

    @JsonProperty("ADDRESS_SHIP_STREET")
    public void setADDRESSSHIPSTREET(String aDDRESSSHIPSTREET) {
        this.aDDRESSSHIPSTREET = aDDRESSSHIPSTREET;
    }

    @JsonProperty("ADDRESS_SHIP_CITY")
    public String getADDRESSSHIPCITY() {
        return aDDRESSSHIPCITY;
    }

    @JsonProperty("ADDRESS_SHIP_CITY")
    public void setADDRESSSHIPCITY(String aDDRESSSHIPCITY) {
        this.aDDRESSSHIPCITY = aDDRESSSHIPCITY;
    }

    @JsonProperty("ADDRESS_SHIP_STATE")
    public String getADDRESSSHIPSTATE() {
        return aDDRESSSHIPSTATE;
    }

    @JsonProperty("ADDRESS_SHIP_STATE")
    public void setADDRESSSHIPSTATE(String aDDRESSSHIPSTATE) {
        this.aDDRESSSHIPSTATE = aDDRESSSHIPSTATE;
    }

    @JsonProperty("ADDRESS_SHIP_POSTCODE")
    public String getADDRESSSHIPPOSTCODE() {
        return aDDRESSSHIPPOSTCODE;
    }

    @JsonProperty("ADDRESS_SHIP_POSTCODE")
    public void setADDRESSSHIPPOSTCODE(String aDDRESSSHIPPOSTCODE) {
        this.aDDRESSSHIPPOSTCODE = aDDRESSSHIPPOSTCODE;
    }

    @JsonProperty("ADDRESS_SHIP_COUNTRY")
    public Object getADDRESSSHIPCOUNTRY() {
        return aDDRESSSHIPCOUNTRY;
    }

    @JsonProperty("ADDRESS_SHIP_COUNTRY")
    public void setADDRESSSHIPCOUNTRY(Object aDDRESSSHIPCOUNTRY) {
        this.aDDRESSSHIPCOUNTRY = aDDRESSSHIPCOUNTRY;
    }

    @JsonProperty("SOCIAL_LINKEDIN")
    public Object getSOCIALLINKEDIN() {
        return sOCIALLINKEDIN;
    }

    @JsonProperty("SOCIAL_LINKEDIN")
    public void setSOCIALLINKEDIN(Object sOCIALLINKEDIN) {
        this.sOCIALLINKEDIN = sOCIALLINKEDIN;
    }

    @JsonProperty("SOCIAL_FACEBOOK")
    public Object getSOCIALFACEBOOK() {
        return sOCIALFACEBOOK;
    }

    @JsonProperty("SOCIAL_FACEBOOK")
    public void setSOCIALFACEBOOK(Object sOCIALFACEBOOK) {
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
    public List<Organization_Date> getDATES() {
        return dATES;
    }

    @JsonProperty("DATES")
    public void setDATES(List<Organization_Date> dATES) {
        this.dATES = dATES;
    }

    @JsonProperty("EMAILDOMAINS")
    public List<Organization_EmailDomain> getEMAILDOMAINS() {
        return eMAILDOMAINS;
    }

    @JsonProperty("EMAILDOMAINS")
    public void setEMAILDOMAINS(List<Organization_EmailDomain> eMAILDOMAINS) {
        this.eMAILDOMAINS = eMAILDOMAINS;
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
