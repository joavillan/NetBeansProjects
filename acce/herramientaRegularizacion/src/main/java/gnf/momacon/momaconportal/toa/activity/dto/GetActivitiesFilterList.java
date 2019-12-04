package gnf.momacon.momaconportal.toa.activity.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for get_activities_filter_list complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="get_activities_filter_list">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filter_expression" type="{urn:toa:activity}get_activities_filter" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "get_activities_filter_list", propOrder = {
    "filterExpression"
})
public class GetActivitiesFilterList {

    @XmlElement(name = "filter_expression", required = true)
    private List<GetActivitiesFilter> filterExpression;

    /**
     * Gets the value of the filterExpression property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filterExpression property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilterExpression().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetActivitiesFilter }
     * 
     * 
     */
    public List<GetActivitiesFilter> getFilterExpression() {
        if (filterExpression == null) {
            filterExpression = new ArrayList<GetActivitiesFilter>();
        }
        return this.filterExpression;
    }

}
