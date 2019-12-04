
package org.datacontract.schemas._2004._07.sealsignbsstypes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.sealsigndsstypes.SignatureProfile;
import org.datacontract.schemas._2004._07.sealsigndsstypes.TimestampReference;


/**
 * <p>Java class for BiometricSignatureReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BiometricSignatureReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="signatureAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signatureID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signatureProfile" type="{http://schemas.datacontract.org/2004/07/SealSignDSSTypes}SignatureProfile" minOccurs="0"/>
 *         &lt;element name="signatureStatus" type="{http://schemas.datacontract.org/2004/07/SealSignBSSTypes}BiometricVerificationStatus" minOccurs="0"/>
 *         &lt;element name="signatureType" type="{http://schemas.datacontract.org/2004/07/SealSignBSSTypes}BiometricSignatureType" minOccurs="0"/>
 *         &lt;element name="signatureUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signingTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="timestamp" type="{http://schemas.datacontract.org/2004/07/SealSignDSSTypes}TimestampReference" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BiometricSignatureReference", propOrder = {
    "score",
    "signatureAccount",
    "signatureID",
    "signatureProfile",
    "signatureStatus",
    "signatureType",
    "signatureUserName",
    "signingTime",
    "timestamp",
    "version"
})
public class BiometricSignatureReference {

    protected Double score;
    @XmlElementRef(name = "signatureAccount", namespace = "http://schemas.datacontract.org/2004/07/SealSignBSSTypes", type = JAXBElement.class)
    protected JAXBElement<String> signatureAccount;
    @XmlElementRef(name = "signatureID", namespace = "http://schemas.datacontract.org/2004/07/SealSignBSSTypes", type = JAXBElement.class)
    protected JAXBElement<String> signatureID;
    protected SignatureProfile signatureProfile;
    protected BiometricVerificationStatus signatureStatus;
    protected BiometricSignatureType signatureType;
    @XmlElementRef(name = "signatureUserName", namespace = "http://schemas.datacontract.org/2004/07/SealSignBSSTypes", type = JAXBElement.class)
    protected JAXBElement<String> signatureUserName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signingTime;
    @XmlElementRef(name = "timestamp", namespace = "http://schemas.datacontract.org/2004/07/SealSignBSSTypes", type = JAXBElement.class)
    protected JAXBElement<TimestampReference> timestamp;
    @XmlElementRef(name = "version", namespace = "http://schemas.datacontract.org/2004/07/SealSignBSSTypes", type = JAXBElement.class)
    protected JAXBElement<String> version;

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setScore(Double value) {
        this.score = value;
    }

    /**
     * Gets the value of the signatureAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSignatureAccount() {
        return signatureAccount;
    }

    /**
     * Sets the value of the signatureAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSignatureAccount(JAXBElement<String> value) {
        this.signatureAccount = (value);
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
     *     {@link BiometricVerificationStatus }
     *     
     */
    public BiometricVerificationStatus getSignatureStatus() {
        return signatureStatus;
    }

    /**
     * Sets the value of the signatureStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiometricVerificationStatus }
     *     
     */
    public void setSignatureStatus(BiometricVerificationStatus value) {
        this.signatureStatus = value;
    }

    /**
     * Gets the value of the signatureType property.
     * 
     * @return
     *     possible object is
     *     {@link BiometricSignatureType }
     *     
     */
    public BiometricSignatureType getSignatureType() {
        return signatureType;
    }

    /**
     * Sets the value of the signatureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiometricSignatureType }
     *     
     */
    public void setSignatureType(BiometricSignatureType value) {
        this.signatureType = value;
    }

    /**
     * Gets the value of the signatureUserName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSignatureUserName() {
        return signatureUserName;
    }

    /**
     * Sets the value of the signatureUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSignatureUserName(JAXBElement<String> value) {
        this.signatureUserName = (value);
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
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimestampReference }{@code >}
     *     
     */
    public JAXBElement<TimestampReference> getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimestampReference }{@code >}
     *     
     */
    public void setTimestamp(JAXBElement<TimestampReference> value) {
        this.timestamp = (value);
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVersion(JAXBElement<String> value) {
        this.version = (value);
    }

}
