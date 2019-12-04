
package gnf.momacon.momaconportal.ofsc.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetResourcesCalendarsResponseElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetResourcesCalendarsResponseElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="result_code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="error_msg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calendar_results" type="{urn:toatech:ResourceManagement:1.0}CalendarResultList" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetResourcesCalendarsResponseElement", propOrder = {

})
public class SetResourcesCalendarsResponseElement {

    @XmlElement(name = "result_code")
    private int resultCode;
    @XmlElement(name = "error_msg")
    private String errorMsg;
    @XmlElement(name = "calendar_results")
    private CalendarResultList calendarResults;

    /**
     * Gets the value of the resultCode property.
     * 
     */
    public int getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     */
    public void setResultCode(int value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the errorMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * Sets the value of the errorMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

    /**
     * Gets the value of the calendarResults property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarResultList }
     *     
     */
    public CalendarResultList getCalendarResults() {
        return calendarResults;
    }

    /**
     * Sets the value of the calendarResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarResultList }
     *     
     */
    public void setCalendarResults(CalendarResultList value) {
        this.calendarResults = value;
    }

}
