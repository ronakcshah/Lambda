
package integrations.pojo.insightly.opportunityLineItems;

import com.fasterxml.jackson.annotation.*;
import com.insightly.lambda.pojo.customFields.CustomField;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "OPPORTUNITY_ITEM_ID",
        "OPPORTUNITY_ID",
        "PRICEBOOK_ENTRY_ID",
        "CURRENCY_CODE",
        "UNIT_PRICE",
        "DESCRIPTION",
        "QUANTITY",
        "SERVICE_DATE",
        "TOTAL_PRICE",
        "DATE_CREATED_UTC",
        "DATE_UPDATED_UTC",
        "LIST_PRICE",
        "SUBTOTAL",
        "DISCOUNT",
        "CUSTOMFIELDS"
})
public class OpportunityLineItem {

    @JsonProperty("OPPORTUNITY_ITEM_ID")
    private Integer oPPORTUNITYITEMID;
    @JsonProperty("OPPORTUNITY_ID")
    private Integer oPPORTUNITYID;
    @JsonProperty("PRICEBOOK_ENTRY_ID")
    private Integer pRICEBOOKENTRYID;
    @JsonProperty("CURRENCY_CODE")
    private String cURRENCYCODE;
    @JsonProperty("UNIT_PRICE")
    private String uNITPRICE;
    @JsonProperty("DESCRIPTION")
    private String dESCRIPTION;
    @JsonProperty("QUANTITY")
    private String qUANTITY;
    @JsonProperty("SERVICE_DATE")
    private String sERVICEDATE;
    @JsonProperty("TOTAL_PRICE")
    private String tOTALPRICE;
    @JsonProperty("DATE_CREATED_UTC")
    private String dATECREATEDUTC;
    @JsonProperty("DATE_UPDATED_UTC")
    private String dATEUPDATEDUTC;
    @JsonProperty("LIST_PRICE")
    private String lISTPRICE;
    @JsonProperty("SUBTOTAL")
    private String sUBTOTAL;
    @JsonProperty("DISCOUNT")
    private String dISCOUNT;
    @JsonProperty("CUSTOMFIELDS")
    private List<CustomField> cUSTOMFIELDS = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("OPPORTUNITY_ITEM_ID")
    public Integer getOPPORTUNITYITEMID() {
        return oPPORTUNITYITEMID;
    }

    @JsonProperty("OPPORTUNITY_ITEM_ID")
    public void setOPPORTUNITYITEMID(Integer oPPORTUNITYITEMID) {
        this.oPPORTUNITYITEMID = oPPORTUNITYITEMID;
    }

    @JsonProperty("OPPORTUNITY_ID")
    public Integer getOPPORTUNITYID() {
        return oPPORTUNITYID;
    }

    @JsonProperty("OPPORTUNITY_ID")
    public void setOPPORTUNITYID(Integer oPPORTUNITYID) {
        this.oPPORTUNITYID = oPPORTUNITYID;
    }

    @JsonProperty("PRICEBOOK_ENTRY_ID")
    public Integer getPRICEBOOKENTRYID() {
        return pRICEBOOKENTRYID;
    }

    @JsonProperty("PRICEBOOK_ENTRY_ID")
    public void setPRICEBOOKENTRYID(Integer pRICEBOOKENTRYID) {
        this.pRICEBOOKENTRYID = pRICEBOOKENTRYID;
    }

    @JsonProperty("CURRENCY_CODE")
    public String getCURRENCYCODE() {
        return cURRENCYCODE;
    }

    @JsonProperty("CURRENCY_CODE")
    public void setCURRENCYCODE(String cURRENCYCODE) {
        this.cURRENCYCODE = cURRENCYCODE;
    }

    @JsonProperty("UNIT_PRICE")
    public String getUNITPRICE() {
        return uNITPRICE;
    }

    @JsonProperty("UNIT_PRICE")
    public void setUNITPRICE(String uNITPRICE) {
        this.uNITPRICE = uNITPRICE;
    }

    @JsonProperty("DESCRIPTION")
    public String getDESCRIPTION() {
        return dESCRIPTION;
    }

    @JsonProperty("DESCRIPTION")
    public void setDESCRIPTION(String dESCRIPTION) {
        this.dESCRIPTION = dESCRIPTION;
    }

    @JsonProperty("QUANTITY")
    public String getQUANTITY() {
        return qUANTITY;
    }

    @JsonProperty("QUANTITY")
    public void setQUANTITY(String qUANTITY) {
        this.qUANTITY = qUANTITY;
    }

    @JsonProperty("SERVICE_DATE")
    public String getSERVICEDATE() {
        return sERVICEDATE;
    }

    @JsonProperty("SERVICE_DATE")
    public void setSERVICEDATE(String sERVICEDATE) {
        this.sERVICEDATE = sERVICEDATE;
    }

    @JsonProperty("TOTAL_PRICE")
    public String getTOTALPRICE() {
        return tOTALPRICE;
    }

    @JsonProperty("TOTAL_PRICE")
    public void setTOTALPRICE(String tOTALPRICE) {
        this.tOTALPRICE = tOTALPRICE;
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

    @JsonProperty("LIST_PRICE")
    public String getLISTPRICE() {
        return lISTPRICE;
    }

    @JsonProperty("LIST_PRICE")
    public void setLISTPRICE(String lISTPRICE) {
        this.lISTPRICE = lISTPRICE;
    }

    @JsonProperty("SUBTOTAL")
    public String getSUBTOTAL() {
        return sUBTOTAL;
    }

    @JsonProperty("SUBTOTAL")
    public void setSUBTOTAL(String sUBTOTAL) {
        this.sUBTOTAL = sUBTOTAL;
    }

    @JsonProperty("DISCOUNT")
    public String getDISCOUNT() {
        return dISCOUNT;
    }

    @JsonProperty("DISCOUNT")
    public void setDISCOUNT(String dISCOUNT) {
        this.dISCOUNT = dISCOUNT;
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
