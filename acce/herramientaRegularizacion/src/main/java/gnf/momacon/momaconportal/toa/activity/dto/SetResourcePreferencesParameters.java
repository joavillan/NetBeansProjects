package gnf.momacon.momaconportal.toa.activity.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for set_resource_preferences_parameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="set_resource_preferences_parameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user" type="{urn:toa:activity}user" minOccurs="0"/>
 *         &lt;element name="activity_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="preference" type="{urn:toa:activity}resource_preference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "set_resource_preferences_parameters", propOrder = {
    "user",
    "activityId",
    "preference"
})
public class SetResourcePreferencesParameters {

    private User user;
    @XmlElement(name = "activity_id", required = true)
    private String activityId;
    private List<ResourcePreference> preference;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

    /**
     * Gets the value of the activityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityId() {
        return activityId;
    }

    /**
     * Sets the value of the activityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityId(String value) {
        this.activityId = value;
    }

    /**
     * Gets the value of the preference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourcePreference }
     * 
     * 
     */
    public List<ResourcePreference> getPreference() {
        if (preference == null) {
            preference = new ArrayList<ResourcePreference>();
        }
        return this.preference;
    }

}
