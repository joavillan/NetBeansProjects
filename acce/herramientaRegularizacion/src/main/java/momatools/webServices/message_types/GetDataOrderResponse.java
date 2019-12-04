
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
 *         &lt;element name="numeroActividad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaEjecucion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="datosCalculados" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "numeroActividad",
    "fechaEjecucion",
    "datosCalculados"
})
@XmlRootElement(name = "GetDataOrderResponse")
public class GetDataOrderResponse {

    @XmlElement(required = true)
    protected String numeroActividad;
    @XmlElement(required = true)
    protected String fechaEjecucion;
    protected String datosCalculados;

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
     * Gets the value of the fechaEjecucion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaEjecucion() {
        return fechaEjecucion;
    }

    /**
     * Sets the value of the fechaEjecucion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaEjecucion(String value) {
        this.fechaEjecucion = value;
    }

    /**
     * Gets the value of the datosCalculados property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatosCalculados() {
        return datosCalculados;
    }

    /**
     * Sets the value of the datosCalculados property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatosCalculados(String value) {
        this.datosCalculados = value;
    }

}
