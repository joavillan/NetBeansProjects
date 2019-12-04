/**
 * Link.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package activity.toa;

public class Link  implements java.io.Serializable {
    private java.lang.String link_type;

    private java.lang.String activity_id;

    private java.lang.String resource_id;

    private java.lang.String resource_name;

    private java.lang.String activity_status;

    private java.lang.String activity_identifier;

    private java.lang.String activity_start_time;

    private java.lang.Integer alerts;

    private java.lang.Boolean is_broken;

    private java.lang.String min_interval;

    private java.lang.String max_interval;

    public Link() {
    }

    public Link(
           java.lang.String link_type,
           java.lang.String activity_id,
           java.lang.String resource_id,
           java.lang.String resource_name,
           java.lang.String activity_status,
           java.lang.String activity_identifier,
           java.lang.String activity_start_time,
           java.lang.Integer alerts,
           java.lang.Boolean is_broken,
           java.lang.String min_interval,
           java.lang.String max_interval) {
           this.link_type = link_type;
           this.activity_id = activity_id;
           this.resource_id = resource_id;
           this.resource_name = resource_name;
           this.activity_status = activity_status;
           this.activity_identifier = activity_identifier;
           this.activity_start_time = activity_start_time;
           this.alerts = alerts;
           this.is_broken = is_broken;
           this.min_interval = min_interval;
           this.max_interval = max_interval;
    }


    /**
     * Gets the link_type value for this Link.
     * 
     * @return link_type
     */
    public java.lang.String getLink_type() {
        return link_type;
    }


    /**
     * Sets the link_type value for this Link.
     * 
     * @param link_type
     */
    public void setLink_type(java.lang.String link_type) {
        this.link_type = link_type;
    }


    /**
     * Gets the activity_id value for this Link.
     * 
     * @return activity_id
     */
    public java.lang.String getActivity_id() {
        return activity_id;
    }


    /**
     * Sets the activity_id value for this Link.
     * 
     * @param activity_id
     */
    public void setActivity_id(java.lang.String activity_id) {
        this.activity_id = activity_id;
    }


    /**
     * Gets the resource_id value for this Link.
     * 
     * @return resource_id
     */
    public java.lang.String getResource_id() {
        return resource_id;
    }


    /**
     * Sets the resource_id value for this Link.
     * 
     * @param resource_id
     */
    public void setResource_id(java.lang.String resource_id) {
        this.resource_id = resource_id;
    }


    /**
     * Gets the resource_name value for this Link.
     * 
     * @return resource_name
     */
    public java.lang.String getResource_name() {
        return resource_name;
    }


    /**
     * Sets the resource_name value for this Link.
     * 
     * @param resource_name
     */
    public void setResource_name(java.lang.String resource_name) {
        this.resource_name = resource_name;
    }


    /**
     * Gets the activity_status value for this Link.
     * 
     * @return activity_status
     */
    public java.lang.String getActivity_status() {
        return activity_status;
    }


    /**
     * Sets the activity_status value for this Link.
     * 
     * @param activity_status
     */
    public void setActivity_status(java.lang.String activity_status) {
        this.activity_status = activity_status;
    }


    /**
     * Gets the activity_identifier value for this Link.
     * 
     * @return activity_identifier
     */
    public java.lang.String getActivity_identifier() {
        return activity_identifier;
    }


    /**
     * Sets the activity_identifier value for this Link.
     * 
     * @param activity_identifier
     */
    public void setActivity_identifier(java.lang.String activity_identifier) {
        this.activity_identifier = activity_identifier;
    }


    /**
     * Gets the activity_start_time value for this Link.
     * 
     * @return activity_start_time
     */
    public java.lang.String getActivity_start_time() {
        return activity_start_time;
    }


    /**
     * Sets the activity_start_time value for this Link.
     * 
     * @param activity_start_time
     */
    public void setActivity_start_time(java.lang.String activity_start_time) {
        this.activity_start_time = activity_start_time;
    }


    /**
     * Gets the alerts value for this Link.
     * 
     * @return alerts
     */
    public java.lang.Integer getAlerts() {
        return alerts;
    }


    /**
     * Sets the alerts value for this Link.
     * 
     * @param alerts
     */
    public void setAlerts(java.lang.Integer alerts) {
        this.alerts = alerts;
    }


    /**
     * Gets the is_broken value for this Link.
     * 
     * @return is_broken
     */
    public java.lang.Boolean getIs_broken() {
        return is_broken;
    }


    /**
     * Sets the is_broken value for this Link.
     * 
     * @param is_broken
     */
    public void setIs_broken(java.lang.Boolean is_broken) {
        this.is_broken = is_broken;
    }


    /**
     * Gets the min_interval value for this Link.
     * 
     * @return min_interval
     */
    public java.lang.String getMin_interval() {
        return min_interval;
    }


    /**
     * Sets the min_interval value for this Link.
     * 
     * @param min_interval
     */
    public void setMin_interval(java.lang.String min_interval) {
        this.min_interval = min_interval;
    }


    /**
     * Gets the max_interval value for this Link.
     * 
     * @return max_interval
     */
    public java.lang.String getMax_interval() {
        return max_interval;
    }


    /**
     * Sets the max_interval value for this Link.
     * 
     * @param max_interval
     */
    public void setMax_interval(java.lang.String max_interval) {
        this.max_interval = max_interval;
    }

    private java.lang.Object __equalsCalc = null;
    @Override
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Link)) return false;
        Link other = (Link) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.link_type==null && other.getLink_type()==null) || 
             (this.link_type!=null &&
              this.link_type.equals(other.getLink_type()))) &&
            ((this.activity_id==null && other.getActivity_id()==null) || 
             (this.activity_id!=null &&
              this.activity_id.equals(other.getActivity_id()))) &&
            ((this.resource_id==null && other.getResource_id()==null) || 
             (this.resource_id!=null &&
              this.resource_id.equals(other.getResource_id()))) &&
            ((this.resource_name==null && other.getResource_name()==null) || 
             (this.resource_name!=null &&
              this.resource_name.equals(other.getResource_name()))) &&
            ((this.activity_status==null && other.getActivity_status()==null) || 
             (this.activity_status!=null &&
              this.activity_status.equals(other.getActivity_status()))) &&
            ((this.activity_identifier==null && other.getActivity_identifier()==null) || 
             (this.activity_identifier!=null &&
              this.activity_identifier.equals(other.getActivity_identifier()))) &&
            ((this.activity_start_time==null && other.getActivity_start_time()==null) || 
             (this.activity_start_time!=null &&
              this.activity_start_time.equals(other.getActivity_start_time()))) &&
            ((this.alerts==null && other.getAlerts()==null) || 
             (this.alerts!=null &&
              this.alerts.equals(other.getAlerts()))) &&
            ((this.is_broken==null && other.getIs_broken()==null) || 
             (this.is_broken!=null &&
              this.is_broken.equals(other.getIs_broken()))) &&
            ((this.min_interval==null && other.getMin_interval()==null) || 
             (this.min_interval!=null &&
              this.min_interval.equals(other.getMin_interval()))) &&
            ((this.max_interval==null && other.getMax_interval()==null) || 
             (this.max_interval!=null &&
              this.max_interval.equals(other.getMax_interval())));
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
        if (getLink_type() != null) {
            _hashCode += getLink_type().hashCode();
        }
        if (getActivity_id() != null) {
            _hashCode += getActivity_id().hashCode();
        }
        if (getResource_id() != null) {
            _hashCode += getResource_id().hashCode();
        }
        if (getResource_name() != null) {
            _hashCode += getResource_name().hashCode();
        }
        if (getActivity_status() != null) {
            _hashCode += getActivity_status().hashCode();
        }
        if (getActivity_identifier() != null) {
            _hashCode += getActivity_identifier().hashCode();
        }
        if (getActivity_start_time() != null) {
            _hashCode += getActivity_start_time().hashCode();
        }
        if (getAlerts() != null) {
            _hashCode += getAlerts().hashCode();
        }
        if (getIs_broken() != null) {
            _hashCode += getIs_broken().hashCode();
        }
        if (getMin_interval() != null) {
            _hashCode += getMin_interval().hashCode();
        }
        if (getMax_interval() != null) {
            _hashCode += getMax_interval().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Link.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:toa:activity", "link"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("link_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "link_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activity_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activity_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resource_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resource_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resource_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resource_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activity_status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activity_status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activity_identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activity_identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activity_start_time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activity_start_time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alerts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alerts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("is_broken");
        elemField.setXmlName(new javax.xml.namespace.QName("", "is_broken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("min_interval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "min_interval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("max_interval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "max_interval"));
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
