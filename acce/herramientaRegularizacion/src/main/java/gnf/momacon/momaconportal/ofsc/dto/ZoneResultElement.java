
package gnf.momacon.momaconportal.ofsc.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZoneResultElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZoneResultElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="zone_result_code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="zone_error_msg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userdata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZoneResultElement", propOrder = {

})
public class ZoneResultElement {

    @XmlElement(name = "zone_result_code")
    private int zoneResultCode;
    @XmlElement(name = "zone_error_msg")
    private String zoneErrorMsg;
    private String userdata;

    /**
     * Gets the value of the zoneResultCode property.
     * 
     */
    public int getZoneResultCode() {
        return zoneResultCode;
    }

    /**
     * Sets the value of the zoneResultCode property.
     * 
     */
    public void setZoneResultCode(int value) {
        this.zoneResultCode = value;
    }

    /**
     * Gets the value of the zoneErrorMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneErrorMsg() {
        return zoneErrorMsg;
    }

    /**
     * Sets the value of the zoneErrorMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneErrorMsg(String value) {
        this.zoneErrorMsg = value;
    }

    /**
     * Gets the value of the userdata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserdata() {
        return userdata;
    }

    /**
     * Sets the value of the userdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserdata(String value) {
        this.userdata = value;
    }

}
