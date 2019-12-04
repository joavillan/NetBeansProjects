
package org.datacontract.schemas._2004._07.sealsigndsstypes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignatureParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignatureParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pdfParameters" type="{http://schemas.datacontract.org/2004/07/SealSignDSSTypes}PDFSignatureParameters" minOccurs="0"/>
 *         &lt;element name="policyCMSQualifierURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policyDigest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policyIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signerRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureParameters", propOrder = {
    "city",
    "country",
    "pdfParameters",
    "policyCMSQualifierURI",
    "policyDigest",
    "policyIdentifier",
    "postalCode",
    "reason",
    "reference",
    "signerRole",
    "state"
})
public class SignatureParameters {

    @XmlElementRef(name = "city", namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", type = JAXBElement.class)
    protected JAXBElement<String> city;
    @XmlElementRef(name = "country", namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", type = JAXBElement.class)
    protected JAXBElement<String> country;
    @XmlElementRef(name = "pdfParameters", namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", type = JAXBElement.class)
    protected JAXBElement<PDFSignatureParameters> pdfParameters;
    @XmlElementRef(name = "policyCMSQualifierURI", namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", type = JAXBElement.class)
    protected JAXBElement<String> policyCMSQualifierURI;
    @XmlElementRef(name = "policyDigest", namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", type = JAXBElement.class)
    protected JAXBElement<String> policyDigest;
    @XmlElementRef(name = "policyIdentifier", namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", type = JAXBElement.class)
    protected JAXBElement<String> policyIdentifier;
    @XmlElementRef(name = "postalCode", namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", type = JAXBElement.class)
    protected JAXBElement<String> postalCode;
    @XmlElementRef(name = "reason", namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", type = JAXBElement.class)
    protected JAXBElement<String> reason;
    @XmlElementRef(name = "reference", namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", type = JAXBElement.class)
    protected JAXBElement<String> reference;
    @XmlElementRef(name = "signerRole", namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", type = JAXBElement.class)
    protected JAXBElement<String> signerRole;
    @XmlElementRef(name = "state", namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", type = JAXBElement.class)
    protected JAXBElement<String> state;

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCity(JAXBElement<String> value) {
        this.city = (value);
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountry(JAXBElement<String> value) {
        this.country = (value);
    }

    /**
     * Gets the value of the pdfParameters property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PDFSignatureParameters }{@code >}
     *     
     */
    public JAXBElement<PDFSignatureParameters> getPdfParameters() {
        return pdfParameters;
    }

    /**
     * Sets the value of the pdfParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PDFSignatureParameters }{@code >}
     *     
     */
    public void setPdfParameters(JAXBElement<PDFSignatureParameters> value) {
        this.pdfParameters = (value);
    }

    /**
     * Gets the value of the policyCMSQualifierURI property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyCMSQualifierURI() {
        return policyCMSQualifierURI;
    }

    /**
     * Sets the value of the policyCMSQualifierURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyCMSQualifierURI(JAXBElement<String> value) {
        this.policyCMSQualifierURI = (value);
    }

    /**
     * Gets the value of the policyDigest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyDigest() {
        return policyDigest;
    }

    /**
     * Sets the value of the policyDigest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyDigest(JAXBElement<String> value) {
        this.policyDigest = (value);
    }

    /**
     * Gets the value of the policyIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyIdentifier() {
        return policyIdentifier;
    }

    /**
     * Sets the value of the policyIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyIdentifier(JAXBElement<String> value) {
        this.policyIdentifier = (value);
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostalCode(JAXBElement<String> value) {
        this.postalCode = (value);
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReason(JAXBElement<String> value) {
        this.reason = (value);
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReference(JAXBElement<String> value) {
        this.reference = (value);
    }

    /**
     * Gets the value of the signerRole property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSignerRole() {
        return signerRole;
    }

    /**
     * Sets the value of the signerRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSignerRole(JAXBElement<String> value) {
        this.signerRole = (value);
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setState(JAXBElement<String> value) {
        this.state = (value);
    }

}
