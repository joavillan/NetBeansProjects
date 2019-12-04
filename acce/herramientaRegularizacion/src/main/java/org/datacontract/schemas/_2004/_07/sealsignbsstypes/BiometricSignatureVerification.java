
package org.datacontract.schemas._2004._07.sealsignbsstypes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.sealsigndsstypes.SignatureVerification;


/**
 * <p>Java class for BiometricSignatureVerification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BiometricSignatureVerification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dssResult" type="{http://schemas.datacontract.org/2004/07/SealSignDSSTypes}SignatureVerification" minOccurs="0"/>
 *         &lt;element name="result" type="{http://schemas.datacontract.org/2004/07/SealSignBSSTypes}BiometricVerificationResult" minOccurs="0"/>
 *         &lt;element name="signatures" type="{http://schemas.datacontract.org/2004/07/SealSignBSSTypes}ArrayOfBiometricSignatureReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BiometricSignatureVerification", propOrder = {
    "dssResult",
    "result",
    "signatures"
})
public class BiometricSignatureVerification {

    @XmlElementRef(name = "dssResult", namespace = "http://schemas.datacontract.org/2004/07/SealSignBSSTypes", type = JAXBElement.class)
    protected JAXBElement<SignatureVerification> dssResult;
    protected BiometricVerificationResult result;
    @XmlElementRef(name = "signatures", namespace = "http://schemas.datacontract.org/2004/07/SealSignBSSTypes", type = JAXBElement.class)
    protected JAXBElement<ArrayOfBiometricSignatureReference> signatures;

    /**
     * Gets the value of the dssResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SignatureVerification }{@code >}
     *     
     */
    public JAXBElement<SignatureVerification> getDssResult() {
        return dssResult;
    }

    /**
     * Sets the value of the dssResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SignatureVerification }{@code >}
     *     
     */
    public void setDssResult(JAXBElement<SignatureVerification> value) {
        this.dssResult = (value);
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link BiometricVerificationResult }
     *     
     */
    public BiometricVerificationResult getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiometricVerificationResult }
     *     
     */
    public void setResult(BiometricVerificationResult value) {
        this.result = value;
    }

    /**
     * Gets the value of the signatures property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBiometricSignatureReference }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBiometricSignatureReference> getSignatures() {
        return signatures;
    }

    /**
     * Sets the value of the signatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBiometricSignatureReference }{@code >}
     *     
     */
    public void setSignatures(JAXBElement<ArrayOfBiometricSignatureReference> value) {
        this.signatures = (value);
    }

}
