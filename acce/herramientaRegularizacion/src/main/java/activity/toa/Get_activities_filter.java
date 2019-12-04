/**
 * Get_activities_filter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package activity.toa;

public class Get_activities_filter  implements java.io.Serializable {
    private java.lang.String field;

    private java.lang.String operator;

    private java.lang.String[] value;

    private java.lang.Boolean ignore_case;

    private java.lang.String collation;

    private java.lang.String group_operator;

    private activity.toa.Get_activities_filter[] group;

    public Get_activities_filter() {
    }

    public Get_activities_filter(
           java.lang.String field,
           java.lang.String operator,
           java.lang.String[] value,
           java.lang.Boolean ignore_case,
           java.lang.String collation,
           java.lang.String group_operator,
           activity.toa.Get_activities_filter[] group) {
           this.field = field;
           this.operator = operator;
           this.value = value;
           this.ignore_case = ignore_case;
           this.collation = collation;
           this.group_operator = group_operator;
           this.group = group;
    }


    /**
     * Gets the field value for this Get_activities_filter.
     * 
     * @return field
     */
    public java.lang.String getField() {
        return field;
    }


    /**
     * Sets the field value for this Get_activities_filter.
     * 
     * @param field
     */
    public void setField(java.lang.String field) {
        this.field = field;
    }


    /**
     * Gets the operator value for this Get_activities_filter.
     * 
     * @return operator
     */
    public java.lang.String getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this Get_activities_filter.
     * 
     * @param operator
     */
    public void setOperator(java.lang.String operator) {
        this.operator = operator;
    }


    /**
     * Gets the value value for this Get_activities_filter.
     * 
     * @return value
     */
    public java.lang.String[] getValue() {
        return value;
    }


    /**
     * Sets the value value for this Get_activities_filter.
     * 
     * @param value
     */
    public void setValue(java.lang.String[] value) {
        this.value = value;
    }

    public java.lang.String getValue(int i) {
        return this.value[i];
    }

    public void setValue(int i, java.lang.String _value) {
        this.value[i] = _value;
    }


    /**
     * Gets the ignore_case value for this Get_activities_filter.
     * 
     * @return ignore_case
     */
    public java.lang.Boolean getIgnore_case() {
        return ignore_case;
    }


    /**
     * Sets the ignore_case value for this Get_activities_filter.
     * 
     * @param ignore_case
     */
    public void setIgnore_case(java.lang.Boolean ignore_case) {
        this.ignore_case = ignore_case;
    }


    /**
     * Gets the collation value for this Get_activities_filter.
     * 
     * @return collation
     */
    public java.lang.String getCollation() {
        return collation;
    }


    /**
     * Sets the collation value for this Get_activities_filter.
     * 
     * @param collation
     */
    public void setCollation(java.lang.String collation) {
        this.collation = collation;
    }


    /**
     * Gets the group_operator value for this Get_activities_filter.
     * 
     * @return group_operator
     */
    public java.lang.String getGroup_operator() {
        return group_operator;
    }


    /**
     * Sets the group_operator value for this Get_activities_filter.
     * 
     * @param group_operator
     */
    public void setGroup_operator(java.lang.String group_operator) {
        this.group_operator = group_operator;
    }


    /**
     * Gets the group value for this Get_activities_filter.
     * 
     * @return group
     */
    public activity.toa.Get_activities_filter[] getGroup() {
        return group;
    }


    /**
     * Sets the group value for this Get_activities_filter.
     * 
     * @param group
     */
    public void setGroup(activity.toa.Get_activities_filter[] group) {
        this.group = group;
    }

    private java.lang.Object __equalsCalc = null;
    @Override
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_activities_filter)) return false;
        Get_activities_filter other = (Get_activities_filter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.field==null && other.getField()==null) || 
             (this.field!=null &&
              this.field.equals(other.getField()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              java.util.Arrays.equals(this.value, other.getValue()))) &&
            ((this.ignore_case==null && other.getIgnore_case()==null) || 
             (this.ignore_case!=null &&
              this.ignore_case.equals(other.getIgnore_case()))) &&
            ((this.collation==null && other.getCollation()==null) || 
             (this.collation!=null &&
              this.collation.equals(other.getCollation()))) &&
            ((this.group_operator==null && other.getGroup_operator()==null) || 
             (this.group_operator!=null &&
              this.group_operator.equals(other.getGroup_operator()))) &&
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              java.util.Arrays.equals(this.group, other.getGroup())));
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
        if (getField() != null) {
            _hashCode += getField().hashCode();
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        if (getValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIgnore_case() != null) {
            _hashCode += getIgnore_case().hashCode();
        }
        if (getCollation() != null) {
            _hashCode += getCollation().hashCode();
        }
        if (getGroup_operator() != null) {
            _hashCode += getGroup_operator().hashCode();
        }
        if (getGroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroup(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_activities_filter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:toa:activity", "get_activities_filter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("field");
        elemField.setXmlName(new javax.xml.namespace.QName("", "field"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ignore_case");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ignore_case"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "collation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group_operator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "group_operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("", "group"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:toa:activity", "get_activities_filter"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "filter_expression"));
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
