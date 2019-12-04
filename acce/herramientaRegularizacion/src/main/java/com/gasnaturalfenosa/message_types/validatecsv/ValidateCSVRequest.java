
package com.gasnaturalfenosa.message_types.validatecsv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="firmaBase64" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="csvTablet" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "firmaBase64",
    "csvTablet"
})
@XmlRootElement(name = "ValidateCSVRequest")
public class ValidateCSVRequest {

    @XmlElement(required = true)
    protected byte[] firmaBase64;
    @XmlElement(required = true)
    protected String csvTablet;

    /**
     * Gets the value of the firmaBase64 property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFirmaBase64() {
        return firmaBase64;
    }

    /**
     * Sets the value of the firmaBase64 property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFirmaBase64(byte[] value) {
        this.firmaBase64 = (value);
    }

    /**
     * Gets the value of the csvTablet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsvTablet() {
        return csvTablet;
    }

    /**
     * Sets the value of the csvTablet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsvTablet(String value) {
        this.csvTablet = value;
    }

}
