
package org.datacontract.schemas._2004._07.sealsigndsstypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimestampType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimestampType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Generic"/>
 *     &lt;enumeration value="ESC"/>
 *     &lt;enumeration value="CertsAndCRLs"/>
 *     &lt;enumeration value="Archive"/>
 *     &lt;enumeration value="Archive2"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TimestampType")
@XmlEnum
public enum TimestampType {

    @XmlEnumValue("Generic")
    GENERIC("Generic"),
    ESC("ESC"),
    @XmlEnumValue("CertsAndCRLs")
    CERTS_AND_CR_LS("CertsAndCRLs"),
    @XmlEnumValue("Archive")
    ARCHIVE("Archive"),
    @XmlEnumValue("Archive2")
    ARCHIVE_2("Archive2");
    private final String value;

    TimestampType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimestampType fromValue(String v) {
        for (TimestampType c: TimestampType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
