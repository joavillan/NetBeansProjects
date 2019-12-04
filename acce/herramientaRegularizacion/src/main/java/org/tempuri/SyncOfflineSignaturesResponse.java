
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="SyncOfflineSignaturesResult" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
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
    "syncOfflineSignaturesResult"
})
@XmlRootElement(name = "SyncOfflineSignaturesResponse")
public class SyncOfflineSignaturesResponse {

    @XmlElementRef(name = "SyncOfflineSignaturesResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<byte[]> syncOfflineSignaturesResult;

    /**
     * Gets the value of the syncOfflineSignaturesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getSyncOfflineSignaturesResult() {
        return syncOfflineSignaturesResult;
    }

    /**
     * Sets the value of the syncOfflineSignaturesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setSyncOfflineSignaturesResult(JAXBElement<byte[]> value) {
        this.syncOfflineSignaturesResult = (value);
    }

}
