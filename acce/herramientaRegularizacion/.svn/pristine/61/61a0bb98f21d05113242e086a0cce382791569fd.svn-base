package gnf.momacon.momaconportal.toa.activity.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for get_activities_parameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="get_activities_parameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user" type="{urn:toa:activity}user" minOccurs="0"/>
 *         &lt;element name="resources" type="{urn:toa:activity}get_activities_resource_filter"/>
 *         &lt;element name="date_range" type="{urn:toa:activity}get_activities_date_filter"/>
 *         &lt;element name="select_from" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="select_count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="filter_expression" type="{urn:toa:activity}get_activities_filter" minOccurs="0"/>
 *         &lt;element name="required_properties" type="{urn:toa:activity}get_activities_property_filter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "get_activities_parameters", propOrder = {
    "user",
    "resources",
    "dateRange",
    "selectFrom",
    "selectCount",
    "filterExpression",
    "requiredProperties"
})
public class GetActivitiesParameters {

    private User user;
    @XmlElement(required = true)
    private GetActivitiesResourceFilter resources;
    @XmlElement(name = "date_range", required = true)
    private GetActivitiesDateFilter dateRange;
    @XmlElement(name = "select_from")
    private Integer selectFrom;
    @XmlElement(name = "select_count")
    private int selectCount;
    @XmlElement(name = "filter_expression")
    private GetActivitiesFilter filterExpression;
    @XmlElement(name = "required_properties")
    private GetActivitiesPropertyFilter requiredProperties;

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
     * Gets the value of the resources property.
     * 
     * @return
     *     possible object is
     *     {@link GetActivitiesResourceFilter }
     *     
     */
    public GetActivitiesResourceFilter getResources() {
        return resources;
    }

    /**
     * Sets the value of the resources property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetActivitiesResourceFilter }
     *     
     */
    public void setResources(GetActivitiesResourceFilter value) {
        this.resources = value;
    }

    /**
     * Gets the value of the dateRange property.
     * 
     * @return
     *     possible object is
     *     {@link GetActivitiesDateFilter }
     *     
     */
    public GetActivitiesDateFilter getDateRange() {
        return dateRange;
    }

    /**
     * Sets the value of the dateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetActivitiesDateFilter }
     *     
     */
    public void setDateRange(GetActivitiesDateFilter value) {
        this.dateRange = value;
    }

    /**
     * Gets the value of the selectFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSelectFrom() {
        return selectFrom;
    }

    /**
     * Sets the value of the selectFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSelectFrom(Integer value) {
        this.selectFrom = value;
    }

    /**
     * Gets the value of the selectCount property.
     * 
     */
    public int getSelectCount() {
        return selectCount;
    }

    /**
     * Sets the value of the selectCount property.
     * 
     */
    public void setSelectCount(int value) {
        this.selectCount = value;
    }

    /**
     * Gets the value of the filterExpression property.
     * 
     * @return
     *     possible object is
     *     {@link GetActivitiesFilter }
     *     
     */
    public GetActivitiesFilter getFilterExpression() {
        return filterExpression;
    }

    /**
     * Sets the value of the filterExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetActivitiesFilter }
     *     
     */
    public void setFilterExpression(GetActivitiesFilter value) {
        this.filterExpression = value;
    }

    /**
     * Gets the value of the requiredProperties property.
     * 
     * @return
     *     possible object is
     *     {@link GetActivitiesPropertyFilter }
     *     
     */
    public GetActivitiesPropertyFilter getRequiredProperties() {
        return requiredProperties;
    }

    /**
     * Sets the value of the requiredProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetActivitiesPropertyFilter }
     *     
     */
    public void setRequiredProperties(GetActivitiesPropertyFilter value) {
        this.requiredProperties = value;
    }

}
