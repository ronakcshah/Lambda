
package integrations.pojo.insightly.quotes;

import com.fasterxml.jackson.annotation.*;
import com.insightly.lambda.pojo.customFields.CustomField;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "QUOTE_ID",
        "QUOTATION_NAME",
        "OPPORTUNITY_ID",
        "CONTACT_ID",
        "ORGANISATION_ID",
        "PRICEBOOK_ID",
        "QUOTATION_NUMBER",
        "QUOTATION_DESCRIPTION",
        "QUOTATION_PHONE",
        "QUOTATION_EMAIL",
        "QUOTATION_FAX",
        "QUOTE_STATUS",
        "QUOTATION_EXPIRATION_DATE",
        "LINE_ITEM_COUNT",
        "QUOTATION_CURRENCY_CODE",
        "SUBTOTAL",
        "DISCOUNT",
        "TOTAL_PRICE",
        "SHIPPING_HANDLING",
        "TAX",
        "GRAND_TOTAL",
        "ADDRESS_BILLING_NAME",
        "ADDRESS_BILLING_STREET",
        "ADDRESS_BILLING_CITY",
        "ADDRESS_BILLING_STATE",
        "ADDRESS_BILLING_POSTCODE",
        "ADDRESS_BILLING_COUNTRY",
        "ADDRESS_SHIPPING_NAME",
        "ADDRESS_SHIPPING_STREET",
        "ADDRESS_SHIPPING_CITY",
        "ADDRESS_SHIPPING_STATE",
        "ADDRESS_SHIPPING_POSTCODE",
        "ADDRESS_SHIPPING_COUNTRY",
        "OWNER_USER_ID",
        "DATE_CREATED_UTC",
        "DATE_UPDATED_UTC",
        "CREATED_USER_ID",
        "CUSTOMFIELDS"
})
public class Quotation {

    @JsonProperty("QUOTE_ID")
    private Integer qUOTEID;
    @JsonProperty("QUOTATION_NAME")
    private String qUOTATIONNAME;
    @JsonProperty("OPPORTUNITY_ID")
    private Integer oPPORTUNITYID;
    @JsonProperty("CONTACT_ID")
    private Integer cONTACTID;
    @JsonProperty("ORGANISATION_ID")
    private Integer oRGANISATIONID;
    @JsonProperty("PRICEBOOK_ID")
    private Integer pRICEBOOKID;
    @JsonProperty("QUOTATION_NUMBER")
    private String qUOTATIONNUMBER;
    @JsonProperty("QUOTATION_DESCRIPTION")
    private String qUOTATIONDESCRIPTION;
    @JsonProperty("QUOTATION_PHONE")
    private String qUOTATIONPHONE;
    @JsonProperty("QUOTATION_EMAIL")
    private String qUOTATIONEMAIL;
    @JsonProperty("QUOTATION_FAX")
    private String qUOTATIONFAX;
    @JsonProperty("QUOTE_STATUS")
    private String qUOTESTATUS;
    @JsonProperty("QUOTATION_EXPIRATION_DATE")
    private String qUOTATIONEXPIRATIONDATE;
    @JsonProperty("LINE_ITEM_COUNT")
    private Integer lINEITEMCOUNT;
    @JsonProperty("QUOTATION_CURRENCY_CODE")
    private String qUOTATIONCURRENCYCODE;
    @JsonProperty("SUBTOTAL")
    private Integer sUBTOTAL;
    @JsonProperty("DISCOUNT")
    private Double dISCOUNT;
    @JsonProperty("TOTAL_PRICE")
    private Double tOTALPRICE;
    @JsonProperty("SHIPPING_HANDLING")
    private Object sHIPPINGHANDLING;
    @JsonProperty("TAX")
    private Object tAX;
    @JsonProperty("GRAND_TOTAL")
    private Double gRANDTOTAL;
    @JsonProperty("ADDRESS_BILLING_NAME")
    private String aDDRESSBILLINGNAME;
    @JsonProperty("ADDRESS_BILLING_STREET")
    private String aDDRESSBILLINGSTREET;
    @JsonProperty("ADDRESS_BILLING_CITY")
    private String aDDRESSBILLINGCITY;
    @JsonProperty("ADDRESS_BILLING_STATE")
    private String aDDRESSBILLINGSTATE;
    @JsonProperty("ADDRESS_BILLING_POSTCODE")
    private String aDDRESSBILLINGPOSTCODE;
    @JsonProperty("ADDRESS_BILLING_COUNTRY")
    private String aDDRESSBILLINGCOUNTRY;
    @JsonProperty("ADDRESS_SHIPPING_NAME")
    private String aDDRESSSHIPPINGNAME;
    @JsonProperty("ADDRESS_SHIPPING_STREET")
    private String aDDRESSSHIPPINGSTREET;
    @JsonProperty("ADDRESS_SHIPPING_CITY")
    private String aDDRESSSHIPPINGCITY;
    @JsonProperty("ADDRESS_SHIPPING_STATE")
    private String aDDRESSSHIPPINGSTATE;
    @JsonProperty("ADDRESS_SHIPPING_POSTCODE")
    private String aDDRESSSHIPPINGPOSTCODE;
    @JsonProperty("ADDRESS_SHIPPING_COUNTRY")
    private String aDDRESSSHIPPINGCOUNTRY;
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

    @JsonProperty("QUOTE_ID")
    public Integer getQUOTEID() {
        return qUOTEID;
    }

    @JsonProperty("QUOTE_ID")
    public void setQUOTEID(Integer qUOTEID) {
        this.qUOTEID = qUOTEID;
    }

    @JsonProperty("QUOTATION_NAME")
    public String getQUOTATIONNAME() {
        return qUOTATIONNAME;
    }

    @JsonProperty("QUOTATION_NAME")
    public void setQUOTATIONNAME(String qUOTATIONNAME) {
        this.qUOTATIONNAME = qUOTATIONNAME;
    }

    @JsonProperty("OPPORTUNITY_ID")
    public Integer getOPPORTUNITYID() {
        return oPPORTUNITYID;
    }

    @JsonProperty("OPPORTUNITY_ID")
    public void setOPPORTUNITYID(Integer oPPORTUNITYID) {
        this.oPPORTUNITYID = oPPORTUNITYID;
    }

    @JsonProperty("CONTACT_ID")
    public Integer getCONTACTID() {
        return cONTACTID;
    }

    @JsonProperty("CONTACT_ID")
    public void setCONTACTID(Integer cONTACTID) {
        this.cONTACTID = cONTACTID;
    }

    @JsonProperty("ORGANISATION_ID")
    public Integer getORGANISATIONID() {
        return oRGANISATIONID;
    }

    @JsonProperty("ORGANISATION_ID")
    public void setORGANISATIONID(Integer oRGANISATIONID) {
        this.oRGANISATIONID = oRGANISATIONID;
    }

    @JsonProperty("PRICEBOOK_ID")
    public Integer getPRICEBOOKID() {
        return pRICEBOOKID;
    }

    @JsonProperty("PRICEBOOK_ID")
    public void setPRICEBOOKID(Integer pRICEBOOKID) {
        this.pRICEBOOKID = pRICEBOOKID;
    }

    @JsonProperty("QUOTATION_NUMBER")
    public String getQUOTATIONNUMBER() {
        return qUOTATIONNUMBER;
    }

    @JsonProperty("QUOTATION_NUMBER")
    public void setQUOTATIONNUMBER(String qUOTATIONNUMBER) {
        this.qUOTATIONNUMBER = qUOTATIONNUMBER;
    }

    @JsonProperty("QUOTATION_DESCRIPTION")
    public String getQUOTATIONDESCRIPTION() {
        return qUOTATIONDESCRIPTION;
    }

    @JsonProperty("QUOTATION_DESCRIPTION")
    public void setQUOTATIONDESCRIPTION(String qUOTATIONDESCRIPTION) {
        this.qUOTATIONDESCRIPTION = qUOTATIONDESCRIPTION;
    }

    @JsonProperty("QUOTATION_PHONE")
    public String getQUOTATIONPHONE() {
        return qUOTATIONPHONE;
    }

    @JsonProperty("QUOTATION_PHONE")
    public void setQUOTATIONPHONE(String qUOTATIONPHONE) {
        this.qUOTATIONPHONE = qUOTATIONPHONE;
    }

    @JsonProperty("QUOTATION_EMAIL")
    public String getQUOTATIONEMAIL() {
        return qUOTATIONEMAIL;
    }

    @JsonProperty("QUOTATION_EMAIL")
    public void setQUOTATIONEMAIL(String qUOTATIONEMAIL) {
        this.qUOTATIONEMAIL = qUOTATIONEMAIL;
    }

    @JsonProperty("QUOTATION_FAX")
    public String getQUOTATIONFAX() {
        return qUOTATIONFAX;
    }

    @JsonProperty("QUOTATION_FAX")
    public void setQUOTATIONFAX(String qUOTATIONFAX) {
        this.qUOTATIONFAX = qUOTATIONFAX;
    }

    @JsonProperty("QUOTE_STATUS")
    public String getQUOTESTATUS() {
        return qUOTESTATUS;
    }

    @JsonProperty("QUOTE_STATUS")
    public void setQUOTESTATUS(String qUOTESTATUS) {
        this.qUOTESTATUS = qUOTESTATUS;
    }

    @JsonProperty("QUOTATION_EXPIRATION_DATE")
    public String getQUOTATIONEXPIRATIONDATE() {
        return qUOTATIONEXPIRATIONDATE;
    }

    @JsonProperty("QUOTATION_EXPIRATION_DATE")
    public void setQUOTATIONEXPIRATIONDATE(String qUOTATIONEXPIRATIONDATE) {
        this.qUOTATIONEXPIRATIONDATE = qUOTATIONEXPIRATIONDATE;
    }

    @JsonProperty("LINE_ITEM_COUNT")
    public Integer getLINEITEMCOUNT() {
        return lINEITEMCOUNT;
    }

    @JsonProperty("LINE_ITEM_COUNT")
    public void setLINEITEMCOUNT(Integer lINEITEMCOUNT) {
        this.lINEITEMCOUNT = lINEITEMCOUNT;
    }

    @JsonProperty("QUOTATION_CURRENCY_CODE")
    public String getQUOTATIONCURRENCYCODE() {
        return qUOTATIONCURRENCYCODE;
    }

    @JsonProperty("QUOTATION_CURRENCY_CODE")
    public void setQUOTATIONCURRENCYCODE(String qUOTATIONCURRENCYCODE) {
        this.qUOTATIONCURRENCYCODE = qUOTATIONCURRENCYCODE;
    }

    @JsonProperty("SUBTOTAL")
    public Integer getSUBTOTAL() {
        return sUBTOTAL;
    }

    @JsonProperty("SUBTOTAL")
    public void setSUBTOTAL(Integer sUBTOTAL) {
        this.sUBTOTAL = sUBTOTAL;
    }

    @JsonProperty("DISCOUNT")
    public Double getDISCOUNT() {
        return dISCOUNT;
    }

    @JsonProperty("DISCOUNT")
    public void setDISCOUNT(Double dISCOUNT) {
        this.dISCOUNT = dISCOUNT;
    }

    @JsonProperty("TOTAL_PRICE")
    public Double getTOTALPRICE() {
        return tOTALPRICE;
    }

    @JsonProperty("TOTAL_PRICE")
    public void setTOTALPRICE(Double tOTALPRICE) {
        this.tOTALPRICE = tOTALPRICE;
    }

    @JsonProperty("SHIPPING_HANDLING")
    public Object getSHIPPINGHANDLING() {
        return sHIPPINGHANDLING;
    }

    @JsonProperty("SHIPPING_HANDLING")
    public void setSHIPPINGHANDLING(Object sHIPPINGHANDLING) {
        this.sHIPPINGHANDLING = sHIPPINGHANDLING;
    }

    @JsonProperty("TAX")
    public Object getTAX() {
        return tAX;
    }

    @JsonProperty("TAX")
    public void setTAX(Object tAX) {
        this.tAX = tAX;
    }

    @JsonProperty("GRAND_TOTAL")
    public Double getGRANDTOTAL() {
        return gRANDTOTAL;
    }

    @JsonProperty("GRAND_TOTAL")
    public void setGRANDTOTAL(Double gRANDTOTAL) {
        this.gRANDTOTAL = gRANDTOTAL;
    }

    @JsonProperty("ADDRESS_BILLING_NAME")
    public String getADDRESSBILLINGNAME() {
        return aDDRESSBILLINGNAME;
    }

    @JsonProperty("ADDRESS_BILLING_NAME")
    public void setADDRESSBILLINGNAME(String aDDRESSBILLINGNAME) {
        this.aDDRESSBILLINGNAME = aDDRESSBILLINGNAME;
    }

    @JsonProperty("ADDRESS_BILLING_STREET")
    public String getADDRESSBILLINGSTREET() {
        return aDDRESSBILLINGSTREET;
    }

    @JsonProperty("ADDRESS_BILLING_STREET")
    public void setADDRESSBILLINGSTREET(String aDDRESSBILLINGSTREET) {
        this.aDDRESSBILLINGSTREET = aDDRESSBILLINGSTREET;
    }

    @JsonProperty("ADDRESS_BILLING_CITY")
    public String getADDRESSBILLINGCITY() {
        return aDDRESSBILLINGCITY;
    }

    @JsonProperty("ADDRESS_BILLING_CITY")
    public void setADDRESSBILLINGCITY(String aDDRESSBILLINGCITY) {
        this.aDDRESSBILLINGCITY = aDDRESSBILLINGCITY;
    }

    @JsonProperty("ADDRESS_BILLING_STATE")
    public String getADDRESSBILLINGSTATE() {
        return aDDRESSBILLINGSTATE;
    }

    @JsonProperty("ADDRESS_BILLING_STATE")
    public void setADDRESSBILLINGSTATE(String aDDRESSBILLINGSTATE) {
        this.aDDRESSBILLINGSTATE = aDDRESSBILLINGSTATE;
    }

    @JsonProperty("ADDRESS_BILLING_POSTCODE")
    public String getADDRESSBILLINGPOSTCODE() {
        return aDDRESSBILLINGPOSTCODE;
    }

    @JsonProperty("ADDRESS_BILLING_POSTCODE")
    public void setADDRESSBILLINGPOSTCODE(String aDDRESSBILLINGPOSTCODE) {
        this.aDDRESSBILLINGPOSTCODE = aDDRESSBILLINGPOSTCODE;
    }

    @JsonProperty("ADDRESS_BILLING_COUNTRY")
    public String getADDRESSBILLINGCOUNTRY() {
        return aDDRESSBILLINGCOUNTRY;
    }

    @JsonProperty("ADDRESS_BILLING_COUNTRY")
    public void setADDRESSBILLINGCOUNTRY(String aDDRESSBILLINGCOUNTRY) {
        this.aDDRESSBILLINGCOUNTRY = aDDRESSBILLINGCOUNTRY;
    }

    @JsonProperty("ADDRESS_SHIPPING_NAME")
    public String getADDRESSSHIPPINGNAME() {
        return aDDRESSSHIPPINGNAME;
    }

    @JsonProperty("ADDRESS_SHIPPING_NAME")
    public void setADDRESSSHIPPINGNAME(String aDDRESSSHIPPINGNAME) {
        this.aDDRESSSHIPPINGNAME = aDDRESSSHIPPINGNAME;
    }

    @JsonProperty("ADDRESS_SHIPPING_STREET")
    public String getADDRESSSHIPPINGSTREET() {
        return aDDRESSSHIPPINGSTREET;
    }

    @JsonProperty("ADDRESS_SHIPPING_STREET")
    public void setADDRESSSHIPPINGSTREET(String aDDRESSSHIPPINGSTREET) {
        this.aDDRESSSHIPPINGSTREET = aDDRESSSHIPPINGSTREET;
    }

    @JsonProperty("ADDRESS_SHIPPING_CITY")
    public String getADDRESSSHIPPINGCITY() {
        return aDDRESSSHIPPINGCITY;
    }

    @JsonProperty("ADDRESS_SHIPPING_CITY")
    public void setADDRESSSHIPPINGCITY(String aDDRESSSHIPPINGCITY) {
        this.aDDRESSSHIPPINGCITY = aDDRESSSHIPPINGCITY;
    }

    @JsonProperty("ADDRESS_SHIPPING_STATE")
    public String getADDRESSSHIPPINGSTATE() {
        return aDDRESSSHIPPINGSTATE;
    }

    @JsonProperty("ADDRESS_SHIPPING_STATE")
    public void setADDRESSSHIPPINGSTATE(String aDDRESSSHIPPINGSTATE) {
        this.aDDRESSSHIPPINGSTATE = aDDRESSSHIPPINGSTATE;
    }

    @JsonProperty("ADDRESS_SHIPPING_POSTCODE")
    public String getADDRESSSHIPPINGPOSTCODE() {
        return aDDRESSSHIPPINGPOSTCODE;
    }

    @JsonProperty("ADDRESS_SHIPPING_POSTCODE")
    public void setADDRESSSHIPPINGPOSTCODE(String aDDRESSSHIPPINGPOSTCODE) {
        this.aDDRESSSHIPPINGPOSTCODE = aDDRESSSHIPPINGPOSTCODE;
    }

    @JsonProperty("ADDRESS_SHIPPING_COUNTRY")
    public String getADDRESSSHIPPINGCOUNTRY() {
        return aDDRESSSHIPPINGCOUNTRY;
    }

    @JsonProperty("ADDRESS_SHIPPING_COUNTRY")
    public void setADDRESSSHIPPINGCOUNTRY(String aDDRESSSHIPPINGCOUNTRY) {
        this.aDDRESSSHIPPINGCOUNTRY = aDDRESSSHIPPINGCOUNTRY;
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
