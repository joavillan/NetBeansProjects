
package gnf.momacon.momaconportal.ofsc.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetUsersListResponseElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUsersListResponseElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="result_code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="error_msg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="users" type="{urn:toatech:ResourceManagement:1.0}UserListElement" minOccurs="0"/>
 *         &lt;element name="users_count" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUsersListResponseElement", propOrder = {

})
public class GetUsersListResponseElement {

    @XmlElement(name = "result_code")
    private int resultCode;
    @XmlElement(name = "error_msg")
    private String errorMsg;
    private UserListElement users;
    @XmlElement(name = "users_count")
    private Integer usersCount;

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
     * Gets the value of the users property.
     * 
     * @return
     *     possible object is
     *     {@link UserListElement }
     *     
     */
    public UserListElement getUsers() {
        return users;
    }

    /**
     * Sets the value of the users property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserListElement }
     *     
     */
    public void setUsers(UserListElement value) {
        this.users = value;
    }

    /**
     * Gets the value of the usersCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUsersCount() {
        return usersCount;
    }

    /**
     * Sets the value of the usersCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUsersCount(Integer value) {
        this.usersCount = value;
    }

}
