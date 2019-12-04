/**
 * ApiBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package activity.toa;

public class ApiBindingStub extends org.apache.axis.client.Stub implements activity.toa.ApiPortType {
	private java.util.Vector cachedSerClasses = new java.util.Vector();
	private java.util.Vector cachedSerQNames = new java.util.Vector();
	private java.util.Vector cachedSerFactories = new java.util.Vector();
	private java.util.Vector cachedDeserFactories = new java.util.Vector();

	static org.apache.axis.description.OperationDesc [] _operations;

	static {
		_operations = new org.apache.axis.description.OperationDesc[26];
		_initOperationDesc1();
		_initOperationDesc2();
		_initOperationDesc3();
	}

	private static void _initOperationDesc1(){
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("create_activity");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "user"), activity.toa.User.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "resource_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "position_in_route"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "properties"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "property"), activity.toa.Property[].class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "result_code"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "error_msg"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:toa:activity", "activity"), activity.toa.Property[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName("", "properties"));
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity_list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:toa:activity", "activity_list"), activity.toa.Activity_list.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[0] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("update_activity");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "user"), activity.toa.User.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "position_in_route"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "properties"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "property"), activity.toa.Property[].class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "result_code"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "error_msg"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:toa:activity", "activity"), activity.toa.Property[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName("", "properties"));
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity_list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:toa:activity", "activity_list"), activity.toa.Activity_list.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[1] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("reopen_activity");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "user"), activity.toa.User.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "position_in_route"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "properties"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "property"), activity.toa.Property[].class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "result_code"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "error_msg"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:toa:activity", "activity"), activity.toa.Property[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName("", "properties"));
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity_list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:toa:activity", "activity_list"), activity.toa.Activity_list.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[2] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("start_activity");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "user"), activity.toa.User.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "time"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "properties"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "property"), activity.toa.Property[].class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "result_code"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "error_msg"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:toa:activity", "activity"), activity.toa.Property[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName("", "properties"));
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity_list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:toa:activity", "activity_list"), activity.toa.Activity_list.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[3] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("complete_activity");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "user"), activity.toa.User.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "time"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "properties"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "property"), activity.toa.Property[].class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "result_code"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "error_msg"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:toa:activity", "activity"), activity.toa.Property[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName("", "properties"));
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity_list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:toa:activity", "activity_list"), activity.toa.Activity_list.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[4] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("suspend_activity");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "user"), activity.toa.User.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "time"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "properties"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "property"), activity.toa.Property[].class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "result_code"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "error_msg"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:toa:activity", "activity"), activity.toa.Property[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName("", "properties"));
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity_list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:toa:activity", "activity_list"), activity.toa.Activity_list.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[5] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("cancel_activity");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "user"), activity.toa.User.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "time"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "properties"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "property"), activity.toa.Property[].class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "result_code"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "error_msg"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:toa:activity", "activity"), activity.toa.Property[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName("", "properties"));
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity_list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:toa:activity", "activity_list"), activity.toa.Activity_list.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[6] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("prework_activity");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "user"), activity.toa.User.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "time"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "properties"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "property"), activity.toa.Property[].class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "result_code"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "error_msg"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:toa:activity", "activity"), activity.toa.Property[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName("", "properties"));
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity_list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:toa:activity", "activity_list"), activity.toa.Activity_list.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[7] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("delay_activity");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "user"), activity.toa.User.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "properties"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "property"), activity.toa.Property[].class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "result_code"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "error_msg"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:toa:activity", "activity"), activity.toa.Property[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName("", "properties"));
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity_list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:toa:activity", "activity_list"), activity.toa.Activity_list.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[8] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("get_activity");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "user"), activity.toa.User.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "result_code"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "error_msg"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:toa:activity", "activity"), activity.toa.Property[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName("", "properties"));
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity_list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:toa:activity", "activity_list"), activity.toa.Activity_list.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[9] = oper;

	}

	private static void _initOperationDesc2(){
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("search_activities");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "user"), activity.toa.User.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "search_in"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "search_for"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "date_from"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "date_to"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "select_from"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "select_count"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "order"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "property_filter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "result_code"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "error_msg"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:toa:activity", "activity"), activity.toa.Property[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName("", "properties"));
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity_list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:toa:activity", "activity_list"), activity.toa.Activity_list.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[10] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("get_route");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "user"), activity.toa.User.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "resource_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "property_filter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "select_from"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "select_count"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "result_code"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "error_msg"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:toa:activity", "activity"), activity.toa.Property[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName("", "properties"));
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity_list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:toa:activity", "activity_list"), activity.toa.Activity_list.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[11] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("start_route");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "user"), activity.toa.User.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "resource_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "time"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "result_code"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "error_msg"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[12] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("end_route");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "user"), activity.toa.User.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "resource_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "time"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "result_code"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "error_msg"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[13] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("link_activities");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "user"), activity.toa.User.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "from_activity_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "to_activity_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "link_type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "min_interval"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "max_interval"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "result_code"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "error_msg"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[14] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("unlink_activities");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "user"), activity.toa.User.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "from_activity_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "to_activity_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "link_type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "result_code"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "error_msg"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[15] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("get_activity_links");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "user"), activity.toa.User.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "result_code"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "error_msg"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "link"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:toa:activity", "link"), activity.toa.Link[].class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[16] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("set_file");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "user"), activity.toa.User.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "entity_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "property_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "file_name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "file_data"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2005/05/xmlmime", "base64Binary"), org.w3.www._2005._05.xmlmime.Base64Binary.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "file_mime_type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "result_code"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "error_msg"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[17] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("get_file");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "user"), activity.toa.User.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "entity_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "property_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "result_code"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "error_msg"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "file_name"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "file_data"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2005/05/xmlmime", "base64Binary"), org.w3.www._2005._05.xmlmime.Base64Binary.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "file_mime_type"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[18] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("delete_file");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "user"), activity.toa.User.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "entity_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "property_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "result_code"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "error_msg"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[19] = oper;

	}

	private static void _initOperationDesc3(){
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("set_resource_preferences");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "user"), activity.toa.User.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "preference"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "resource_preference"), activity.toa.Resource_preference[].class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "result_code"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "error_msg"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[20] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("get_resource_preferences");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "user"), activity.toa.User.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "result_code"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "error_msg"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "preference"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:toa:activity", "resource_preference"), activity.toa.Resource_preference[].class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[21] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("set_required_inventories");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "user"), activity.toa.User.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "required_inventory"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "required_inventory"), activity.toa.Required_inventory[].class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "result_code"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "error_msg"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[22] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("get_required_inventories");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "user"), activity.toa.User.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "result_code"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "error_msg"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "required_inventory"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:toa:activity", "required_inventory"), activity.toa.Required_inventory[].class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[23] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("get_activity_work_skills");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "user"), activity.toa.User.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activity_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "result_code"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "error_msg"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "work_skill"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:toa:activity", "work_skill"), activity.toa.Work_skill[].class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "capacity_category"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:toa:activity", "capacity_category"), activity.toa.Capacity_category[].class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[24] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("get_activities");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "user"), activity.toa.User.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "resources"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "get_activities_resource_filter"), activity.toa.Get_activities_resource_filter_element[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName("", "resource"));
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "date_range"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "get_activities_date_filter"), activity.toa.Get_activities_date_filter.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "select_from"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "select_count"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filter_expression"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "get_activities_filter"), activity.toa.Get_activities_filter.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "required_properties"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:toa:activity", "get_activities_property_filter"), java.lang.String[].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName("", "label"));
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "result_code"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "error_msg"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "expression"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "activities"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:toa:activity", "activities"), activity.toa.Property[][].class, false, false);
		param.setItemQName(new javax.xml.namespace.QName("", "activity"));
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "have_more_results"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), java.lang.Boolean.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "statistics"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[25] = oper;

	}

	public ApiBindingStub() throws org.apache.axis.AxisFault {
		this(null);
	}

	public ApiBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
		this(service);
		super.cachedEndpoint = endpointURL;
	}

	public ApiBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
		if (service == null) {
			super.service = new org.apache.axis.client.Service();
		} else {
			super.service = service;
		}
		((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
		java.lang.Class cls;
		javax.xml.namespace.QName qName;
		javax.xml.namespace.QName qName2;
		java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
		java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
		java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
		java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
		java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
		java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
		java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
		java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
		java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
		java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
		qName = new javax.xml.namespace.QName("http://www.w3.org/2005/05/xmlmime", ">contentType");
		cachedSerQNames.add(qName);
		cls = java.lang.String.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
		cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

		qName = new javax.xml.namespace.QName("http://www.w3.org/2005/05/xmlmime", "base64Binary");
		cachedSerQNames.add(qName);
		cls = org.w3.www._2005._05.xmlmime.Base64Binary.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
		cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

		qName = new javax.xml.namespace.QName("urn:toa:activity", "activities");
		cachedSerQNames.add(qName);
		cls = activity.toa.Property[][].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("urn:toa:activity", "activity");
		qName2 = new javax.xml.namespace.QName("", "activity");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:toa:activity", "activity");
		cachedSerQNames.add(qName);
		cls = activity.toa.Property[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("urn:toa:activity", "property");
		qName2 = new javax.xml.namespace.QName("", "properties");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:toa:activity", "activity_list");
		cachedSerQNames.add(qName);
		cls = activity.toa.Activity_list.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:toa:activity", "capacity_category");
		cachedSerQNames.add(qName);
		cls = activity.toa.Capacity_category.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:toa:activity", "get_activities_date_filter");
		cachedSerQNames.add(qName);
		cls = activity.toa.Get_activities_date_filter.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:toa:activity", "get_activities_filter");
		cachedSerQNames.add(qName);
		cls = activity.toa.Get_activities_filter.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:toa:activity", "get_activities_filter_list");
		cachedSerQNames.add(qName);
		cls = activity.toa.Get_activities_filter[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("urn:toa:activity", "get_activities_filter");
		qName2 = new javax.xml.namespace.QName("", "filter_expression");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:toa:activity", "get_activities_property_filter");
		cachedSerQNames.add(qName);
		cls = java.lang.String[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
		qName2 = new javax.xml.namespace.QName("", "label");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:toa:activity", "get_activities_resource_filter");
		cachedSerQNames.add(qName);
		cls = activity.toa.Get_activities_resource_filter_element[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("urn:toa:activity", "get_activities_resource_filter_element");
		qName2 = new javax.xml.namespace.QName("", "resource");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:toa:activity", "get_activities_resource_filter_element");
		cachedSerQNames.add(qName);
		cls = activity.toa.Get_activities_resource_filter_element.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:toa:activity", "link");
		cachedSerQNames.add(qName);
		cls = activity.toa.Link.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:toa:activity", "property");
		cachedSerQNames.add(qName);
		cls = activity.toa.Property.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:toa:activity", "required_inventory");
		cachedSerQNames.add(qName);
		cls = activity.toa.Required_inventory.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:toa:activity", "resource_preference");
		cachedSerQNames.add(qName);
		cls = activity.toa.Resource_preference.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:toa:activity", "user");
		cachedSerQNames.add(qName);
		cls = activity.toa.User.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:toa:activity", "work_skill");
		cachedSerQNames.add(qName);
		cls = activity.toa.Work_skill.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

	}

	protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
		try {
			org.apache.axis.client.Call _call = super._createCall();
			if (super.maintainSessionSet) {
				_call.setMaintainSession(super.maintainSession);
			}
			if (super.cachedUsername != null) {
				_call.setUsername(super.cachedUsername);
			}
			if (super.cachedPassword != null) {
				_call.setPassword(super.cachedPassword);
			}
			if (super.cachedEndpoint != null) {
				_call.setTargetEndpointAddress(super.cachedEndpoint);
			}
			if (super.cachedTimeout != null) {
				_call.setTimeout(super.cachedTimeout);
			}
			if (super.cachedPortName != null) {
				_call.setPortName(super.cachedPortName);
			}
			java.util.Enumeration keys = super.cachedProperties.keys();
			while (keys.hasMoreElements()) {
				java.lang.String key = (java.lang.String) keys.nextElement();
				_call.setProperty(key, super.cachedProperties.get(key));
			}
			// All the type mapping information is registered
			// when the first call is made.
			// The type mapping information is actually registered in
			// the TypeMappingRegistry of the service, which
			// is the reason why registration is only needed for the first call.
			synchronized (this) {
				if (firstCall()) {
					// must set encoding style before registering serializers
					_call.setEncodingStyle(null);
					for (int i = 0; i < cachedSerFactories.size(); ++i) {
						java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
						javax.xml.namespace.QName qName =
								(javax.xml.namespace.QName) cachedSerQNames.get(i);
						java.lang.Object x = cachedSerFactories.get(i);
						if (x instanceof Class) {
							java.lang.Class sf = (java.lang.Class)
									cachedSerFactories.get(i);
							java.lang.Class df = (java.lang.Class)
									cachedDeserFactories.get(i);
							_call.registerTypeMapping(cls, qName, sf, df, false);
						}
						else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
							org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
									cachedSerFactories.get(i);
							org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
									cachedDeserFactories.get(i);
							_call.registerTypeMapping(cls, qName, sf, df, false);
						}
					}
				}
			}
			return _call;
		}
		catch (java.lang.Throwable _t) {
			throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
		}
	}

	@Override
	public void create_activity(activity.toa.User user, java.lang.String date, java.lang.String resource_id, java.lang.String position_in_route, activity.toa.Property[] properties, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg, activity.toa.holders.ActivityHolder activity, activity.toa.holders.Activity_listHolder activity_list) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[0]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("activity/create_activity");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("urn:toa:activity", "create_activity"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, date, resource_id, position_in_route, properties});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			java.util.Map _output;
			_output = _call.getOutputParams();
			try {
				result_code.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "result_code"))).intValue();
			} catch (java.lang.Exception _exception) {
				result_code.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "result_code")), int.class)).intValue();
			}
			try {
				error_msg.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "error_msg"));
			} catch (java.lang.Exception _exception) {
				error_msg.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "error_msg")), java.lang.String.class);
			}
			try {
				activity.value = (activity.toa.Property[]) _output.get(new javax.xml.namespace.QName("", "activity"));
			} catch (java.lang.Exception _exception) {
				activity.value = (activity.toa.Property[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "activity")), activity.toa.Property[].class);
			}
			try {
				activity_list.value = (activity.toa.Activity_list) _output.get(new javax.xml.namespace.QName("", "activity_list"));
			} catch (java.lang.Exception _exception) {
				activity_list.value = (activity.toa.Activity_list) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "activity_list")), activity.toa.Activity_list.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	
	@Override
	public void update_activity(activity.toa.User user, java.lang.String activity_id, java.lang.String position_in_route, activity.toa.Property[] properties, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg, activity.toa.holders.ActivityHolder activity, activity.toa.holders.Activity_listHolder activity_list) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[1]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("activity/update_activity");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("urn:toa:activity", "update_activity"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, activity_id, position_in_route, properties});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			java.util.Map _output;
			_output = _call.getOutputParams();
			try {
				result_code.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "result_code"))).intValue();
			} catch (java.lang.Exception _exception) {
				result_code.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "result_code")), int.class)).intValue();
			}
			try {
				error_msg.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "error_msg"));
			} catch (java.lang.Exception _exception) {
				error_msg.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "error_msg")), java.lang.String.class);
			}
			try {
				activity.value = (activity.toa.Property[]) _output.get(new javax.xml.namespace.QName("", "activity"));
			} catch (java.lang.Exception _exception) {
				activity.value = (activity.toa.Property[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "activity")), activity.toa.Property[].class);
			}
			try {
				activity_list.value = (activity.toa.Activity_list) _output.get(new javax.xml.namespace.QName("", "activity_list"));
			} catch (java.lang.Exception _exception) {
				activity_list.value = (activity.toa.Activity_list) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "activity_list")), activity.toa.Activity_list.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	
	@Override
	public void reopen_activity(activity.toa.User user, java.lang.String activity_id, java.lang.String position_in_route, activity.toa.Property[] properties, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg, activity.toa.holders.ActivityHolder activity, activity.toa.holders.Activity_listHolder activity_list) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[2]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("activity/reopen_activity");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("urn:toa:activity", "reopen_activity"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, activity_id, position_in_route, properties});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			java.util.Map _output;
			_output = _call.getOutputParams();
			try {
				result_code.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "result_code"))).intValue();
			} catch (java.lang.Exception _exception) {
				result_code.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "result_code")), int.class)).intValue();
			}
			try {
				error_msg.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "error_msg"));
			} catch (java.lang.Exception _exception) {
				error_msg.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "error_msg")), java.lang.String.class);
			}
			try {
				activity.value = (activity.toa.Property[]) _output.get(new javax.xml.namespace.QName("", "activity"));
			} catch (java.lang.Exception _exception) {
				activity.value = (activity.toa.Property[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "activity")), activity.toa.Property[].class);
			}
			try {
				activity_list.value = (activity.toa.Activity_list) _output.get(new javax.xml.namespace.QName("", "activity_list"));
			} catch (java.lang.Exception _exception) {
				activity_list.value = (activity.toa.Activity_list) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "activity_list")), activity.toa.Activity_list.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	
	@Override
	public void start_activity(activity.toa.User user, java.lang.String activity_id, java.lang.String date, java.lang.String time, activity.toa.Property[] properties, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg, activity.toa.holders.ActivityHolder activity, activity.toa.holders.Activity_listHolder activity_list) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[3]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("activity/start_activity");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("urn:toa:activity", "start_activity"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, activity_id, date, time, properties});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			java.util.Map _output;
			_output = _call.getOutputParams();
			try {
				result_code.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "result_code"))).intValue();
			} catch (java.lang.Exception _exception) {
				result_code.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "result_code")), int.class)).intValue();
			}
			try {
				error_msg.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "error_msg"));
			} catch (java.lang.Exception _exception) {
				error_msg.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "error_msg")), java.lang.String.class);
			}
			try {
				activity.value = (activity.toa.Property[]) _output.get(new javax.xml.namespace.QName("", "activity"));
			} catch (java.lang.Exception _exception) {
				activity.value = (activity.toa.Property[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "activity")), activity.toa.Property[].class);
			}
			try {
				activity_list.value = (activity.toa.Activity_list) _output.get(new javax.xml.namespace.QName("", "activity_list"));
			} catch (java.lang.Exception _exception) {
				activity_list.value = (activity.toa.Activity_list) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "activity_list")), activity.toa.Activity_list.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	
	@Override
	public void complete_activity(activity.toa.User user, java.lang.String activity_id, java.lang.String date, java.lang.String time, activity.toa.Property[] properties, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg, activity.toa.holders.ActivityHolder activity, activity.toa.holders.Activity_listHolder activity_list) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[4]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("activity/complete_activity");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("urn:toa:activity", "complete_activity"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, activity_id, date, time, properties});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			java.util.Map _output;
			_output = _call.getOutputParams();
			try {
				result_code.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "result_code"))).intValue();
			} catch (java.lang.Exception _exception) {
				result_code.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "result_code")), int.class)).intValue();
			}
			try {
				error_msg.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "error_msg"));
			} catch (java.lang.Exception _exception) {
				error_msg.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "error_msg")), java.lang.String.class);
			}
			try {
				activity.value = (activity.toa.Property[]) _output.get(new javax.xml.namespace.QName("", "activity"));
			} catch (java.lang.Exception _exception) {
				activity.value = (activity.toa.Property[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "activity")), activity.toa.Property[].class);
			}
			try {
				activity_list.value = (activity.toa.Activity_list) _output.get(new javax.xml.namespace.QName("", "activity_list"));
			} catch (java.lang.Exception _exception) {
				activity_list.value = (activity.toa.Activity_list) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "activity_list")), activity.toa.Activity_list.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	
	@Override
	public void suspend_activity(activity.toa.User user, java.lang.String activity_id, java.lang.String date, java.lang.String time, activity.toa.Property[] properties, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg, activity.toa.holders.ActivityHolder activity, activity.toa.holders.Activity_listHolder activity_list) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[5]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("activity/suspend_activity");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("urn:toa:activity", "suspend_activity"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, activity_id, date, time, properties});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			java.util.Map _output;
			_output = _call.getOutputParams();
			try {
				result_code.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "result_code"))).intValue();
			} catch (java.lang.Exception _exception) {
				result_code.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "result_code")), int.class)).intValue();
			}
			try {
				error_msg.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "error_msg"));
			} catch (java.lang.Exception _exception) {
				error_msg.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "error_msg")), java.lang.String.class);
			}
			try {
				activity.value = (activity.toa.Property[]) _output.get(new javax.xml.namespace.QName("", "activity"));
			} catch (java.lang.Exception _exception) {
				activity.value = (activity.toa.Property[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "activity")), activity.toa.Property[].class);
			}
			try {
				activity_list.value = (activity.toa.Activity_list) _output.get(new javax.xml.namespace.QName("", "activity_list"));
			} catch (java.lang.Exception _exception) {
				activity_list.value = (activity.toa.Activity_list) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "activity_list")), activity.toa.Activity_list.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	
	@Override
	public void cancel_activity(activity.toa.User user, java.lang.String activity_id, java.lang.String date, java.lang.String time, activity.toa.Property[] properties, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg, activity.toa.holders.ActivityHolder activity, activity.toa.holders.Activity_listHolder activity_list) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[6]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("activity/cancel_activity");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("urn:toa:activity", "cancel_activity"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, activity_id, date, time, properties});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			java.util.Map _output;
			_output = _call.getOutputParams();
			try {
				result_code.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "result_code"))).intValue();
			} catch (java.lang.Exception _exception) {
				result_code.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "result_code")), int.class)).intValue();
			}
			try {
				error_msg.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "error_msg"));
			} catch (java.lang.Exception _exception) {
				error_msg.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "error_msg")), java.lang.String.class);
			}
			try {
				activity.value = (activity.toa.Property[]) _output.get(new javax.xml.namespace.QName("", "activity"));
			} catch (java.lang.Exception _exception) {
				activity.value = (activity.toa.Property[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "activity")), activity.toa.Property[].class);
			}
			try {
				activity_list.value = (activity.toa.Activity_list) _output.get(new javax.xml.namespace.QName("", "activity_list"));
			} catch (java.lang.Exception _exception) {
				activity_list.value = (activity.toa.Activity_list) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "activity_list")), activity.toa.Activity_list.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	
	@Override
	public void prework_activity(activity.toa.User user, java.lang.String activity_id, java.lang.String date, java.lang.String time, activity.toa.Property[] properties, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg, activity.toa.holders.ActivityHolder activity, activity.toa.holders.Activity_listHolder activity_list) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[7]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("activity/prework_activity");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("urn:toa:activity", "prework_activity"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, activity_id, date, time, properties});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			java.util.Map _output;
			_output = _call.getOutputParams();
			try {
				result_code.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "result_code"))).intValue();
			} catch (java.lang.Exception _exception) {
				result_code.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "result_code")), int.class)).intValue();
			}
			try {
				error_msg.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "error_msg"));
			} catch (java.lang.Exception _exception) {
				error_msg.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "error_msg")), java.lang.String.class);
			}
			try {
				activity.value = (activity.toa.Property[]) _output.get(new javax.xml.namespace.QName("", "activity"));
			} catch (java.lang.Exception _exception) {
				activity.value = (activity.toa.Property[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "activity")), activity.toa.Property[].class);
			}
			try {
				activity_list.value = (activity.toa.Activity_list) _output.get(new javax.xml.namespace.QName("", "activity_list"));
			} catch (java.lang.Exception _exception) {
				activity_list.value = (activity.toa.Activity_list) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "activity_list")), activity.toa.Activity_list.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	
	@Override
	public void delay_activity(activity.toa.User user, java.lang.String activity_id, java.lang.String date, int value, activity.toa.Property[] properties, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg, activity.toa.holders.ActivityHolder activity, activity.toa.holders.Activity_listHolder activity_list) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[8]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("activity/delay_activity");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("urn:toa:activity", "delay_activity"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, activity_id, date, new java.lang.Integer(value), properties});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			java.util.Map _output;
			_output = _call.getOutputParams();
			try {
				result_code.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "result_code"))).intValue();
			} catch (java.lang.Exception _exception) {
				result_code.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "result_code")), int.class)).intValue();
			}
			try {
				error_msg.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "error_msg"));
			} catch (java.lang.Exception _exception) {
				error_msg.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "error_msg")), java.lang.String.class);
			}
			try {
				activity.value = (activity.toa.Property[]) _output.get(new javax.xml.namespace.QName("", "activity"));
			} catch (java.lang.Exception _exception) {
				activity.value = (activity.toa.Property[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "activity")), activity.toa.Property[].class);
			}
			try {
				activity_list.value = (activity.toa.Activity_list) _output.get(new javax.xml.namespace.QName("", "activity_list"));
			} catch (java.lang.Exception _exception) {
				activity_list.value = (activity.toa.Activity_list) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "activity_list")), activity.toa.Activity_list.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	
	@Override
	public void get_activity(activity.toa.User user, java.lang.String activity_id, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg, activity.toa.holders.ActivityHolder activity, activity.toa.holders.Activity_listHolder activity_list) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[9]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("activity/get_activity");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("urn:toa:activity", "get_activity"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, activity_id});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			java.util.Map _output;
			_output = _call.getOutputParams();
			try {
				result_code.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "result_code"))).intValue();
			} catch (java.lang.Exception _exception) {
				result_code.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "result_code")), int.class)).intValue();
			}
			try {
				error_msg.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "error_msg"));
			} catch (java.lang.Exception _exception) {
				error_msg.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "error_msg")), java.lang.String.class);
			}
			try {
				activity.value = (activity.toa.Property[]) _output.get(new javax.xml.namespace.QName("", "activity"));
			} catch (java.lang.Exception _exception) {
				activity.value = (activity.toa.Property[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "activity")), activity.toa.Property[].class);
			}
			try {
				activity_list.value = (activity.toa.Activity_list) _output.get(new javax.xml.namespace.QName("", "activity_list"));
			} catch (java.lang.Exception _exception) {
				activity_list.value = (activity.toa.Activity_list) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "activity_list")), activity.toa.Activity_list.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	
	@Override
	public void search_activities(activity.toa.User user, java.lang.String search_in, java.lang.String search_for, java.lang.String date_from, java.lang.String date_to, java.lang.String select_from, java.lang.String select_count, java.lang.String order, java.lang.String[] property_filter, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg, activity.toa.holders.ActivityHolder activity, activity.toa.holders.Activity_listHolder activity_list) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[10]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("activity/search_activities");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("urn:toa:activity", "search_activities"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, search_in, search_for, date_from, date_to, select_from, select_count, order, property_filter});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			java.util.Map _output;
			_output = _call.getOutputParams();
			try {
				result_code.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "result_code"))).intValue();
			} catch (java.lang.Exception _exception) {
				result_code.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "result_code")), int.class)).intValue();
			}
			try {
				error_msg.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "error_msg"));
			} catch (java.lang.Exception _exception) {
				error_msg.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "error_msg")), java.lang.String.class);
			}
			try {
				activity.value = (activity.toa.Property[]) _output.get(new javax.xml.namespace.QName("", "activity"));
			} catch (java.lang.Exception _exception) {
				activity.value = (activity.toa.Property[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "activity")), activity.toa.Property[].class);
			}
			try {
				activity_list.value = (activity.toa.Activity_list) _output.get(new javax.xml.namespace.QName("", "activity_list"));
			} catch (java.lang.Exception _exception) {
				activity_list.value = (activity.toa.Activity_list) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "activity_list")), activity.toa.Activity_list.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	
	@Override
	public void get_route(activity.toa.User user, java.lang.String date, java.lang.String resource_id, java.lang.String[] property_filter, java.lang.Integer select_from, java.lang.Integer select_count, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg, activity.toa.holders.ActivityHolder activity, activity.toa.holders.Activity_listHolder activity_list) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[11]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("activity/get_route");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("urn:toa:activity", "get_route"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, date, resource_id, property_filter, select_from, select_count});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			java.util.Map _output;
			_output = _call.getOutputParams();
			try {
				result_code.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "result_code"))).intValue();
			} catch (java.lang.Exception _exception) {
				result_code.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "result_code")), int.class)).intValue();
			}
			try {
				error_msg.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "error_msg"));
			} catch (java.lang.Exception _exception) {
				error_msg.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "error_msg")), java.lang.String.class);
			}
			try {
				activity.value = (activity.toa.Property[]) _output.get(new javax.xml.namespace.QName("", "activity"));
			} catch (java.lang.Exception _exception) {
				activity.value = (activity.toa.Property[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "activity")), activity.toa.Property[].class);
			}
			try {
				activity_list.value = (activity.toa.Activity_list) _output.get(new javax.xml.namespace.QName("", "activity_list"));
			} catch (java.lang.Exception _exception) {
				activity_list.value = (activity.toa.Activity_list) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "activity_list")), activity.toa.Activity_list.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	
	@Override
	public void start_route(activity.toa.User user, java.lang.String resource_id, java.lang.String time, java.lang.String date, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[12]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("activity/start_route");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("urn:toa:activity", "start_route"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, resource_id, time, date});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			java.util.Map _output;
			_output = _call.getOutputParams();
			try {
				result_code.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "result_code"))).intValue();
			} catch (java.lang.Exception _exception) {
				result_code.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "result_code")), int.class)).intValue();
			}
			try {
				error_msg.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "error_msg"));
			} catch (java.lang.Exception _exception) {
				error_msg.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "error_msg")), java.lang.String.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	
	@Override
	public void end_route(activity.toa.User user, java.lang.String resource_id, java.lang.String time, java.lang.String date, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[13]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("activity/end_route");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("urn:toa:activity", "end_route"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, resource_id, time, date});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			java.util.Map _output;
			_output = _call.getOutputParams();
			try {
				result_code.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "result_code"))).intValue();
			} catch (java.lang.Exception _exception) {
				result_code.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "result_code")), int.class)).intValue();
			}
			try {
				error_msg.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "error_msg"));
			} catch (java.lang.Exception _exception) {
				error_msg.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "error_msg")), java.lang.String.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	
	@Override
	public void link_activities(activity.toa.User user, java.lang.String from_activity_id, java.lang.String to_activity_id, java.lang.String link_type, java.lang.String min_interval, java.lang.String max_interval, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[14]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("activity/link_activities");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("urn:toa:activity", "link_activities"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, from_activity_id, to_activity_id, link_type, min_interval, max_interval});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			java.util.Map _output;
			_output = _call.getOutputParams();
			try {
				result_code.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "result_code"))).intValue();
			} catch (java.lang.Exception _exception) {
				result_code.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "result_code")), int.class)).intValue();
			}
			try {
				error_msg.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "error_msg"));
			} catch (java.lang.Exception _exception) {
				error_msg.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "error_msg")), java.lang.String.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	
	@Override
	public void unlink_activities(activity.toa.User user, java.lang.String from_activity_id, java.lang.String to_activity_id, java.lang.String link_type, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[15]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("activity/unlink_activities");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("urn:toa:activity", "unlink_activities"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, from_activity_id, to_activity_id, link_type});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			java.util.Map _output;
			_output = _call.getOutputParams();
			try {
				result_code.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "result_code"))).intValue();
			} catch (java.lang.Exception _exception) {
				result_code.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "result_code")), int.class)).intValue();
			}
			try {
				error_msg.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "error_msg"));
			} catch (java.lang.Exception _exception) {
				error_msg.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "error_msg")), java.lang.String.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	
	@Override
	public void get_activity_links(activity.toa.User user, java.lang.String activity_id, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg, activity.toa.holders.LinkArrayHolder link) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[16]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("activity/get_activity_links");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("urn:toa:activity", "get_activity_links"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, activity_id});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			java.util.Map _output;
			_output = _call.getOutputParams();
			try {
				result_code.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "result_code"))).intValue();
			} catch (java.lang.Exception _exception) {
				result_code.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "result_code")), int.class)).intValue();
			}
			try {
				error_msg.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "error_msg"));
			} catch (java.lang.Exception _exception) {
				error_msg.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "error_msg")), java.lang.String.class);
			}
			try {
				link.value = (activity.toa.Link[]) _output.get(new javax.xml.namespace.QName("", "link"));
			} catch (java.lang.Exception _exception) {
				link.value = (activity.toa.Link[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "link")), activity.toa.Link[].class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	
	@Override
	public void set_file(activity.toa.User user, java.lang.String entity_id, java.lang.String property_id, java.lang.String file_name, org.w3.www._2005._05.xmlmime.Base64Binary file_data, java.lang.String file_mime_type, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[17]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("activity/set_file");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("urn:toa:activity", "set_file"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, entity_id, property_id, file_name, file_data, file_mime_type});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			java.util.Map _output;
			_output = _call.getOutputParams();
			try {
				result_code.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "result_code"))).intValue();
			} catch (java.lang.Exception _exception) {
				result_code.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "result_code")), int.class)).intValue();
			}
			try {
				error_msg.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "error_msg"));
			} catch (java.lang.Exception _exception) {
				error_msg.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "error_msg")), java.lang.String.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	
	@Override
	public void get_file(activity.toa.User user, java.lang.String entity_id, java.lang.String property_id, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg, javax.xml.rpc.holders.StringHolder file_name, org.w3.www._2005._05.xmlmime.holders.Base64BinaryHolder file_data, javax.xml.rpc.holders.StringHolder file_mime_type) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[18]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("activity/get_file");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("urn:toa:activity", "get_file"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, entity_id, property_id});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			java.util.Map _output;
			_output = _call.getOutputParams();
			try {
				result_code.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "result_code"))).intValue();
			} catch (java.lang.Exception _exception) {
				result_code.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "result_code")), int.class)).intValue();
			}
			try {
				error_msg.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "error_msg"));
			} catch (java.lang.Exception _exception) {
				error_msg.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "error_msg")), java.lang.String.class);
			}
			try {
				file_name.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "file_name"));
			} catch (java.lang.Exception _exception) {
				file_name.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "file_name")), java.lang.String.class);
			}
			try {
				file_data.value = (org.w3.www._2005._05.xmlmime.Base64Binary) _output.get(new javax.xml.namespace.QName("", "file_data"));
			} catch (java.lang.Exception _exception) {
				file_data.value = (org.w3.www._2005._05.xmlmime.Base64Binary) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "file_data")), org.w3.www._2005._05.xmlmime.Base64Binary.class);
			}
			try {
				file_mime_type.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "file_mime_type"));
			} catch (java.lang.Exception _exception) {
				file_mime_type.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "file_mime_type")), java.lang.String.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	
	@Override
	public void delete_file(activity.toa.User user, java.lang.String entity_id, java.lang.String property_id, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[19]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("activity/delete_file");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("urn:toa:activity", "delete_file"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, entity_id, property_id});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			java.util.Map _output;
			_output = _call.getOutputParams();
			try {
				result_code.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "result_code"))).intValue();
			} catch (java.lang.Exception _exception) {
				result_code.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "result_code")), int.class)).intValue();
			}
			try {
				error_msg.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "error_msg"));
			} catch (java.lang.Exception _exception) {
				error_msg.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "error_msg")), java.lang.String.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	
	@Override
	public void set_resource_preferences(activity.toa.User user, java.lang.String activity_id, activity.toa.Resource_preference[] preference, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[20]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("activity/set_resource_preferences");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("urn:toa:activity", "set_resource_preferences"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, activity_id, preference});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			java.util.Map _output;
			_output = _call.getOutputParams();
			try {
				result_code.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "result_code"))).intValue();
			} catch (java.lang.Exception _exception) {
				result_code.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "result_code")), int.class)).intValue();
			}
			try {
				error_msg.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "error_msg"));
			} catch (java.lang.Exception _exception) {
				error_msg.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "error_msg")), java.lang.String.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	
	@Override
	public void get_resource_preferences(activity.toa.User user, java.lang.String activity_id, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg, activity.toa.holders.Resource_preferenceArrayHolder preference) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[21]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("activity/get_resource_preferences");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("urn:toa:activity", "get_resource_preferences"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, activity_id});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			java.util.Map _output;
			_output = _call.getOutputParams();
			try {
				result_code.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "result_code"))).intValue();
			} catch (java.lang.Exception _exception) {
				result_code.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "result_code")), int.class)).intValue();
			}
			try {
				error_msg.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "error_msg"));
			} catch (java.lang.Exception _exception) {
				error_msg.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "error_msg")), java.lang.String.class);
			}
			try {
				preference.value = (activity.toa.Resource_preference[]) _output.get(new javax.xml.namespace.QName("", "preference"));
			} catch (java.lang.Exception _exception) {
				preference.value = (activity.toa.Resource_preference[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "preference")), activity.toa.Resource_preference[].class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	
	@Override
	public void set_required_inventories(activity.toa.User user, java.lang.String activity_id, activity.toa.Required_inventory[] required_inventory, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[22]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("activity/set_required_inventories");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("urn:toa:activity", "set_required_inventories"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, activity_id, required_inventory});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			java.util.Map _output;
			_output = _call.getOutputParams();
			try {
				result_code.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "result_code"))).intValue();
			} catch (java.lang.Exception _exception) {
				result_code.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "result_code")), int.class)).intValue();
			}
			try {
				error_msg.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "error_msg"));
			} catch (java.lang.Exception _exception) {
				error_msg.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "error_msg")), java.lang.String.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	
	@Override
	public void get_required_inventories(activity.toa.User user, java.lang.String activity_id, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg, activity.toa.holders.Required_inventoryArrayHolder required_inventory) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[23]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("activity/get_required_inventories");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("urn:toa:activity", "get_required_inventories"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, activity_id});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			java.util.Map _output;
			_output = _call.getOutputParams();
			try {
				result_code.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "result_code"))).intValue();
			} catch (java.lang.Exception _exception) {
				result_code.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "result_code")), int.class)).intValue();
			}
			try {
				error_msg.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "error_msg"));
			} catch (java.lang.Exception _exception) {
				error_msg.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "error_msg")), java.lang.String.class);
			}
			try {
				required_inventory.value = (activity.toa.Required_inventory[]) _output.get(new javax.xml.namespace.QName("", "required_inventory"));
			} catch (java.lang.Exception _exception) {
				required_inventory.value = (activity.toa.Required_inventory[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "required_inventory")), activity.toa.Required_inventory[].class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	
	@Override
	public void get_activity_work_skills(activity.toa.User user, java.lang.String activity_id, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg, activity.toa.holders.Work_skillArrayHolder work_skill, activity.toa.holders.Capacity_categoryArrayHolder capacity_category) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[24]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("activity/get_activity_work_skills");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("urn:toa:activity", "get_activity_work_skills"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, activity_id});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			java.util.Map _output;
			_output = _call.getOutputParams();
			try {
				result_code.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "result_code"))).intValue();
			} catch (java.lang.Exception _exception) {
				result_code.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "result_code")), int.class)).intValue();
			}
			try {
				error_msg.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "error_msg"));
			} catch (java.lang.Exception _exception) {
				error_msg.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "error_msg")), java.lang.String.class);
			}
			try {
				work_skill.value = (activity.toa.Work_skill[]) _output.get(new javax.xml.namespace.QName("", "work_skill"));
			} catch (java.lang.Exception _exception) {
				work_skill.value = (activity.toa.Work_skill[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "work_skill")), activity.toa.Work_skill[].class);
			}
			try {
				capacity_category.value = (activity.toa.Capacity_category[]) _output.get(new javax.xml.namespace.QName("", "capacity_category"));
			} catch (java.lang.Exception _exception) {
				capacity_category.value = (activity.toa.Capacity_category[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "capacity_category")), activity.toa.Capacity_category[].class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	
	@Override
	public void get_activities(activity.toa.User user, activity.toa.Get_activities_resource_filter_element[] resources, activity.toa.Get_activities_date_filter date_range, java.lang.Integer select_from, int select_count, activity.toa.Get_activities_filter filter_expression, java.lang.String[] required_properties, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg, javax.xml.rpc.holders.StringHolder expression, activity.toa.holders.ActivitiesHolder activities, javax.xml.rpc.holders.BooleanWrapperHolder have_more_results, javax.xml.rpc.holders.StringHolder statistics) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[25]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("activity/get_activities");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("urn:toa:activity", "get_activities"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, resources, date_range, select_from, new java.lang.Integer(select_count), filter_expression, required_properties});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			java.util.Map _output;
			_output = _call.getOutputParams();
			try {
				result_code.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "result_code"))).intValue();
			} catch (java.lang.Exception _exception) {
				result_code.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "result_code")), int.class)).intValue();
			}
			try {
				error_msg.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "error_msg"));
			} catch (java.lang.Exception _exception) {
				error_msg.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "error_msg")), java.lang.String.class);
			}
			try {
				expression.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "expression"));
			} catch (java.lang.Exception _exception) {
				expression.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "expression")), java.lang.String.class);
			}
			try {
				activities.value = (activity.toa.Property[][]) _output.get(new javax.xml.namespace.QName("", "activities"));
			} catch (java.lang.Exception _exception) {
				activities.value = (activity.toa.Property[][]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "activities")), activity.toa.Property[][].class);
			}
			try {
				have_more_results.value = (java.lang.Boolean) _output.get(new javax.xml.namespace.QName("", "have_more_results"));
			} catch (java.lang.Exception _exception) {
				have_more_results.value = (java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "have_more_results")), java.lang.Boolean.class);
			}
			try {
				statistics.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "statistics"));
			} catch (java.lang.Exception _exception) {
				statistics.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "statistics")), java.lang.String.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

}
