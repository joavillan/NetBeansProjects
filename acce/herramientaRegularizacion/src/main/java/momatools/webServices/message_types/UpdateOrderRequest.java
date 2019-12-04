
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
 *         &lt;element name="Order">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="numeroOrden" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="estadoOrden" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="maxAnomalias" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="maxFallidas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="maxFallidasAusente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="ordenXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="returnXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Activity" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="numeroActividad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="estadoActividad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="fechaEjecucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="numAnomalias" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="numFallidas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="numFallidasAusente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="actividadXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="returnXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MOMACON_Activity" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="numeroActividad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="estadoProceso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "order",
    "activity",
    "momaconActivity"
})
@XmlRootElement(name = "UpdateOrderRequest")
public class UpdateOrderRequest {

    @XmlElement(name = "Order", required = true)
    protected UpdateOrderRequest.Order order;
    @XmlElement(name = "Activity")
    protected UpdateOrderRequest.Activity activity;
    @XmlElement(name = "MOMACON_Activity")
    protected UpdateOrderRequest.MOMACONActivity momaconActivity;

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateOrderRequest.Order }
     *     
     */
    public UpdateOrderRequest.Order getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateOrderRequest.Order }
     *     
     */
    public void setOrder(UpdateOrderRequest.Order value) {
        this.order = value;
    }

    /**
     * Gets the value of the activity property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateOrderRequest.Activity }
     *     
     */
    public UpdateOrderRequest.Activity getActivity() {
        return activity;
    }

    /**
     * Sets the value of the activity property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateOrderRequest.Activity }
     *     
     */
    public void setActivity(UpdateOrderRequest.Activity value) {
        this.activity = value;
    }

    /**
     * Gets the value of the momaconActivity property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateOrderRequest.MOMACONActivity }
     *     
     */
    public UpdateOrderRequest.MOMACONActivity getMOMACONActivity() {
        return momaconActivity;
    }

    /**
     * Sets the value of the momaconActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateOrderRequest.MOMACONActivity }
     *     
     */
    public void setMOMACONActivity(UpdateOrderRequest.MOMACONActivity value) {
        this.momaconActivity = value;
    }


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
     *         &lt;element name="estadoActividad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="fechaEjecucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="numAnomalias" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="numFallidas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="numFallidasAusente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="actividadXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="returnXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "estadoActividad",
        "fechaEjecucion",
        "numAnomalias",
        "numFallidas",
        "numFallidasAusente",
        "actividadXML",
        "returnXML"
    })
    public static class Activity {

        @XmlElement(required = true)
        protected String numeroActividad;
        protected String estadoActividad;
        protected String fechaEjecucion;
        protected Integer numAnomalias;
        protected Integer numFallidas;
        protected Integer numFallidasAusente;
        protected String actividadXML;
        protected String returnXML;

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
         * Gets the value of the estadoActividad property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEstadoActividad() {
            return estadoActividad;
        }

        /**
         * Sets the value of the estadoActividad property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEstadoActividad(String value) {
            this.estadoActividad = value;
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
         * Gets the value of the numAnomalias property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getNumAnomalias() {
            return numAnomalias;
        }

        /**
         * Sets the value of the numAnomalias property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setNumAnomalias(Integer value) {
            this.numAnomalias = value;
        }

        /**
         * Gets the value of the numFallidas property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getNumFallidas() {
            return numFallidas;
        }

        /**
         * Sets the value of the numFallidas property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setNumFallidas(Integer value) {
            this.numFallidas = value;
        }

        /**
         * Gets the value of the numFallidasAusente property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getNumFallidasAusente() {
            return numFallidasAusente;
        }

        /**
         * Sets the value of the numFallidasAusente property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setNumFallidasAusente(Integer value) {
            this.numFallidasAusente = value;
        }

        /**
         * Gets the value of the actividadXML property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActividadXML() {
            return actividadXML;
        }

        /**
         * Sets the value of the actividadXML property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActividadXML(String value) {
            this.actividadXML = value;
        }

        /**
         * Gets the value of the returnXML property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReturnXML() {
            return returnXML;
        }

        /**
         * Sets the value of the returnXML property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReturnXML(String value) {
            this.returnXML = value;
        }

    }


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
     *         &lt;element name="estadoProceso" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "estadoProceso"
    })
    public static class MOMACONActivity {

        @XmlElement(required = true)
        protected String numeroActividad;
        @XmlElement(required = true)
        protected String estadoProceso;

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
         * Gets the value of the estadoProceso property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEstadoProceso() {
            return estadoProceso;
        }

        /**
         * Sets the value of the estadoProceso property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEstadoProceso(String value) {
            this.estadoProceso = value;
        }

    }


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
     *         &lt;element name="estadoOrden" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="maxAnomalias" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="maxFallidas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="maxFallidasAusente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="ordenXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="returnXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "ordenXML",
        "returnXML"
    })
    public static class Order {

        @XmlElement(required = true)
        protected String numeroOrden;
        protected String estadoOrden;
        protected Integer maxAnomalias;
        protected Integer maxFallidas;
        protected Integer maxFallidasAusente;
        protected String ordenXML;
        protected String returnXML;

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

        /**
         * Gets the value of the returnXML property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReturnXML() {
            return returnXML;
        }

        /**
         * Sets the value of the returnXML property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReturnXML(String value) {
            this.returnXML = value;
        }

    }

}
