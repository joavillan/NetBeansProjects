
package org.datacontract.schemas._2004._07.sealsigndsstypes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TimestampReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimestampReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="timestampSignatures" type="{http://schemas.datacontract.org/2004/07/SealSignDSSTypes}ArrayOfSignatureReference" minOccurs="0"/>
 *         &lt;element name="timestampSuitable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="timestampTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="timestampType" type="{http://schemas.datacontract.org/2004/07/SealSignDSSTypes}TimestampType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimestampReference", propOrder = {
    "timestampSignatures",
    "timestampSuitable",
    "timestampTime",
    "timestampType"
})
public class TimestampReference {

    @XmlElementRef(name = "timestampSignatures", namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", type = JAXBElement.class)
    protected JAXBElement<ArrayOfSignatureReference> timestampSignatures;
    protected Boolean timestampSuitable;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestampTime;
    protected TimestampType timestampType;

    /**
     * Gets the value of the timestampSignatures property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSignatureReference }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSignatureReference> getTimestampSignatures() {
        return timestampSignatures;
    }

    /**
     * Sets the value of the timestampSignatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSignatureReference }{@code >}
     *     
     */
    public void setTimestampSignatures(JAXBElement<ArrayOfSignatureReference> value) {
        this.timestampSignatures = (value);
    }

    /**
     * Gets the value of the timestampSuitable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimestampSuitable() {
        return timestampSuitable;
    }

    /**
     * Sets the value of the timestampSuitable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimestampSuitable(Boolean value) {
        this.timestampSuitable = value;
    }

    /**
     * Gets the value of the timestampTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestampTime() {
        return timestampTime;
    }

    /**
     * Sets the value of the timestampTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestampTime(XMLGregorianCalendar value) {
        this.timestampTime = value;
    }

    /**
     * Gets the value of the timestampType property.
     * 
     * @return
     *     possible object is
     *     {@link TimestampType }
     *     
     */
    public TimestampType getTimestampType() {
        return timestampType;
    }

    /**
     * Sets the value of the timestampType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimestampType }
     *     
     */
    public void setTimestampType(TimestampType value) {
        this.timestampType = value;
    }

}
