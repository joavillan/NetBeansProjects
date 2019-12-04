
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.sealsignbssservice.ArrayOfOfflineBiometricSignature;
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
 *         &lt;element name="offlineSignatures" type="{http://schemas.datacontract.org/2004/07/SealSignBSSService}ArrayOfOfflineBiometricSignature" minOccurs="0"/>
 *         &lt;element name="detachedSignature" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="signingDocument" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
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
    "offlineSignatures",
    "detachedSignature",
    "signingDocument"
})
@XmlRootElement(name = "SyncOfflineSignatures")
public class SyncOfflineSignatures {

    protected SignatureProfile signatureProfile;
    @XmlElementRef(name = "offlineSignatures", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfOfflineBiometricSignature> offlineSignatures;
    @XmlElementRef(name = "detachedSignature", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<byte[]> detachedSignature;
    @XmlElementRef(name = "signingDocument", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<byte[]> signingDocument;

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
     * Gets the value of the offlineSignatures property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOfflineBiometricSignature }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOfflineBiometricSignature> getOfflineSignatures() {
        return offlineSignatures;
    }

    /**
     * Sets the value of the offlineSignatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOfflineBiometricSignature }{@code >}
     *     
     */
    public void setOfflineSignatures(JAXBElement<ArrayOfOfflineBiometricSignature> value) {
        this.offlineSignatures = (value);
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
     * Gets the value of the signingDocument property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getSigningDocument() {
        return signingDocument;
    }

    /**
     * Sets the value of the signingDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setSigningDocument(JAXBElement<byte[]> value) {
        this.signingDocument = (value);
    }

}
