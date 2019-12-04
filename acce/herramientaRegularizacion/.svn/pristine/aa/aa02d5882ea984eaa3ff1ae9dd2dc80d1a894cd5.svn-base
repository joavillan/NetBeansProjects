package gnf.momacon.momaconportal.toa.activity.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for activity_response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="activity_response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result_code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="error_msg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="activity" type="{urn:toa:activity}activity" minOccurs="0"/>
 *         &lt;element name="activity_list" type="{urn:toa:activity}activity_list" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "activity_response", propOrder = {
    "resultCode",
    "errorMsg",
    "activity",
    "activityList"
})
@XmlRootElement
public class ActivityResponse {

    @XmlElement(name = "result_code")
    private int resultCode;
    @XmlElement(name = "error_msg")
    private String errorMsg;
    private Activity activity;
    @XmlElement(name = "activity_list")
    private ActivityList activityList;

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
     * Gets the value of the activity property.
     * 
     * @return
     *     possible object is
     *     {@link Activity }
     *     
     */
    public Activity getActivity() {
        return activity;
    }

    /**
     * Sets the value of the activity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Activity }
     *     
     */
    public void setActivity(Activity value) {
        this.activity = value;
    }

    /**
     * Gets the value of the activityList property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityList }
     *     
     */
    public ActivityList getActivityList() {
        return activityList;
    }

    /**
     * Sets the value of the activityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityList }
     *     
     */
    public void setActivityList(ActivityList value) {
        this.activityList = value;
    }

}
