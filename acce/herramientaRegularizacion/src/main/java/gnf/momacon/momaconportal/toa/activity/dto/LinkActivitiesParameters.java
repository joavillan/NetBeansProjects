package gnf.momacon.momaconportal.toa.activity.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for link_activities_parameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="link_activities_parameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user" type="{urn:toa:activity}user" minOccurs="0"/>
 *         &lt;element name="from_activity_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="to_activity_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="link_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="min_interval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="max_interval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "link_activities_parameters", propOrder = {
    "user",
    "fromActivityId",
    "toActivityId",
    "linkType",
    "minInterval",
    "maxInterval"
})
public class LinkActivitiesParameters {

    private User user;
    @XmlElement(name = "from_activity_id", required = true)
    private String fromActivityId;
    @XmlElement(name = "to_activity_id", required = true)
    private String toActivityId;
    @XmlElement(name = "link_type", required = true)
    private String linkType;
    @XmlElement(name = "min_interval")
    private String minInterval;
    @XmlElement(name = "max_interval")
    private String maxInterval;

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
     * Gets the value of the fromActivityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromActivityId() {
        return fromActivityId;
    }

    /**
     * Sets the value of the fromActivityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromActivityId(String value) {
        this.fromActivityId = value;
    }

    /**
     * Gets the value of the toActivityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToActivityId() {
        return toActivityId;
    }

    /**
     * Sets the value of the toActivityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToActivityId(String value) {
        this.toActivityId = value;
    }

    /**
     * Gets the value of the linkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkType() {
        return linkType;
    }

    /**
     * Sets the value of the linkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkType(String value) {
        this.linkType = value;
    }

    /**
     * Gets the value of the minInterval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinInterval() {
        return minInterval;
    }

    /**
     * Sets the value of the minInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinInterval(String value) {
        this.minInterval = value;
    }

    /**
     * Gets the value of the maxInterval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxInterval() {
        return maxInterval;
    }

    /**
     * Sets the value of the maxInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxInterval(String value) {
        this.maxInterval = value;
    }

}
