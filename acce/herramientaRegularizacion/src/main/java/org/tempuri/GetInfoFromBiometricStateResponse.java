
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
 *         &lt;element name="GetInfoFromBiometricStateResult" type="{http://schemas.datacontract.org/2004/07/SealSignBSSTypes}BiometricSignatureVerification" minOccurs="0"/>
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
    "getInfoFromBiometricStateResult"
})
@XmlRootElement(name = "GetInfoFromBiometricStateResponse")
public class GetInfoFromBiometricStateResponse {

    @XmlElementRef(name = "GetInfoFromBiometricStateResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<BiometricSignatureVerification> getInfoFromBiometricStateResult;

    /**
     * Gets the value of the getInfoFromBiometricStateResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BiometricSignatureVerification }{@code >}
     *     
     */
    public JAXBElement<BiometricSignatureVerification> getGetInfoFromBiometricStateResult() {
        return getInfoFromBiometricStateResult;
    }

    /**
     * Sets the value of the getInfoFromBiometricStateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BiometricSignatureVerification }{@code >}
     *     
     */
    public void setGetInfoFromBiometricStateResult(JAXBElement<BiometricSignatureVerification> value) {
        this.getInfoFromBiometricStateResult = (value);
    }

}
