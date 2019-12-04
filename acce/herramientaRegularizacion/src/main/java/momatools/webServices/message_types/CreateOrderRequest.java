
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
 *         &lt;element name="estadoOrden" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="maxAnomalias" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maxFallidas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maxFallidasAusente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ordenXML" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "estadoOrden",
    "maxAnomalias",
    "maxFallidas",
    "maxFallidasAusente",
    "ordenXML"
})
@XmlRootElement(name = "CreateOrderRequest")
public class CreateOrderRequest {

    @XmlElement(required = true)
    protected String numeroOrden;
    @XmlElement(required = true)
    protected String estadoOrden;
    protected Integer maxAnomalias;
    protected Integer maxFallidas;
    protected Integer maxFallidasAusente;
    @XmlElement(required = true)
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
     * Gets the value of the estadoOrden property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoOrden() {
        return estadoOrden;
    }

    /**
     * Sets the value of the estadoOrden property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoOrden(String value) {
        this.estadoOrden = value;
    }

    /**
     * Gets the value of the maxAnomalias property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxAnomalias() {
        return maxAnomalias;
    }

    /**
     * Sets the value of the maxAnomalias property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxAnomalias(Integer value) {
        this.maxAnomalias = value;
    }

    /**
     * Gets the value of the maxFallidas property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxFallidas() {
        return maxFallidas;
    }

    /**
     * Sets the value of the maxFallidas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxFallidas(Integer value) {
        this.maxFallidas = value;
    }

    /**
     * Gets the value of the maxFallidasAusente property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxFallidasAusente() {
        return maxFallidasAusente;
    }

    /**
     * Sets the value of the maxFallidasAusente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxFallidasAusente(Integer value) {
        this.maxFallidasAusente = value;
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
