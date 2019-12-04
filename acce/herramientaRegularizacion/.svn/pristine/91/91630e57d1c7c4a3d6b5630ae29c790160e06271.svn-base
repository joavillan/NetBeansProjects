/**
 * Get_activities_date_filter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package activity.toa;

public class Get_activities_date_filter  implements java.io.Serializable {
    private java.lang.String date_from;

    private java.lang.String date_to;

    private java.lang.Boolean include_unscheduled;

    public Get_activities_date_filter() {
    }

    public Get_activities_date_filter(
           java.lang.String date_from,
           java.lang.String date_to,
           java.lang.Boolean include_unscheduled) {
           this.date_from = date_from;
           this.date_to = date_to;
           this.include_unscheduled = include_unscheduled;
    }


    /**
     * Gets the date_from value for this Get_activities_date_filter.
     * 
     * @return date_from
     */
    public java.lang.String getDate_from() {
        return date_from;
    }


    /**
     * Sets the date_from value for this Get_activities_date_filter.
     * 
     * @param date_from
     */
    public void setDate_from(java.lang.String date_from) {
        this.date_from = date_from;
    }


    /**
     * Gets the date_to value for this Get_activities_date_filter.
     * 
     * @return date_to
     */
    public java.lang.String getDate_to() {
        return date_to;
    }


    /**
     * Sets the date_to value for this Get_activities_date_filter.
     * 
     * @param date_to
     */
    public void setDate_to(java.lang.String date_to) {
        this.date_to = date_to;
    }


    /**
     * Gets the include_unscheduled value for this Get_activities_date_filter.
     * 
     * @return include_unscheduled
     */
    public java.lang.Boolean getInclude_unscheduled() {
        return include_unscheduled;
    }


    /**
     * Sets the include_unscheduled value for this Get_activities_date_filter.
     * 
     * @param include_unscheduled
     */
    public void setInclude_unscheduled(java.lang.Boolean include_unscheduled) {
        this.include_unscheduled = include_unscheduled;
    }

    private java.lang.Object __equalsCalc = null;
    @Override
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_activities_date_filter)) return false;
        Get_activities_date_filter other = (Get_activities_date_filter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.date_from==null && other.getDate_from()==null) || 
             (this.date_from!=null &&
              this.date_from.equals(other.getDate_from()))) &&
            ((this.date_to==null && other.getDate_to()==null) || 
             (this.date_to!=null &&
              this.date_to.equals(other.getDate_to()))) &&
            ((this.include_unscheduled==null && other.getInclude_unscheduled()==null) || 
             (this.include_unscheduled!=null &&
              this.include_unscheduled.equals(other.getInclude_unscheduled())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    @Override
	public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDate_from() != null) {
            _hashCode += getDate_from().hashCode();
        }
        if (getDate_to() != null) {
            _hashCode += getDate_to().hashCode();
        }
        if (getInclude_unscheduled() != null) {
            _hashCode += getInclude_unscheduled().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_activities_date_filter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:toa:activity", "get_activities_date_filter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_from");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date_from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_to");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date_to"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("include_unscheduled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "include_unscheduled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
