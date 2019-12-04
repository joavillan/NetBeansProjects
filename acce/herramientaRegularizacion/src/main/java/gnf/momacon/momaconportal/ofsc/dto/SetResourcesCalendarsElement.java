
package gnf.momacon.momaconportal.ofsc.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetResourcesCalendarsElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetResourcesCalendarsElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="user" type="{urn:toatech:ResourceManagement:1.0}AuthNodeElement" minOccurs="0"/>
 *         &lt;element name="calendars" type="{urn:toatech:ResourceManagement:1.0}CalendarList"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetResourcesCalendarsElement", propOrder = {

})
public class SetResourcesCalendarsElement {

    private AuthNodeElement user;
    @XmlElement(required = true)
    private CalendarList calendars;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link AuthNodeElement }
     *     
     */
    public AuthNodeElement getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthNodeElement }
     *     
     */
    public void setUser(AuthNodeElement value) {
        this.user = value;
    }

    /**
     * Gets the value of the calendars property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarList }
     *     
     */
    public CalendarList getCalendars() {
        return calendars;
    }

    /**
     * Sets the value of the calendars property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarList }
     *     
     */
    public void setCalendars(CalendarList value) {
        this.calendars = value;
    }

}
