package momatools.model.workorder;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase java que recoge el xml de entrada de workorder para tener todos los datos
 * Tendra una serie de datos simples, y unos tags complejos 
 * @author l.lorenzoriesco
 *
 */
public class WorkOrderFromXML {
	/*
	 * ATRIBUTOS QUE SON FINALES, CASI TODOS STRING
	 */
    private String XA_BANK_ACCOUNT_NUMBER;
	private String XA_CAPACITY_METER;
    private String XA_CNAME_RESULT;
    private String XA_COMMON_INSTALLATION_RENT;
    private String XA_CONNECTION_CODE;
    private String XA_CONNECTION_RIGHTS;
    private String XA_CONNECTION_RIGHTS_CONTRACTOR_AMOUNT;
    private String XA_CONNECTION_RIGHTS_SOLICITOR_AMOUNT;
    private String XA_COUNTER_RENT;
    private String XA_COUNTER_STATUS;
    private String XA_CUPS_NUMBER;
    private String XA_CUSTOMER_DNI_INTERLOCUTOR_FLAG;
    private String XA_CUSTOMER_DOC;
    private String XA_CUSTOMER_DOC_RESULT;
    private String XA_CUSTOMER_LANGUAGE_RESULT;
    private String XA_DELEGATION_UNIT;
    private String XA_DIVISION_ZONE_CODE;
    private String XA_DNI_INTERLOCUTOR_FLAG;
    private String XA_DNI_USER_FLAG;
    private String XA_DOOR;
    private String XA_DOORWAY;
    private String XA_EQUIPMENT_BRAND_RESULT;
    private String XA_EQUIPMENT_MODEL_RESULT;
    private String XA_EQUIPMENT_OWNER_RESULT;
    private String XA_EQUIPMENT_READING_RESULT;
    private String XA_EQUIP_NUMBER;
    private String XA_FLOOR;
    private String XA_GAS_TYPE_DESCRIPTION;
    private String XA_GAS_USE_CODE_DESCRIPTION;
    private String XA_INSTALLER_CELLPHONE;
    private String XA_INSTALLER_EMAIL;
    private String XA_INSTALLER_NAME;
    private String XA_INSTALLER_PHONE;
    private String XA_INTERLOCUTOR_EMAIL;
    private String XA_INTERVENTION_OBS;
    private String XA_IRC_USE_AMOUNT;
    private String XA_MARKETER;
    private String XA_MARKET_TYPE;
    private String XA_OPERATION_CODE;
    private String XA_OPERATION_DES_SHORT;
    private String XA_ORDER_NFR_CASTELLANO_TOTAL;
    private String XA_PAYMENT_TYPE;
    private String XA_RESULT;
    private String XA_SOCIETY_CODE;
    private String XA_STAIRWAY;
    private String XA_TOTAL_WITHOUT_VAT;
    private String XA_TYPE_OF_WORK_IRI_CA;
    private String XA_USE_CONTRACT_INDICATOR;
    private String XA_VAT_AMOUNT;
    private String XA_WORK_GROUP;
    private String acreditacion;
    private String caddress;
    private String ccity;
    private String cemail;
    private String cname;
    private String cphone;
    private String cstate;
    private String czip;
    private String flag_mismo_interlocutor;
    private String id;
    private String isExistTestoMeasures;
    private String number_devices;
    private String result_code;
    private String technician;
    
    // Este en el ejemplo viene vacio, pero tiene pinta de ser un objeto complejo
    private String defects;
    
    //Ejemplo complejo
    private List<Aparato> aparatos= new ArrayList<Aparato>();
    private List<String> attachments= new ArrayList<String>();
    
    
    
    
    
/*
 * GETTERS Y SETTERS
 */
    public String getXA_BANK_ACCOUNT_NUMBER() {
		return XA_BANK_ACCOUNT_NUMBER;
	}
	public void setXA_BANK_ACCOUNT_NUMBER(String xA_BANK_ACCOUNT_NUMBER) {
		XA_BANK_ACCOUNT_NUMBER = xA_BANK_ACCOUNT_NUMBER;
	}
	public String getXA_CAPACITY_METER() {
		return XA_CAPACITY_METER;
	}
	public void setXA_CAPACITY_METER(String xA_CAPACITY_METER) {
		XA_CAPACITY_METER = xA_CAPACITY_METER;
	}
	public String getXA_CNAME_RESULT() {
		return XA_CNAME_RESULT;
	}
	public void setXA_CNAME_RESULT(String xA_CNAME_RESULT) {
		XA_CNAME_RESULT = xA_CNAME_RESULT;
	}
	public String getXA_COMMON_INSTALLATION_RENT() {
		return XA_COMMON_INSTALLATION_RENT;
	}
	public void setXA_COMMON_INSTALLATION_RENT(String xA_COMMON_INSTALLATION_RENT) {
		XA_COMMON_INSTALLATION_RENT = xA_COMMON_INSTALLATION_RENT;
	}
	public String getXA_CONNECTION_CODE() {
		return XA_CONNECTION_CODE;
	}
	public void setXA_CONNECTION_CODE(String xA_CONNECTION_CODE) {
		XA_CONNECTION_CODE = xA_CONNECTION_CODE;
	}
	public String getXA_CONNECTION_RIGHTS() {
		return XA_CONNECTION_RIGHTS;
	}
	public void setXA_CONNECTION_RIGHTS(String xA_CONNECTION_RIGHTS) {
		XA_CONNECTION_RIGHTS = xA_CONNECTION_RIGHTS;
	}
	public String getXA_CONNECTION_RIGHTS_CONTRACTOR_AMOUNT() {
		return XA_CONNECTION_RIGHTS_CONTRACTOR_AMOUNT;
	}
	public void setXA_CONNECTION_RIGHTS_CONTRACTOR_AMOUNT(String xA_CONNECTION_RIGHTS_CONTRACTOR_AMOUNT) {
		XA_CONNECTION_RIGHTS_CONTRACTOR_AMOUNT = xA_CONNECTION_RIGHTS_CONTRACTOR_AMOUNT;
	}
	public String getXA_CONNECTION_RIGHTS_SOLICITOR_AMOUNT() {
		return XA_CONNECTION_RIGHTS_SOLICITOR_AMOUNT;
	}
	public void setXA_CONNECTION_RIGHTS_SOLICITOR_AMOUNT(String xA_CONNECTION_RIGHTS_SOLICITOR_AMOUNT) {
		XA_CONNECTION_RIGHTS_SOLICITOR_AMOUNT = xA_CONNECTION_RIGHTS_SOLICITOR_AMOUNT;
	}
	public String getXA_COUNTER_RENT() {
		return XA_COUNTER_RENT;
	}
	public void setXA_COUNTER_RENT(String xA_COUNTER_RENT) {
		XA_COUNTER_RENT = xA_COUNTER_RENT;
	}
	public String getXA_COUNTER_STATUS() {
		return XA_COUNTER_STATUS;
	}
	public void setXA_COUNTER_STATUS(String xA_COUNTER_STATUS) {
		XA_COUNTER_STATUS = xA_COUNTER_STATUS;
	}
	public String getXA_CUPS_NUMBER() {
		return XA_CUPS_NUMBER;
	}
	public void setXA_CUPS_NUMBER(String xA_CUPS_NUMBER) {
		XA_CUPS_NUMBER = xA_CUPS_NUMBER;
	}
	public String getXA_CUSTOMER_DNI_INTERLOCUTOR_FLAG() {
		return XA_CUSTOMER_DNI_INTERLOCUTOR_FLAG;
	}
	public void setXA_CUSTOMER_DNI_INTERLOCUTOR_FLAG(String xA_CUSTOMER_DNI_INTERLOCUTOR_FLAG) {
		XA_CUSTOMER_DNI_INTERLOCUTOR_FLAG = xA_CUSTOMER_DNI_INTERLOCUTOR_FLAG;
	}
	public String getXA_CUSTOMER_DOC() {
		return XA_CUSTOMER_DOC;
	}
	public void setXA_CUSTOMER_DOC(String xA_CUSTOMER_DOC) {
		XA_CUSTOMER_DOC = xA_CUSTOMER_DOC;
	}
	public String getXA_CUSTOMER_DOC_RESULT() {
		return XA_CUSTOMER_DOC_RESULT;
	}
	public void setXA_CUSTOMER_DOC_RESULT(String xA_CUSTOMER_DOC_RESULT) {
		XA_CUSTOMER_DOC_RESULT = xA_CUSTOMER_DOC_RESULT;
	}
	public String getXA_CUSTOMER_LANGUAGE_RESULT() {
		return XA_CUSTOMER_LANGUAGE_RESULT;
	}
	public void setXA_CUSTOMER_LANGUAGE_RESULT(String xA_CUSTOMER_LANGUAGE_RESULT) {
		XA_CUSTOMER_LANGUAGE_RESULT = xA_CUSTOMER_LANGUAGE_RESULT;
	}
	public String getXA_DELEGATION_UNIT() {
		return XA_DELEGATION_UNIT;
	}
	public void setXA_DELEGATION_UNIT(String xA_DELEGATION_UNIT) {
		XA_DELEGATION_UNIT = xA_DELEGATION_UNIT;
	}
	public String getXA_DIVISION_ZONE_CODE() {
		return XA_DIVISION_ZONE_CODE;
	}
	public void setXA_DIVISION_ZONE_CODE(String xA_DIVISION_ZONE_CODE) {
		XA_DIVISION_ZONE_CODE = xA_DIVISION_ZONE_CODE;
	}
	public String getXA_DNI_INTERLOCUTOR_FLAG() {
		return XA_DNI_INTERLOCUTOR_FLAG;
	}
	public void setXA_DNI_INTERLOCUTOR_FLAG(String xA_DNI_INTERLOCUTOR_FLAG) {
		XA_DNI_INTERLOCUTOR_FLAG = xA_DNI_INTERLOCUTOR_FLAG;
	}
	public String getXA_DNI_USER_FLAG() {
		return XA_DNI_USER_FLAG;
	}
	public void setXA_DNI_USER_FLAG(String xA_DNI_USER_FLAG) {
		XA_DNI_USER_FLAG = xA_DNI_USER_FLAG;
	}
	public String getXA_DOOR() {
		return XA_DOOR;
	}
	public void setXA_DOOR(String xA_DOOR) {
		XA_DOOR = xA_DOOR;
	}
	public String getXA_DOORWAY() {
		return XA_DOORWAY;
	}
	public void setXA_DOORWAY(String xA_DOORWAY) {
		XA_DOORWAY = xA_DOORWAY;
	}
	public String getXA_EQUIPMENT_BRAND_RESULT() {
		return XA_EQUIPMENT_BRAND_RESULT;
	}
	public void setXA_EQUIPMENT_BRAND_RESULT(String xA_EQUIPMENT_BRAND_RESULT) {
		XA_EQUIPMENT_BRAND_RESULT = xA_EQUIPMENT_BRAND_RESULT;
	}
	public String getXA_EQUIPMENT_MODEL_RESULT() {
		return XA_EQUIPMENT_MODEL_RESULT;
	}
	public void setXA_EQUIPMENT_MODEL_RESULT(String xA_EQUIPMENT_MODEL_RESULT) {
		XA_EQUIPMENT_MODEL_RESULT = xA_EQUIPMENT_MODEL_RESULT;
	}
	public String getXA_EQUIPMENT_OWNER_RESULT() {
		return XA_EQUIPMENT_OWNER_RESULT;
	}
	public void setXA_EQUIPMENT_OWNER_RESULT(String xA_EQUIPMENT_OWNER_RESULT) {
		XA_EQUIPMENT_OWNER_RESULT = xA_EQUIPMENT_OWNER_RESULT;
	}
	public String getXA_EQUIPMENT_READING_RESULT() {
		return XA_EQUIPMENT_READING_RESULT;
	}
	public void setXA_EQUIPMENT_READING_RESULT(String xA_EQUIPMENT_READING_RESULT) {
		XA_EQUIPMENT_READING_RESULT = xA_EQUIPMENT_READING_RESULT;
	}
	public String getXA_EQUIP_NUMBER() {
		return XA_EQUIP_NUMBER;
	}
	public void setXA_EQUIP_NUMBER(String xA_EQUIP_NUMBER) {
		XA_EQUIP_NUMBER = xA_EQUIP_NUMBER;
	}
	public String getXA_FLOOR() {
		return XA_FLOOR;
	}
	public void setXA_FLOOR(String xA_FLOOR) {
		XA_FLOOR = xA_FLOOR;
	}
	public String getXA_GAS_TYPE_DESCRIPTION() {
		return XA_GAS_TYPE_DESCRIPTION;
	}
	public void setXA_GAS_TYPE_DESCRIPTION(String xA_GAS_TYPE_DESCRIPTION) {
		XA_GAS_TYPE_DESCRIPTION = xA_GAS_TYPE_DESCRIPTION;
	}
	public String getXA_GAS_USE_CODE_DESCRIPTION() {
		return XA_GAS_USE_CODE_DESCRIPTION;
	}
	public void setXA_GAS_USE_CODE_DESCRIPTION(String xA_GAS_USE_CODE_DESCRIPTION) {
		XA_GAS_USE_CODE_DESCRIPTION = xA_GAS_USE_CODE_DESCRIPTION;
	}
	public String getXA_INSTALLER_CELLPHONE() {
		return XA_INSTALLER_CELLPHONE;
	}
	public void setXA_INSTALLER_CELLPHONE(String xA_INSTALLER_CELLPHONE) {
		XA_INSTALLER_CELLPHONE = xA_INSTALLER_CELLPHONE;
	}
	public String getXA_INSTALLER_EMAIL() {
		return XA_INSTALLER_EMAIL;
	}
	public void setXA_INSTALLER_EMAIL(String xA_INSTALLER_EMAIL) {
		XA_INSTALLER_EMAIL = xA_INSTALLER_EMAIL;
	}
	public String getXA_INSTALLER_NAME() {
		return XA_INSTALLER_NAME;
	}
	public void setXA_INSTALLER_NAME(String xA_INSTALLER_NAME) {
		XA_INSTALLER_NAME = xA_INSTALLER_NAME;
	}
	public String getXA_INSTALLER_PHONE() {
		return XA_INSTALLER_PHONE;
	}
	public void setXA_INSTALLER_PHONE(String xA_INSTALLER_PHONE) {
		XA_INSTALLER_PHONE = xA_INSTALLER_PHONE;
	}
	public String getXA_INTERLOCUTOR_EMAIL() {
		return XA_INTERLOCUTOR_EMAIL;
	}
	public void setXA_INTERLOCUTOR_EMAIL(String xA_INTERLOCUTOR_EMAIL) {
		XA_INTERLOCUTOR_EMAIL = xA_INTERLOCUTOR_EMAIL;
	}
	public String getXA_INTERVENTION_OBS() {
		return XA_INTERVENTION_OBS;
	}
	public void setXA_INTERVENTION_OBS(String xA_INTERVENTION_OBS) {
		XA_INTERVENTION_OBS = xA_INTERVENTION_OBS;
	}
	public String getXA_IRC_USE_AMOUNT() {
		return XA_IRC_USE_AMOUNT;
	}
	public void setXA_IRC_USE_AMOUNT(String xA_IRC_USE_AMOUNT) {
		XA_IRC_USE_AMOUNT = xA_IRC_USE_AMOUNT;
	}
	public String getXA_MARKETER() {
		return XA_MARKETER;
	}
	public void setXA_MARKETER(String xA_MARKETER) {
		XA_MARKETER = xA_MARKETER;
	}
	public String getXA_MARKET_TYPE() {
		return XA_MARKET_TYPE;
	}
	public void setXA_MARKET_TYPE(String xA_MARKET_TYPE) {
		XA_MARKET_TYPE = xA_MARKET_TYPE;
	}
	public String getXA_OPERATION_CODE() {
		return XA_OPERATION_CODE;
	}
	public void setXA_OPERATION_CODE(String xA_OPERATION_CODE) {
		XA_OPERATION_CODE = xA_OPERATION_CODE;
	}
	public String getXA_OPERATION_DES_SHORT() {
		return XA_OPERATION_DES_SHORT;
	}
	public void setXA_OPERATION_DES_SHORT(String xA_OPERATION_DES_SHORT) {
		XA_OPERATION_DES_SHORT = xA_OPERATION_DES_SHORT;
	}
	public String getXA_ORDER_NFR_CASTELLANO_TOTAL() {
		return XA_ORDER_NFR_CASTELLANO_TOTAL;
	}
	public void setXA_ORDER_NFR_CASTELLANO_TOTAL(String xA_ORDER_NFR_CASTELLANO_TOTAL) {
		XA_ORDER_NFR_CASTELLANO_TOTAL = xA_ORDER_NFR_CASTELLANO_TOTAL;
	}
	public String getXA_PAYMENT_TYPE() {
		return XA_PAYMENT_TYPE;
	}
	public void setXA_PAYMENT_TYPE(String xA_PAYMENT_TYPE) {
		XA_PAYMENT_TYPE = xA_PAYMENT_TYPE;
	}
	public String getXA_RESULT() {
		return XA_RESULT;
	}
	public void setXA_RESULT(String xA_RESULT) {
		XA_RESULT = xA_RESULT;
	}
	public String getXA_SOCIETY_CODE() {
		return XA_SOCIETY_CODE;
	}
	public void setXA_SOCIETY_CODE(String xA_SOCIETY_CODE) {
		XA_SOCIETY_CODE = xA_SOCIETY_CODE;
	}
	public String getXA_STAIRWAY() {
		return XA_STAIRWAY;
	}
	public void setXA_STAIRWAY(String xA_STAIRWAY) {
		XA_STAIRWAY = xA_STAIRWAY;
	}
	public String getXA_TOTAL_WITHOUT_VAT() {
		return XA_TOTAL_WITHOUT_VAT;
	}
	public void setXA_TOTAL_WITHOUT_VAT(String xA_TOTAL_WITHOUT_VAT) {
		XA_TOTAL_WITHOUT_VAT = xA_TOTAL_WITHOUT_VAT;
	}
	public String getXA_TYPE_OF_WORK_IRI_CA() {
		return XA_TYPE_OF_WORK_IRI_CA;
	}
	public void setXA_TYPE_OF_WORK_IRI_CA(String xA_TYPE_OF_WORK_IRI_CA) {
		XA_TYPE_OF_WORK_IRI_CA = xA_TYPE_OF_WORK_IRI_CA;
	}
	public String getXA_USE_CONTRACT_INDICATOR() {
		return XA_USE_CONTRACT_INDICATOR;
	}
	public void setXA_USE_CONTRACT_INDICATOR(String xA_USE_CONTRACT_INDICATOR) {
		XA_USE_CONTRACT_INDICATOR = xA_USE_CONTRACT_INDICATOR;
	}
	public String getXA_VAT_AMOUNT() {
		return XA_VAT_AMOUNT;
	}
	public void setXA_VAT_AMOUNT(String xA_VAT_AMOUNT) {
		XA_VAT_AMOUNT = xA_VAT_AMOUNT;
	}
	public String getXA_WORK_GROUP() {
		return XA_WORK_GROUP;
	}
	public void setXA_WORK_GROUP(String xA_WORK_GROUP) {
		XA_WORK_GROUP = xA_WORK_GROUP;
	}
	public String getAcreditacion() {
		return acreditacion;
	}
	public void setAcreditacion(String acreditacion) {
		this.acreditacion = acreditacion;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public String getCcity() {
		return ccity;
	}
	public void setCcity(String ccity) {
		this.ccity = ccity;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCphone() {
		return cphone;
	}
	public void setCphone(String cphone) {
		this.cphone = cphone;
	}
	public String getCstate() {
		return cstate;
	}
	public void setCstate(String cstate) {
		this.cstate = cstate;
	}
	public String getCzip() {
		return czip;
	}
	public void setCzip(String czip) {
		this.czip = czip;
	}
	public String getFlag_mismo_interlocutor() {
		return flag_mismo_interlocutor;
	}
	public void setFlag_mismo_interlocutor(String flag_mismo_interlocutor) {
		this.flag_mismo_interlocutor = flag_mismo_interlocutor;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIsExistTestoMeasures() {
		return isExistTestoMeasures;
	}
	public void setIsExistTestoMeasures(String isExistTestoMeasures) {
		this.isExistTestoMeasures = isExistTestoMeasures;
	}
	public String getNumber_devices() {
		return number_devices;
	}
	public void setNumber_devices(String number_devices) {
		this.number_devices = number_devices;
	}
	public String getResult_code() {
		return result_code;
	}
	public void setResult_code(String result_code) {
		this.result_code = result_code;
	}
	public String getTechnician() {
		return technician;
	}
	public void setTechnician(String technician) {
		this.technician = technician;
	}
	public String getDefects() {
		return defects;
	}
	public void setDefects(String defects) {
		this.defects = defects;
	}
	public List<Aparato> getAparatos() {
		return aparatos;
	}
	public void setAparatos(List<Aparato> aparatos) {
		this.aparatos = aparatos;
	}
	public List<String> getAttachments() {
		return attachments;
	}
	public void setAttachments(List<String> attachments) {
		this.attachments = attachments;
	}
	

}
