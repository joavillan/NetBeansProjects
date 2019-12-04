
package org.datacontract.schemas._2004._07.sealsigndsstypes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignatureVerification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignatureVerification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://schemas.datacontract.org/2004/07/SealSignDSSTypes}VerificationResult" minOccurs="0"/>
 *         &lt;element name="signatures" type="{http://schemas.datacontract.org/2004/07/SealSignDSSTypes}ArrayOfSignatureReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureVerification", propOrder = {
    "result",
    "signatures"
})
public class SignatureVerification {

    protected VerificationResult result;
    @XmlElementRef(name = "signatures", namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", type = JAXBElement.class)
    protected JAXBElement<ArrayOfSignatureReference> signatures;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link VerificationResult }
     *     
     */
    public VerificationResult getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationResult }
     *     
     */
    public void setResult(VerificationResult value) {
        this.result = value;
    }

    /**
     * Gets the value of the signatures property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSignatureReference }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSignatureReference> getSignatures() {
        return signatures;
    }

    /**
     * Sets the value of the signatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSignatureReference }{@code >}
     *     
     */
    public void setSignatures(JAXBElement<ArrayOfSignatureReference> value) {
        this.signatures = (value);
    }

}
