
package integrations.pojo.insightly.quoteLineItems;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "QUOTATION_ITEM_ID",
        "OPPORTUNITY_ITEM_ID",
        "PRICEBOOK_ENTRY_ID",
        "DESCRIPTION",
        "CURRENCY_CODE",
        "QUANTITY",
        "LIST_PRICE",
        "UNIT_PRICE",
        "SUBTOTAL",
        "DISCOUNT",
        "TOTAL_PRICE",
        "DATE_CREATED_UTC",
        "DATE_UPDATED_UTC",
        "SORT_ORDER"
})
public class QuoteLineItem {

    @JsonProperty("QUOTATION_ITEM_ID")
    private Integer qUOTATIONITEMID;
    @JsonProperty("OPPORTUNITY_ITEM_ID")
    private Integer oPPORTUNITYITEMID;
    @JsonProperty("PRICEBOOK_ENTRY_ID")
    private Integer pRICEBOOKENTRYID;
    @JsonProperty("DESCRIPTION")
    private String dESCRIPTION;
    @JsonProperty("CURRENCY_CODE")
    private String cURRENCYCODE;
    @JsonProperty("QUANTITY")
    private String qUANTITY;
    @JsonProperty("LIST_PRICE")
    private String lISTPRICE;
    @JsonProperty("UNIT_PRICE")
    private String uNITPRICE;
    @JsonProperty("SUBTOTAL")
    private String sUBTOTAL;
    @JsonProperty("DISCOUNT")
    private String dISCOUNT;
    @JsonProperty("TOTAL_PRICE")
    private String tOTALPRICE;
    @JsonProperty("DATE_CREATED_UTC")
    private String dATECREATEDUTC;
    @JsonProperty("DATE_UPDATED_UTC")
    private String dATEUPDATEDUTC;
    @JsonProperty("SORT_ORDER")
    private Integer sORTORDER;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("QUOTATION_ITEM_ID")
    public Integer getQUOTATIONITEMID() {
        return qUOTATIONITEMID;
    }

    @JsonProperty("QUOTATION_ITEM_ID")
    public void setQUOTATIONITEMID(Integer qUOTATIONITEMID) {
        this.qUOTATIONITEMID = qUOTATIONITEMID;
    }

    @JsonProperty("OPPORTUNITY_ITEM_ID")
    public Integer getOPPORTUNITYITEMID() {
        return oPPORTUNITYITEMID;
    }

    @JsonProperty("OPPORTUNITY_ITEM_ID")
    public void setOPPORTUNITYITEMID(Integer oPPORTUNITYITEMID) {
        this.oPPORTUNITYITEMID = oPPORTUNITYITEMID;
    }

    @JsonProperty("PRICEBOOK_ENTRY_ID")
    public Integer getPRICEBOOKENTRYID() {
        return pRICEBOOKENTRYID;
    }

    @JsonProperty("PRICEBOOK_ENTRY_ID")
    public void setPRICEBOOKENTRYID(Integer pRICEBOOKENTRYID) {
        this.pRICEBOOKENTRYID = pRICEBOOKENTRYID;
    }

    @JsonProperty("DESCRIPTION")
    public String getDESCRIPTION() {
        return dESCRIPTION;
    }

    @JsonProperty("DESCRIPTION")
    public void setDESCRIPTION(String dESCRIPTION) {
        this.dESCRIPTION = dESCRIPTION;
    }

    @JsonProperty("CURRENCY_CODE")
    public String getCURRENCYCODE() {
        return cURRENCYCODE;
    }

    @JsonProperty("CURRENCY_CODE")
    public void setCURRENCYCODE(String cURRENCYCODE) {
        this.cURRENCYCODE = cURRENCYCODE;
    }

    @JsonProperty("QUANTITY")
    public String getQUANTITY() {
        return qUANTITY;
    }

    @JsonProperty("QUANTITY")
    public void setQUANTITY(String qUANTITY) {
        this.qUANTITY = qUANTITY;
    }

    @JsonProperty("LIST_PRICE")
    public String getLISTPRICE() {
        return lISTPRICE;
    }

    @JsonProperty("LIST_PRICE")
    public void setLISTPRICE(String lISTPRICE) {
        this.lISTPRICE = lISTPRICE;
    }

    @JsonProperty("UNIT_PRICE")
    public String getUNITPRICE() {
        return uNITPRICE;
    }

    @JsonProperty("UNIT_PRICE")
    public void setUNITPRICE(String uNITPRICE) {
        this.uNITPRICE = uNITPRICE;
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

    @JsonProperty("SORT_ORDER")
    public Integer getSORTORDER() {
        return sORTORDER;
    }

    @JsonProperty("SORT_ORDER")
    public void setSORTORDER(Integer sORTORDER) {
        this.sORTORDER = sORTORDER;
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
