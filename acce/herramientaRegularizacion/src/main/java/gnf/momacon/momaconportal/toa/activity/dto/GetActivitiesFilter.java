package gnf.momacon.momaconportal.toa.activity.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for get_activities_filter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="get_activities_filter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="field" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="operator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="ignore_case" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           &lt;element name="collation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="group_operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="group" type="{urn:toa:activity}get_activities_filter_list"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "get_activities_filter", propOrder = {
    "field",
    "operator",
    "value",
    "ignoreCase",
    "collation",
    "groupOperator",
    "group"
})
public class GetActivitiesFilter {

    private String field;
    private String operator;
    private List<String> value;
    @XmlElement(name = "ignore_case")
    private Boolean ignoreCase;
    private String collation;
    @XmlElement(name = "group_operator")
    private String groupOperator;
    private GetActivitiesFilterList group;

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField(String value) {
        this.field = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperator(String value) {
        this.operator = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getValue() {
        if (value == null) {
            value = new ArrayList<String>();
        }
        return this.value;
    }

    /**
     * Gets the value of the ignoreCase property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreCase() {
        return ignoreCase;
    }

    /**
     * Sets the value of the ignoreCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreCase(Boolean value) {
        this.ignoreCase = value;
    }

    /**
     * Gets the value of the collation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollation() {
        return collation;
    }

    /**
     * Sets the value of the collation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollation(String value) {
        this.collation = value;
    }

    /**
     * Gets the value of the groupOperator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupOperator() {
        return groupOperator;
    }

    /**
     * Sets the value of the groupOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupOperator(String value) {
        this.groupOperator = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link GetActivitiesFilterList }
     *     
     */
    public GetActivitiesFilterList getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetActivitiesFilterList }
     *     
     */
    public void setGroup(GetActivitiesFilterList value) {
        this.group = value;
    }

}
