
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.sealsignbsstypes.BiometricSignatureType;
import org.datacontract.schemas._2004._07.sealsignbsstypes.BiometricVerificationParameters;
import org.datacontract.schemas._2004._07.sealsigndsstypes.SignatureProfile;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="signatureProfile" type="{http://schemas.datacontract.org/2004/07/SealSignDSSTypes}SignatureProfile" minOccurs="0"/>
 *         &lt;element name="biometricSignatureType" type="{http://schemas.datacontract.org/2004/07/SealSignBSSTypes}BiometricSignatureType" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="biometricOptions" type="{http://schemas.datacontract.org/2004/07/SealSignBSSTypes}BiometricVerificationFlags" minOccurs="0"/>
 *         &lt;element name="biometricParameters" type="{http://schemas.datacontract.org/2004/07/SealSignBSSTypes}BiometricVerificationParameters" minOccurs="0"/>
 *         &lt;element name="biometricState" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="detachedSignature" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="document" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "signatureProfile",
    "biometricSignatureType",
    "id",
    "account",
    "biometricOptions",
    "biometricParameters",
    "biometricState",
    "detachedSignature",
    "document"
})
@XmlRootElement(name = "Verify")
public class Verify {

    protected SignatureProfile signatureProfile;
    protected BiometricSignatureType biometricSignatureType;
    @XmlElementRef(name = "id", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> id;
    @XmlElementRef(name = "account", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> account;
    @XmlList
    protected List<String> biometricOptions;
    @XmlElementRef(name = "biometricParameters", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<BiometricVerificationParameters> biometricParameters;
    @XmlElementRef(name = "biometricState", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<byte[]> biometricState;
    @XmlElementRef(name = "detachedSignature", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<byte[]> detachedSignature;
    @XmlElementRef(name = "document", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<byte[]> document;

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
     * Gets the value of the biometricSignatureType property.
     * 
     * @return
     *     possible object is
     *     {@link BiometricSignatureType }
     *     
     */
    public BiometricSignatureType getBiometricSignatureType() {
        return biometricSignatureType;
    }

    /**
     * Sets the value of the biometricSignatureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiometricSignatureType }
     *     
     */
    public void setBiometricSignatureType(BiometricSignatureType value) {
        this.biometricSignatureType = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setId(JAXBElement<String> value) {
        this.id = (value);
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccount(JAXBElement<String> value) {
        this.account = (value);
    }

    /**
     * Gets the value of the biometricOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the biometricOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBiometricOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBiometricOptions() {
        if (biometricOptions == null) {
            biometricOptions = new ArrayList<String>();
        }
        return this.biometricOptions;
    }

    /**
     * Gets the value of the biometricParameters property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BiometricVerificationParameters }{@code >}
     *     
     */
    public JAXBElement<BiometricVerificationParameters> getBiometricParameters() {
        return biometricParameters;
    }

    /**
     * Sets the value of the biometricParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BiometricVerificationParameters }{@code >}
     *     
     */
    public void setBiometricParameters(JAXBElement<BiometricVerificationParameters> value) {
        this.biometricParameters = (value);
    }

    /**
     * Gets the value of the biometricState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getBiometricState() {
        return biometricState;
    }

    /**
     * Sets the value of the biometricState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setBiometricState(JAXBElement<byte[]> value) {
        this.biometricState = (value);
    }

    /**
     * Gets the value of the detachedSignature property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getDetachedSignature() {
        return detachedSignature;
    }

    /**
     * Sets the value of the detachedSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setDetachedSignature(JAXBElement<byte[]> value) {
        this.detachedSignature = (value);
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setDocument(JAXBElement<byte[]> value) {
        this.document = (value);
    }

}
