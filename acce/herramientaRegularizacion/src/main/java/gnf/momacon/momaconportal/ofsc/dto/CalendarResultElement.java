
package gnf.momacon.momaconportal.ofsc.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalendarResultElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalendarResultElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="calendar_result_code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="calendar_error_msg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "CalendarResultElement", propOrder = {

})
public class CalendarResultElement {

    @XmlElement(name = "calendar_result_code")
    private int calendarResultCode;
    @XmlElement(name = "calendar_error_msg")
    private String calendarErrorMsg;
    private String userdata;

    /**
     * Gets the value of the calendarResultCode property.
     * 
     */
    public int getCalendarResultCode() {
        return calendarResultCode;
    }

    /**
     * Sets the value of the calendarResultCode property.
     * 
     */
    public void setCalendarResultCode(int value) {
        this.calendarResultCode = value;
    }

    /**
     * Gets the value of the calendarErrorMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalendarErrorMsg() {
        return calendarErrorMsg;
    }

    /**
     * Sets the value of the calendarErrorMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalendarErrorMsg(String value) {
        this.calendarErrorMsg = value;
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
