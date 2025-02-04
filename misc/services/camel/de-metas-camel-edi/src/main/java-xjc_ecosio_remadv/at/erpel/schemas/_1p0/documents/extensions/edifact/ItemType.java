
package at.erpel.schemas._1p0.documents.extensions.edifact;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}TaxedAmount" minOccurs="0"/&gt;
 *         &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}Amount" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}DomesticAmount" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}CommissionBaseAmount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemType", propOrder = {
    "taxedAmount",
    "taxRate",
    "amount",
    "domesticAmount",
    "description",
    "commissionBaseAmount"
})
public class ItemType {

    @XmlElement(name = "TaxedAmount")
    protected BigDecimal taxedAmount;
    @XmlElement(name = "TaxRate")
    protected BigDecimal taxRate;
    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "DomesticAmount")
    protected DomesticAmountType domesticAmount;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "CommissionBaseAmount")
    protected MonetaryAmountType commissionBaseAmount;

    /**
     * The base amount for the tax (= the amount the tax must be applied to).
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxedAmount() {
        return taxedAmount;
    }

    /**
     * Sets the value of the taxedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxedAmount(BigDecimal value) {
        this.taxedAmount = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxRate(BigDecimal value) {
        this.taxRate = value;
    }

    /**
     * The tax amount. Calculated using: taxed amount x tax rate = tax amount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * The tax amount in the domestic currency. The domestic currency != invoice currency.
     * 
     * @return
     *     possible object is
     *     {@link DomesticAmountType }
     *     
     */
    public DomesticAmountType getDomesticAmount() {
        return domesticAmount;
    }

    /**
     * Sets the value of the domesticAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomesticAmountType }
     *     
     */
    public void setDomesticAmount(DomesticAmountType value) {
        this.domesticAmount = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Amount for calculation the document's commission amount.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getCommissionBaseAmount() {
        return commissionBaseAmount;
    }

    /**
     * Sets the value of the commissionBaseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setCommissionBaseAmount(MonetaryAmountType value) {
        this.commissionBaseAmount = value;
    }

}
