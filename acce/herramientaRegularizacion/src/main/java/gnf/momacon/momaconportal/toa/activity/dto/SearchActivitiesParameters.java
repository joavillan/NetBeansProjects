package gnf.momacon.momaconportal.toa.activity.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for search_activities_parameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="search_activities_parameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user" type="{urn:toa:activity}user" minOccurs="0"/>
 *         &lt;element name="search_in" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="search_for" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="date_from" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="date_to" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="select_from" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="select_count" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="order" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="property_filter" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "search_activities_parameters", propOrder = {
    "user",
    "searchIn",
    "searchFor",
    "dateFrom",
    "dateTo",
    "selectFrom",
    "selectCount",
    "order",
    "propertyFilter"
})
public class SearchActivitiesParameters {

    private User user;
    @XmlElement(name = "search_in", required = true)
    private String searchIn;
    @XmlElement(name = "search_for", required = true)
    private String searchFor;
    @XmlElement(name = "date_from", required = true)
    private String dateFrom;
    @XmlElement(name = "date_to", required = true)
    private String dateTo;
    @XmlElement(name = "select_from", required = true)
    private String selectFrom;
    @XmlElement(name = "select_count", required = true)
    private String selectCount;
    private String order;
    @XmlElement(name = "property_filter")
    private List<String> propertyFilter;

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
     * Gets the value of the searchIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchIn() {
        return searchIn;
    }

    /**
     * Sets the value of the searchIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchIn(String value) {
        this.searchIn = value;
    }

    /**
     * Gets the value of the searchFor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchFor() {
        return searchFor;
    }

    /**
     * Sets the value of the searchFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchFor(String value) {
        this.searchFor = value;
    }

    /**
     * Gets the value of the dateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFrom() {
        return dateFrom;
    }

    /**
     * Sets the value of the dateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFrom(String value) {
        this.dateFrom = value;
    }

    /**
     * Gets the value of the dateTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTo() {
        return dateTo;
    }

    /**
     * Sets the value of the dateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTo(String value) {
        this.dateTo = value;
    }

    /**
     * Gets the value of the selectFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectFrom() {
        return selectFrom;
    }

    /**
     * Sets the value of the selectFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectFrom(String value) {
        this.selectFrom = value;
    }

    /**
     * Gets the value of the selectCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectCount() {
        return selectCount;
    }

    /**
     * Sets the value of the selectCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectCount(String value) {
        this.selectCount = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrder(String value) {
        this.order = value;
    }

    /**
     * Gets the value of the propertyFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPropertyFilter() {
        if (propertyFilter == null) {
            propertyFilter = new ArrayList<String>();
        }
        return this.propertyFilter;
    }

}
