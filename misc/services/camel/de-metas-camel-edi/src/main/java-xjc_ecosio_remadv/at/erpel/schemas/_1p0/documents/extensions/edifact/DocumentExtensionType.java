
package at.erpel.schemas._1p0.documents.extensions.edifact;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Extension for specific document types.
 * 
 * <p>Java class for DocumentExtensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentExtensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}NumberOfPromotion" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}MessageFunction" minOccurs="0"/&gt;
 *         &lt;element name="ResponseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}FreeText" minOccurs="0"/&gt;
 *         &lt;element name="ORDERSExtension" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}ORDERSExtensionType" minOccurs="0"/&gt;
 *         &lt;element name="ORDRSPExtension" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}ORDRSPExtensionType" minOccurs="0"/&gt;
 *         &lt;element name="DESADVExtension" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}DESADVExtensionType" minOccurs="0"/&gt;
 *         &lt;element name="INVOICExtension" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}INVOICExtensionType" minOccurs="0"/&gt;
 *         &lt;element name="RECADVExtension" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}RECADVExtensionType" minOccurs="0"/&gt;
 *         &lt;element name="CONTRLExtension" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}CONTRLExtensionType" minOccurs="0"/&gt;
 *         &lt;element name="ControlTotal" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ControlTotalQualifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ControlTotalValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DocumentValidated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DocumentNameCoded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MessageReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}AdditionalBusinessPartner" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalDate" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}ExtendedDateType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SLSRPTExtension" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}SLSRPTExtensionType" minOccurs="0"/&gt;
 *         &lt;element name="REMADVExtension" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}REMADVExtensionType" minOccurs="0"/&gt;
 *         &lt;element name="ForecastExtension" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}ForecastExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentExtensionType", propOrder = {
    "numberOfPromotion",
    "messageFunction",
    "responseType",
    "freeText",
    "ordersExtension",
    "ordrspExtension",
    "desadvExtension",
    "invoicExtension",
    "recadvExtension",
    "contrlExtension",
    "controlTotal",
    "documentValidated",
    "documentNameCoded",
    "messageReferenceNumber",
    "additionalBusinessPartner",
    "additionalDate",
    "slsrptExtension",
    "remadvExtension",
    "forecastExtension"
})
public class DocumentExtensionType {

    @XmlElement(name = "NumberOfPromotion")
    protected String numberOfPromotion;
    @XmlElement(name = "MessageFunction")
    protected String messageFunction;
    @XmlElement(name = "ResponseType")
    protected String responseType;
    @XmlElement(name = "FreeText")
    protected FreeTextType freeText;
    @XmlElement(name = "ORDERSExtension")
    protected ORDERSExtensionType ordersExtension;
    @XmlElement(name = "ORDRSPExtension")
    protected ORDRSPExtensionType ordrspExtension;
    @XmlElement(name = "DESADVExtension")
    protected DESADVExtensionType desadvExtension;
    @XmlElement(name = "INVOICExtension")
    protected INVOICExtensionType invoicExtension;
    @XmlElement(name = "RECADVExtension")
    protected RECADVExtensionType recadvExtension;
    @XmlElement(name = "CONTRLExtension")
    protected CONTRLExtensionType contrlExtension;
    @XmlElement(name = "ControlTotal")
    protected List<DocumentExtensionType.ControlTotal> controlTotal;
    @XmlElement(name = "DocumentValidated", defaultValue = "false")
    protected Boolean documentValidated;
    @XmlElement(name = "DocumentNameCoded")
    protected String documentNameCoded;
    @XmlElement(name = "MessageReferenceNumber")
    protected String messageReferenceNumber;
    @XmlElement(name = "AdditionalBusinessPartner")
    protected List<BusinessEntityType> additionalBusinessPartner;
    @XmlElement(name = "AdditionalDate")
    protected List<ExtendedDateType> additionalDate;
    @XmlElement(name = "SLSRPTExtension")
    protected SLSRPTExtensionType slsrptExtension;
    @XmlElement(name = "REMADVExtension")
    protected REMADVExtensionType remadvExtension;
    @XmlElement(name = "ForecastExtension")
    protected ForecastExtensionType forecastExtension;

    /**
     * The relevant number of promotion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfPromotion() {
        return numberOfPromotion;
    }

    /**
     * Sets the value of the numberOfPromotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfPromotion(String value) {
        this.numberOfPromotion = value;
    }

    /**
     * The function of the order response. Coded value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageFunction() {
        return messageFunction;
    }

    /**
     * Sets the value of the messageFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageFunction(String value) {
        this.messageFunction = value;
    }

    /**
     * Gets the value of the responseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseType() {
        return responseType;
    }

    /**
     * Sets the value of the responseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseType(String value) {
        this.responseType = value;
    }

    /**
     * Additional free text.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextType }
     *     
     */
    public FreeTextType getFreeText() {
        return freeText;
    }

    /**
     * Sets the value of the freeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextType }
     *     
     */
    public void setFreeText(FreeTextType value) {
        this.freeText = value;
    }

    /**
     * Gets the value of the ordersExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ORDERSExtensionType }
     *     
     */
    public ORDERSExtensionType getORDERSExtension() {
        return ordersExtension;
    }

    /**
     * Sets the value of the ordersExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORDERSExtensionType }
     *     
     */
    public void setORDERSExtension(ORDERSExtensionType value) {
        this.ordersExtension = value;
    }

    /**
     * Gets the value of the ordrspExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ORDRSPExtensionType }
     *     
     */
    public ORDRSPExtensionType getORDRSPExtension() {
        return ordrspExtension;
    }

    /**
     * Sets the value of the ordrspExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORDRSPExtensionType }
     *     
     */
    public void setORDRSPExtension(ORDRSPExtensionType value) {
        this.ordrspExtension = value;
    }

    /**
     * Gets the value of the desadvExtension property.
     * 
     * @return
     *     possible object is
     *     {@link DESADVExtensionType }
     *     
     */
    public DESADVExtensionType getDESADVExtension() {
        return desadvExtension;
    }

    /**
     * Sets the value of the desadvExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link DESADVExtensionType }
     *     
     */
    public void setDESADVExtension(DESADVExtensionType value) {
        this.desadvExtension = value;
    }

    /**
     * Gets the value of the invoicExtension property.
     * 
     * @return
     *     possible object is
     *     {@link INVOICExtensionType }
     *     
     */
    public INVOICExtensionType getINVOICExtension() {
        return invoicExtension;
    }

    /**
     * Sets the value of the invoicExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link INVOICExtensionType }
     *     
     */
    public void setINVOICExtension(INVOICExtensionType value) {
        this.invoicExtension = value;
    }

    /**
     * Gets the value of the recadvExtension property.
     * 
     * @return
     *     possible object is
     *     {@link RECADVExtensionType }
     *     
     */
    public RECADVExtensionType getRECADVExtension() {
        return recadvExtension;
    }

    /**
     * Sets the value of the recadvExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link RECADVExtensionType }
     *     
     */
    public void setRECADVExtension(RECADVExtensionType value) {
        this.recadvExtension = value;
    }

    /**
     * Gets the value of the contrlExtension property.
     * 
     * @return
     *     possible object is
     *     {@link CONTRLExtensionType }
     *     
     */
    public CONTRLExtensionType getCONTRLExtension() {
        return contrlExtension;
    }

    /**
     * Sets the value of the contrlExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONTRLExtensionType }
     *     
     */
    public void setCONTRLExtension(CONTRLExtensionType value) {
        this.contrlExtension = value;
    }

    /**
     * Gets the value of the controlTotal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controlTotal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControlTotal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentExtensionType.ControlTotal }
     * 
     * 
     */
    public List<DocumentExtensionType.ControlTotal> getControlTotal() {
        if (controlTotal == null) {
            controlTotal = new ArrayList<DocumentExtensionType.ControlTotal>();
        }
        return this.controlTotal;
    }

    /**
     * Gets the value of the documentValidated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDocumentValidated() {
        return documentValidated;
    }

    /**
     * Sets the value of the documentValidated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDocumentValidated(Boolean value) {
        this.documentValidated = value;
    }

    /**
     * Gets the value of the documentNameCoded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNameCoded() {
        return documentNameCoded;
    }

    /**
     * Sets the value of the documentNameCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNameCoded(String value) {
        this.documentNameCoded = value;
    }

    /**
     * Gets the value of the messageReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageReferenceNumber() {
        return messageReferenceNumber;
    }

    /**
     * Sets the value of the messageReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageReferenceNumber(String value) {
        this.messageReferenceNumber = value;
    }

    /**
     * Used to provide details about additional business partners, which are not contained in the core schema, such as ultimate consignee, etc.Gets the value of the additionalBusinessPartner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalBusinessPartner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalBusinessPartner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessEntityType }
     * 
     * 
     */
    public List<BusinessEntityType> getAdditionalBusinessPartner() {
        if (additionalBusinessPartner == null) {
            additionalBusinessPartner = new ArrayList<BusinessEntityType>();
        }
        return this.additionalBusinessPartner;
    }

    /**
     * Gets the value of the additionalDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtendedDateType }
     * 
     * 
     */
    public List<ExtendedDateType> getAdditionalDate() {
        if (additionalDate == null) {
            additionalDate = new ArrayList<ExtendedDateType>();
        }
        return this.additionalDate;
    }

    /**
     * Gets the value of the slsrptExtension property.
     * 
     * @return
     *     possible object is
     *     {@link SLSRPTExtensionType }
     *     
     */
    public SLSRPTExtensionType getSLSRPTExtension() {
        return slsrptExtension;
    }

    /**
     * Sets the value of the slsrptExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link SLSRPTExtensionType }
     *     
     */
    public void setSLSRPTExtension(SLSRPTExtensionType value) {
        this.slsrptExtension = value;
    }

    /**
     * Gets the value of the remadvExtension property.
     * 
     * @return
     *     possible object is
     *     {@link REMADVExtensionType }
     *     
     */
    public REMADVExtensionType getREMADVExtension() {
        return remadvExtension;
    }

    /**
     * Sets the value of the remadvExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link REMADVExtensionType }
     *     
     */
    public void setREMADVExtension(REMADVExtensionType value) {
        this.remadvExtension = value;
    }

    /**
     * Gets the value of the forecastExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastExtensionType }
     *     
     */
    public ForecastExtensionType getForecastExtension() {
        return forecastExtension;
    }

    /**
     * Sets the value of the forecastExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastExtensionType }
     *     
     */
    public void setForecastExtension(ForecastExtensionType value) {
        this.forecastExtension = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ControlTotalQualifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ControlTotalValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "controlTotalQualifier",
        "controlTotalValue"
    })
    public static class ControlTotal {

        @XmlElement(name = "ControlTotalQualifier")
        protected String controlTotalQualifier;
        @XmlElement(name = "ControlTotalValue")
        protected String controlTotalValue;

        /**
         * Gets the value of the controlTotalQualifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getControlTotalQualifier() {
            return controlTotalQualifier;
        }

        /**
         * Sets the value of the controlTotalQualifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setControlTotalQualifier(String value) {
            this.controlTotalQualifier = value;
        }

        /**
         * Gets the value of the controlTotalValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getControlTotalValue() {
            return controlTotalValue;
        }

        /**
         * Sets the value of the controlTotalValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setControlTotalValue(String value) {
            this.controlTotalValue = value;
        }

    }

}
