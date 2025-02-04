
package at.erpel.schemas._1p0.documents.extensions.edifact;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupplierExtensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplierExtensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}FiscalNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}RegisteredOfficeOfCompany" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}LegalFormOfCompany" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}TribnalPlaceRegistrationLocation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierExtensionType", propOrder = {
    "fiscalNumber",
    "registeredOfficeOfCompany",
    "legalFormOfCompany",
    "tribnalPlaceRegistrationLocation"
})
public class SupplierExtensionType {

    @XmlElement(name = "FiscalNumber")
    protected String fiscalNumber;
    @XmlElement(name = "RegisteredOfficeOfCompany")
    protected String registeredOfficeOfCompany;
    @XmlElement(name = "LegalFormOfCompany")
    protected String legalFormOfCompany;
    @XmlElement(name = "TribnalPlaceRegistrationLocation")
    protected String tribnalPlaceRegistrationLocation;

    /**
     * Fiscal number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiscalNumber() {
        return fiscalNumber;
    }

    /**
     * Sets the value of the fiscalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiscalNumber(String value) {
        this.fiscalNumber = value;
    }

    /**
     * Registered office of the company.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisteredOfficeOfCompany() {
        return registeredOfficeOfCompany;
    }

    /**
     * Sets the value of the registeredOfficeOfCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisteredOfficeOfCompany(String value) {
        this.registeredOfficeOfCompany = value;
    }

    /**
     * Legal form of the company.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalFormOfCompany() {
        return legalFormOfCompany;
    }

    /**
     * Sets the value of the legalFormOfCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalFormOfCompany(String value) {
        this.legalFormOfCompany = value;
    }

    /**
     * Place of the commercial register entry of the company.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTribnalPlaceRegistrationLocation() {
        return tribnalPlaceRegistrationLocation;
    }

    /**
     * Sets the value of the tribnalPlaceRegistrationLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTribnalPlaceRegistrationLocation(String value) {
        this.tribnalPlaceRegistrationLocation = value;
    }

}
