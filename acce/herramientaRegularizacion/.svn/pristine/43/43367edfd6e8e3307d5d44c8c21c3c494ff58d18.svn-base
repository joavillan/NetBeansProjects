
package org.datacontract.schemas._2004._07.sealsigndsstypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignatureType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SignatureType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="Enveloped"/>
 *     &lt;enumeration value="Enveloping"/>
 *     &lt;enumeration value="Detached"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SignatureType")
@XmlEnum
public enum SignatureType {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Enveloped")
    ENVELOPED("Enveloped"),
    @XmlEnumValue("Enveloping")
    ENVELOPING("Enveloping"),
    @XmlEnumValue("Detached")
    DETACHED("Detached");
    private final String value;

    SignatureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SignatureType fromValue(String v) {
        for (SignatureType c: SignatureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
