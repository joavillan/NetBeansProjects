
package momatools.webServices.message_types;

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
 *         &lt;element name="numeroOrden" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroActividad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estatusActividad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ordenXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "numeroOrden",
    "numeroActividad",
    "estatusActividad",
    "ordenXML"
})
@XmlRootElement(name = "CreateActivityRequest")
public class CreateActivityRequest {

    @XmlElement(required = true)
    protected String numeroOrden;
    @XmlElement(required = true)
    protected String numeroActividad;
    protected String estatusActividad;
    protected String ordenXML;

    /**
     * Gets the value of the numeroOrden property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroOrden() {
        return numeroOrden;
    }

    /**
     * Sets the value of the numeroOrden property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroOrden(String value) {
        this.numeroOrden = value;
    }

    /**
     * Gets the value of the numeroActividad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroActividad() {
        return numeroActividad;
    }

    /**
     * Sets the value of the numeroActividad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroActividad(String value) {
        this.numeroActividad = value;
    }

    /**
     * Gets the value of the estatusActividad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstatusActividad() {
        return estatusActividad;
    }

    /**
     * Sets the value of the estatusActividad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstatusActividad(String value) {
        this.estatusActividad = value;
    }

    /**
     * Gets the value of the ordenXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdenXML() {
        return ordenXML;
    }

    /**
     * Sets the value of the ordenXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdenXML(String value) {
        this.ordenXML = value;
    }

}
