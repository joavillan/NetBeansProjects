
package org.datacontract.schemas._2004._07.sealsignbsstypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BiometricVerificationResult.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BiometricVerificationResult">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SignatureFound"/>
 *     &lt;enumeration value="SignatureNotFound"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BiometricVerificationResult")
@XmlEnum
public enum BiometricVerificationResult {

    @XmlEnumValue("SignatureFound")
    SIGNATURE_FOUND("SignatureFound"),
    @XmlEnumValue("SignatureNotFound")
    SIGNATURE_NOT_FOUND("SignatureNotFound");
    private final String value;

    BiometricVerificationResult(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BiometricVerificationResult fromValue(String v) {
        for (BiometricVerificationResult c: BiometricVerificationResult.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
