
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.sealsignbsstypes.BiometricSignatureVerification;


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
 *         &lt;element name="VerifyResult" type="{http://schemas.datacontract.org/2004/07/SealSignBSSTypes}BiometricSignatureVerification" minOccurs="0"/>
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
    "verifyResult"
})
@XmlRootElement(name = "VerifyResponse")
public class VerifyResponse {

    @XmlElementRef(name = "VerifyResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<BiometricSignatureVerification> verifyResult;

    /**
     * Gets the value of the verifyResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BiometricSignatureVerification }{@code >}
     *     
     */
    public JAXBElement<BiometricSignatureVerification> getVerifyResult() {
        return verifyResult;
    }

    /**
     * Sets the value of the verifyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BiometricSignatureVerification }{@code >}
     *     
     */
    public void setVerifyResult(JAXBElement<BiometricSignatureVerification> value) {
        this.verifyResult = (value);
    }

}
