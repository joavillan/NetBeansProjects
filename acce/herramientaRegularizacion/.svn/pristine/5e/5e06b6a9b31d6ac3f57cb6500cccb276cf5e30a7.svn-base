/**
 * Activity_list.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package activity.toa;

public class Activity_list  implements java.io.Serializable {
    private int total;

    private activity.toa.Property[][] activities;

    private java.lang.String route_start_time;

    private java.lang.String route_end_time;

    private java.lang.String route_reactivation_time;

    public Activity_list() {
    }

    public Activity_list(
           int total,
           activity.toa.Property[][] activities,
           java.lang.String route_start_time,
           java.lang.String route_end_time,
           java.lang.String route_reactivation_time) {
           this.total = total;
           this.activities = activities;
           this.route_start_time = route_start_time;
           this.route_end_time = route_end_time;
           this.route_reactivation_time = route_reactivation_time;
    }


    /**
     * Gets the total value for this Activity_list.
     * 
     * @return total
     */
    public int getTotal() {
        return total;
    }


    /**
     * Sets the total value for this Activity_list.
     * 
     * @param total
     */
    public void setTotal(int total) {
        this.total = total;
    }


    /**
     * Gets the activities value for this Activity_list.
     * 
     * @return activities
     */
    public activity.toa.Property[][] getActivities() {
        return activities;
    }


    /**
     * Sets the activities value for this Activity_list.
     * 
     * @param activities
     */
    public void setActivities(activity.toa.Property[][] activities) {
        this.activities = activities;
    }


    /**
     * Gets the route_start_time value for this Activity_list.
     * 
     * @return route_start_time
     */
    public java.lang.String getRoute_start_time() {
        return route_start_time;
    }


    /**
     * Sets the route_start_time value for this Activity_list.
     * 
     * @param route_start_time
     */
    public void setRoute_start_time(java.lang.String route_start_time) {
        this.route_start_time = route_start_time;
    }


    /**
     * Gets the route_end_time value for this Activity_list.
     * 
     * @return route_end_time
     */
    public java.lang.String getRoute_end_time() {
        return route_end_time;
    }


    /**
     * Sets the route_end_time value for this Activity_list.
     * 
     * @param route_end_time
     */
    public void setRoute_end_time(java.lang.String route_end_time) {
        this.route_end_time = route_end_time;
    }


    /**
     * Gets the route_reactivation_time value for this Activity_list.
     * 
     * @return route_reactivation_time
     */
    public java.lang.String getRoute_reactivation_time() {
        return route_reactivation_time;
    }


    /**
     * Sets the route_reactivation_time value for this Activity_list.
     * 
     * @param route_reactivation_time
     */
    public void setRoute_reactivation_time(java.lang.String route_reactivation_time) {
        this.route_reactivation_time = route_reactivation_time;
    }

    private java.lang.Object __equalsCalc = null;
    @Override
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Activity_list)) return false;
        Activity_list other = (Activity_list) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.total == other.getTotal() &&
            ((this.activities==null && other.getActivities()==null) || 
             (this.activities!=null &&
              java.util.Arrays.equals(this.activities, other.getActivities()))) &&
            ((this.route_start_time==null && other.getRoute_start_time()==null) || 
             (this.route_start_time!=null &&
              this.route_start_time.equals(other.getRoute_start_time()))) &&
            ((this.route_end_time==null && other.getRoute_end_time()==null) || 
             (this.route_end_time!=null &&
              this.route_end_time.equals(other.getRoute_end_time()))) &&
            ((this.route_reactivation_time==null && other.getRoute_reactivation_time()==null) || 
             (this.route_reactivation_time!=null &&
              this.route_reactivation_time.equals(other.getRoute_reactivation_time())));
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
        _hashCode += getTotal();
        if (getActivities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActivities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActivities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRoute_start_time() != null) {
            _hashCode += getRoute_start_time().hashCode();
        }
        if (getRoute_end_time() != null) {
            _hashCode += getRoute_end_time().hashCode();
        }
        if (getRoute_reactivation_time() != null) {
            _hashCode += getRoute_reactivation_time().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Activity_list.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:toa:activity", "activity_list"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("", "total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activities");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activities"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:toa:activity", "activity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "activity"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("route_start_time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "route_start_time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("route_end_time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "route_end_time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("route_reactivation_time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "route_reactivation_time"));
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
