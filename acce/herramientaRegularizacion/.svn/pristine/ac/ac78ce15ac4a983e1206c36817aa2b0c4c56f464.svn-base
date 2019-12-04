/**
 * Get_activities_resource_filter_element.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package activity.toa;

public class Get_activities_resource_filter_element  implements java.io.Serializable {
    private java.lang.String resource_id;

    private java.lang.String include_children;

    public Get_activities_resource_filter_element() {
    }

    public Get_activities_resource_filter_element(
           java.lang.String resource_id,
           java.lang.String include_children) {
           this.resource_id = resource_id;
           this.include_children = include_children;
    }


    /**
     * Gets the resource_id value for this Get_activities_resource_filter_element.
     * 
     * @return resource_id
     */
    public java.lang.String getResource_id() {
        return resource_id;
    }


    /**
     * Sets the resource_id value for this Get_activities_resource_filter_element.
     * 
     * @param resource_id
     */
    public void setResource_id(java.lang.String resource_id) {
        this.resource_id = resource_id;
    }


    /**
     * Gets the include_children value for this Get_activities_resource_filter_element.
     * 
     * @return include_children
     */
    public java.lang.String getInclude_children() {
        return include_children;
    }


    /**
     * Sets the include_children value for this Get_activities_resource_filter_element.
     * 
     * @param include_children
     */
    public void setInclude_children(java.lang.String include_children) {
        this.include_children = include_children;
    }

    private java.lang.Object __equalsCalc = null;
    @Override
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_activities_resource_filter_element)) return false;
        Get_activities_resource_filter_element other = (Get_activities_resource_filter_element) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resource_id==null && other.getResource_id()==null) || 
             (this.resource_id!=null &&
              this.resource_id.equals(other.getResource_id()))) &&
            ((this.include_children==null && other.getInclude_children()==null) || 
             (this.include_children!=null &&
              this.include_children.equals(other.getInclude_children())));
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
        if (getResource_id() != null) {
            _hashCode += getResource_id().hashCode();
        }
        if (getInclude_children() != null) {
            _hashCode += getInclude_children().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_activities_resource_filter_element.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:toa:activity", "get_activities_resource_filter_element"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resource_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resource_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("include_children");
        elemField.setXmlName(new javax.xml.namespace.QName("", "include_children"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
