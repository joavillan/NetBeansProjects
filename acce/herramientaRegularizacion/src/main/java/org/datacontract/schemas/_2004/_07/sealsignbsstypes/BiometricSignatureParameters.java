
package org.datacontract.schemas._2004._07.sealsignbsstypes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BiometricSignatureParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BiometricSignatureParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="advancedImageParameters" type="{http://schemas.datacontract.org/2004/07/SealSignBSSTypes}ArrayOfBiometricImageParameters" minOccurs="0"/>
 *         &lt;element name="imageParameters" type="{http://schemas.datacontract.org/2004/07/SealSignBSSTypes}BiometricImageParameters" minOccurs="0"/>
 *         &lt;element name="imageTokenText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BiometricSignatureParameters", propOrder = {
    "advancedImageParameters",
    "imageParameters",
    "imageTokenText"
})
public class BiometricSignatureParameters {

    @XmlElementRef(name = "advancedImageParameters", namespace = "http://schemas.datacontract.org/2004/07/SealSignBSSTypes", type = JAXBElement.class)
    protected JAXBElement<ArrayOfBiometricImageParameters> advancedImageParameters;
    @XmlElementRef(name = "imageParameters", namespace = "http://schemas.datacontract.org/2004/07/SealSignBSSTypes", type = JAXBElement.class)
    protected JAXBElement<BiometricImageParameters> imageParameters;
    @XmlElementRef(name = "imageTokenText", namespace = "http://schemas.datacontract.org/2004/07/SealSignBSSTypes", type = JAXBElement.class)
    protected JAXBElement<String> imageTokenText;

    /**
     * Gets the value of the advancedImageParameters property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBiometricImageParameters }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBiometricImageParameters> getAdvancedImageParameters() {
        return advancedImageParameters;
    }

    /**
     * Sets the value of the advancedImageParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBiometricImageParameters }{@code >}
     *     
     */
    public void setAdvancedImageParameters(JAXBElement<ArrayOfBiometricImageParameters> value) {
        this.advancedImageParameters = (value);
    }

    /**
     * Gets the value of the imageParameters property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BiometricImageParameters }{@code >}
     *     
     */
    public JAXBElement<BiometricImageParameters> getImageParameters() {
        return imageParameters;
    }

    /**
     * Sets the value of the imageParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BiometricImageParameters }{@code >}
     *     
     */
    public void setImageParameters(JAXBElement<BiometricImageParameters> value) {
        this.imageParameters = (value);
    }

    /**
     * Gets the value of the imageTokenText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImageTokenText() {
        return imageTokenText;
    }

    /**
     * Sets the value of the imageTokenText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImageTokenText(JAXBElement<String> value) {
        this.imageTokenText = (value);
    }

}
