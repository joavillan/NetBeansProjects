
package org.datacontract.schemas._2004._07.sealsigndsstypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SignatureReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignatureReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="counterSignatures" type="{http://schemas.datacontract.org/2004/07/SealSignDSSTypes}ArrayOfSignatureReference" minOccurs="0"/>
 *         &lt;element name="hashAlgorithm" type="{http://schemas.datacontract.org/2004/07/SealSignDSSTypes}HashAlgorithm" minOccurs="0"/>
 *         &lt;element name="signatureCertificate" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="signatureFlags" type="{http://schemas.datacontract.org/2004/07/SealSignDSSTypes}SignatureFlags" minOccurs="0"/>
 *         &lt;element name="signatureID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signatureProfile" type="{http://schemas.datacontract.org/2004/07/SealSignDSSTypes}SignatureProfile" minOccurs="0"/>
 *         &lt;element name="signatureStatus" type="{http://schemas.datacontract.org/2004/07/SealSignDSSTypes}VerificationStatus" minOccurs="0"/>
 *         &lt;element name="signatureType" type="{http://schemas.datacontract.org/2004/07/SealSignDSSTypes}SignatureType" minOccurs="0"/>
 *         &lt;element name="signingTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="timestamps" type="{http://schemas.datacontract.org/2004/07/SealSignDSSTypes}ArrayOfTimestampReference" minOccurs="0"/>
 *         &lt;element name="validationTimestamps" type="{http://schemas.datacontract.org/2004/07/SealSignDSSTypes}ArrayOfTimestampReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureReference", propOrder = {
    "counterSignatures",
    "hashAlgorithm",
    "signatureCertificate",
    "signatureFlags",
    "signatureID",
    "signatureProfile",
    "signatureStatus",
    "signatureType",
    "signingTime",
    "timestamps",
    "validationTimestamps"
})
public class SignatureReference {

    @XmlElementRef(name = "counterSignatures", namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", type = JAXBElement.class)
    protected JAXBElement<ArrayOfSignatureReference> counterSignatures;
    protected HashAlgorithm hashAlgorithm;
    @XmlElementRef(name = "signatureCertificate", namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", type = JAXBElement.class)
    protected JAXBElement<byte[]> signatureCertificate;
    @XmlList
    protected List<String> signatureFlags;
    @XmlElementRef(name = "signatureID", namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", type = JAXBElement.class)
    protected JAXBElement<String> signatureID;
    protected SignatureProfile signatureProfile;
    protected VerificationStatus signatureStatus;
    protected SignatureType signatureType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signingTime;
    @XmlElementRef(name = "timestamps", namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", type = JAXBElement.class)
    protected JAXBElement<ArrayOfTimestampReference> timestamps;
    @XmlElementRef(name = "validationTimestamps", namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", type = JAXBElement.class)
    protected JAXBElement<ArrayOfTimestampReference> validationTimestamps;

    /**
     * Gets the value of the counterSignatures property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSignatureReference }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSignatureReference> getCounterSignatures() {
        return counterSignatures;
    }

    /**
     * Sets the value of the counterSignatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSignatureReference }{@code >}
     *     
     */
    public void setCounterSignatures(JAXBElement<ArrayOfSignatureReference> value) {
        this.counterSignatures = (value);
    }

    /**
     * Gets the value of the hashAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link HashAlgorithm }
     *     
     */
    public HashAlgorithm getHashAlgorithm() {
        return hashAlgorithm;
    }

    /**
     * Sets the value of the hashAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link HashAlgorithm }
     *     
     */
    public void setHashAlgorithm(HashAlgorithm value) {
        this.hashAlgorithm = value;
    }

    /**
     * Gets the value of the signatureCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getSignatureCertificate() {
        return signatureCertificate;
    }

    /**
     * Sets the value of the signatureCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setSignatureCertificate(JAXBElement<byte[]> value) {
        this.signatureCertificate = (value);
    }

    /**
     * Gets the value of the signatureFlags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signatureFlags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignatureFlags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSignatureFlags() {
        if (signatureFlags == null) {
            signatureFlags = new ArrayList<String>();
        }
        return this.signatureFlags;
    }

    /**
     * Gets the value of the signatureID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSignatureID() {
        return signatureID;
    }

    /**
     * Sets the value of the signatureID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSignatureID(JAXBElement<String> value) {
        this.signatureID = (value);
    }

    /**
     * Gets the value of the signatureProfile property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureProfile }
     *     
     */
    public SignatureProfile getSignatureProfile() {
        return signatureProfile;
    }

    /**
     * Sets the value of the signatureProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureProfile }
     *     
     */
    public void setSignatureProfile(SignatureProfile value) {
        this.signatureProfile = value;
    }

    /**
     * Gets the value of the signatureStatus property.
     * 
     * @return
     *     possible object is
     *     {@link VerificationStatus }
     *     
     */
    public VerificationStatus getSignatureStatus() {
        return signatureStatus;
    }

    /**
     * Sets the value of the signatureStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationStatus }
     *     
     */
    public void setSignatureStatus(VerificationStatus value) {
        this.signatureStatus = value;
    }

    /**
     * Gets the value of the signatureType property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignatureType() {
        return signatureType;
    }

    /**
     * Sets the value of the signatureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignatureType(SignatureType value) {
        this.signatureType = value;
    }

    /**
     * Gets the value of the signingTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSigningTime() {
        return signingTime;
    }

    /**
     * Sets the value of the signingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSigningTime(XMLGregorianCalendar value) {
        this.signingTime = value;
    }

    /**
     * Gets the value of the timestamps property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTimestampReference }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTimestampReference> getTimestamps() {
        return timestamps;
    }

    /**
     * Sets the value of the timestamps property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTimestampReference }{@code >}
     *     
     */
    public void setTimestamps(JAXBElement<ArrayOfTimestampReference> value) {
        this.timestamps = (value);
    }

    /**
     * Gets the value of the validationTimestamps property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTimestampReference }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTimestampReference> getValidationTimestamps() {
        return validationTimestamps;
    }

    /**
     * Sets the value of the validationTimestamps property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTimestampReference }{@code >}
     *     
     */
    public void setValidationTimestamps(JAXBElement<ArrayOfTimestampReference> value) {
        this.validationTimestamps = (value);
    }

}
