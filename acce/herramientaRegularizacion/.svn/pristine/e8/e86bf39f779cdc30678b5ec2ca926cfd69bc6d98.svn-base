package activity.toa;

public class ApiPortTypeProxy implements activity.toa.ApiPortType {
  private String _endpoint = null;
  private activity.toa.ApiPortType apiPortType = null;
  
  public ApiPortTypeProxy() {
    _initApiPortTypeProxy();
  }
  
  public ApiPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initApiPortTypeProxy();
  }
  
  private void _initApiPortTypeProxy() {
    try {
      apiPortType = (new activity.toa.ActivityLocator()).getactivity();
      if (apiPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)apiPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)apiPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (apiPortType != null)
      ((javax.xml.rpc.Stub)apiPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public activity.toa.ApiPortType getApiPortType() {
    if (apiPortType == null)
      _initApiPortTypeProxy();
    return apiPortType;
  }
  

@Override
public void create_activity(activity.toa.User user, java.lang.String date, java.lang.String resource_id, java.lang.String position_in_route, activity.toa.Property[] properties, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg, activity.toa.holders.ActivityHolder activity, activity.toa.holders.Activity_listHolder activity_list) throws java.rmi.RemoteException{
    if (apiPortType == null)
      _initApiPortTypeProxy();
    apiPortType.create_activity(user, date, resource_id, position_in_route, properties, result_code, error_msg, activity, activity_list);
  }
  
  
@Override
public void update_activity(activity.toa.User user, java.lang.String activity_id, java.lang.String position_in_route, activity.toa.Property[] properties, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg, activity.toa.holders.ActivityHolder activity, activity.toa.holders.Activity_listHolder activity_list) throws java.rmi.RemoteException{
    if (apiPortType == null)
      _initApiPortTypeProxy();
    apiPortType.update_activity(user, activity_id, position_in_route, properties, result_code, error_msg, activity, activity_list);
  }
  
  
@Override
public void reopen_activity(activity.toa.User user, java.lang.String activity_id, java.lang.String position_in_route, activity.toa.Property[] properties, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg, activity.toa.holders.ActivityHolder activity, activity.toa.holders.Activity_listHolder activity_list) throws java.rmi.RemoteException{
    if (apiPortType == null)
      _initApiPortTypeProxy();
    apiPortType.reopen_activity(user, activity_id, position_in_route, properties, result_code, error_msg, activity, activity_list);
  }
  
  
@Override
public void start_activity(activity.toa.User user, java.lang.String activity_id, java.lang.String date, java.lang.String time, activity.toa.Property[] properties, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg, activity.toa.holders.ActivityHolder activity, activity.toa.holders.Activity_listHolder activity_list) throws java.rmi.RemoteException{
    if (apiPortType == null)
      _initApiPortTypeProxy();
    apiPortType.start_activity(user, activity_id, date, time, properties, result_code, error_msg, activity, activity_list);
  }
  
  
@Override
public void complete_activity(activity.toa.User user, java.lang.String activity_id, java.lang.String date, java.lang.String time, activity.toa.Property[] properties, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg, activity.toa.holders.ActivityHolder activity, activity.toa.holders.Activity_listHolder activity_list) throws java.rmi.RemoteException{
    if (apiPortType == null)
      _initApiPortTypeProxy();
    apiPortType.complete_activity(user, activity_id, date, time, properties, result_code, error_msg, activity, activity_list);
  }
  
  
@Override
public void suspend_activity(activity.toa.User user, java.lang.String activity_id, java.lang.String date, java.lang.String time, activity.toa.Property[] properties, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg, activity.toa.holders.ActivityHolder activity, activity.toa.holders.Activity_listHolder activity_list) throws java.rmi.RemoteException{
    if (apiPortType == null)
      _initApiPortTypeProxy();
    apiPortType.suspend_activity(user, activity_id, date, time, properties, result_code, error_msg, activity, activity_list);
  }
  
  
@Override
public void cancel_activity(activity.toa.User user, java.lang.String activity_id, java.lang.String date, java.lang.String time, activity.toa.Property[] properties, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg, activity.toa.holders.ActivityHolder activity, activity.toa.holders.Activity_listHolder activity_list) throws java.rmi.RemoteException{
    if (apiPortType == null)
      _initApiPortTypeProxy();
    apiPortType.cancel_activity(user, activity_id, date, time, properties, result_code, error_msg, activity, activity_list);
  }
  
  
@Override
public void prework_activity(activity.toa.User user, java.lang.String activity_id, java.lang.String date, java.lang.String time, activity.toa.Property[] properties, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg, activity.toa.holders.ActivityHolder activity, activity.toa.holders.Activity_listHolder activity_list) throws java.rmi.RemoteException{
    if (apiPortType == null)
      _initApiPortTypeProxy();
    apiPortType.prework_activity(user, activity_id, date, time, properties, result_code, error_msg, activity, activity_list);
  }
  
  
@Override
public void delay_activity(activity.toa.User user, java.lang.String activity_id, java.lang.String date, int value, activity.toa.Property[] properties, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg, activity.toa.holders.ActivityHolder activity, activity.toa.holders.Activity_listHolder activity_list) throws java.rmi.RemoteException{
    if (apiPortType == null)
      _initApiPortTypeProxy();
    apiPortType.delay_activity(user, activity_id, date, value, properties, result_code, error_msg, activity, activity_list);
  }
  
  
@Override
public void get_activity(activity.toa.User user, java.lang.String activity_id, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg, activity.toa.holders.ActivityHolder activity, activity.toa.holders.Activity_listHolder activity_list) throws java.rmi.RemoteException{
    if (apiPortType == null)
      _initApiPortTypeProxy();
    apiPortType.get_activity(user, activity_id, result_code, error_msg, activity, activity_list);
  }
  
  
@Override
public void search_activities(activity.toa.User user, java.lang.String search_in, java.lang.String search_for, java.lang.String date_from, java.lang.String date_to, java.lang.String select_from, java.lang.String select_count, java.lang.String order, java.lang.String[] property_filter, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg, activity.toa.holders.ActivityHolder activity, activity.toa.holders.Activity_listHolder activity_list) throws java.rmi.RemoteException{
    if (apiPortType == null)
      _initApiPortTypeProxy();
    apiPortType.search_activities(user, search_in, search_for, date_from, date_to, select_from, select_count, order, property_filter, result_code, error_msg, activity, activity_list);
  }
  
  
@Override
public void get_route(activity.toa.User user, java.lang.String date, java.lang.String resource_id, java.lang.String[] property_filter, java.lang.Integer select_from, java.lang.Integer select_count, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg, activity.toa.holders.ActivityHolder activity, activity.toa.holders.Activity_listHolder activity_list) throws java.rmi.RemoteException{
    if (apiPortType == null)
      _initApiPortTypeProxy();
    apiPortType.get_route(user, date, resource_id, property_filter, select_from, select_count, result_code, error_msg, activity, activity_list);
  }
  
  
@Override
public void start_route(activity.toa.User user, java.lang.String resource_id, java.lang.String time, java.lang.String date, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg) throws java.rmi.RemoteException{
    if (apiPortType == null)
      _initApiPortTypeProxy();
    apiPortType.start_route(user, resource_id, time, date, result_code, error_msg);
  }
  
  
@Override
public void end_route(activity.toa.User user, java.lang.String resource_id, java.lang.String time, java.lang.String date, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg) throws java.rmi.RemoteException{
    if (apiPortType == null)
      _initApiPortTypeProxy();
    apiPortType.end_route(user, resource_id, time, date, result_code, error_msg);
  }
  
  
@Override
public void link_activities(activity.toa.User user, java.lang.String from_activity_id, java.lang.String to_activity_id, java.lang.String link_type, java.lang.String min_interval, java.lang.String max_interval, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg) throws java.rmi.RemoteException{
    if (apiPortType == null)
      _initApiPortTypeProxy();
    apiPortType.link_activities(user, from_activity_id, to_activity_id, link_type, min_interval, max_interval, result_code, error_msg);
  }
  
  
@Override
public void unlink_activities(activity.toa.User user, java.lang.String from_activity_id, java.lang.String to_activity_id, java.lang.String link_type, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg) throws java.rmi.RemoteException{
    if (apiPortType == null)
      _initApiPortTypeProxy();
    apiPortType.unlink_activities(user, from_activity_id, to_activity_id, link_type, result_code, error_msg);
  }
  
  
@Override
public void get_activity_links(activity.toa.User user, java.lang.String activity_id, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg, activity.toa.holders.LinkArrayHolder link) throws java.rmi.RemoteException{
    if (apiPortType == null)
      _initApiPortTypeProxy();
    apiPortType.get_activity_links(user, activity_id, result_code, error_msg, link);
  }
  
  
@Override
public void set_file(activity.toa.User user, java.lang.String entity_id, java.lang.String property_id, java.lang.String file_name, org.w3.www._2005._05.xmlmime.Base64Binary file_data, java.lang.String file_mime_type, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg) throws java.rmi.RemoteException{
    if (apiPortType == null)
      _initApiPortTypeProxy();
    apiPortType.set_file(user, entity_id, property_id, file_name, file_data, file_mime_type, result_code, error_msg);
  }
  
  
@Override
public void get_file(activity.toa.User user, java.lang.String entity_id, java.lang.String property_id, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg, javax.xml.rpc.holders.StringHolder file_name, org.w3.www._2005._05.xmlmime.holders.Base64BinaryHolder file_data, javax.xml.rpc.holders.StringHolder file_mime_type) throws java.rmi.RemoteException{
    if (apiPortType == null)
      _initApiPortTypeProxy();
    apiPortType.get_file(user, entity_id, property_id, result_code, error_msg, file_name, file_data, file_mime_type);
  }
  
  
@Override
public void delete_file(activity.toa.User user, java.lang.String entity_id, java.lang.String property_id, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg) throws java.rmi.RemoteException{
    if (apiPortType == null)
      _initApiPortTypeProxy();
    apiPortType.delete_file(user, entity_id, property_id, result_code, error_msg);
  }
  
  
@Override
public void set_resource_preferences(activity.toa.User user, java.lang.String activity_id, activity.toa.Resource_preference[] preference, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg) throws java.rmi.RemoteException{
    if (apiPortType == null)
      _initApiPortTypeProxy();
    apiPortType.set_resource_preferences(user, activity_id, preference, result_code, error_msg);
  }
  
  
@Override
public void get_resource_preferences(activity.toa.User user, java.lang.String activity_id, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg, activity.toa.holders.Resource_preferenceArrayHolder preference) throws java.rmi.RemoteException{
    if (apiPortType == null)
      _initApiPortTypeProxy();
    apiPortType.get_resource_preferences(user, activity_id, result_code, error_msg, preference);
  }
  
  
@Override
public void set_required_inventories(activity.toa.User user, java.lang.String activity_id, activity.toa.Required_inventory[] required_inventory, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg) throws java.rmi.RemoteException{
    if (apiPortType == null)
      _initApiPortTypeProxy();
    apiPortType.set_required_inventories(user, activity_id, required_inventory, result_code, error_msg);
  }
  
  
@Override
public void get_required_inventories(activity.toa.User user, java.lang.String activity_id, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg, activity.toa.holders.Required_inventoryArrayHolder required_inventory) throws java.rmi.RemoteException{
    if (apiPortType == null)
      _initApiPortTypeProxy();
    apiPortType.get_required_inventories(user, activity_id, result_code, error_msg, required_inventory);
  }
  
  
@Override
public void get_activity_work_skills(activity.toa.User user, java.lang.String activity_id, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg, activity.toa.holders.Work_skillArrayHolder work_skill, activity.toa.holders.Capacity_categoryArrayHolder capacity_category) throws java.rmi.RemoteException{
    if (apiPortType == null)
      _initApiPortTypeProxy();
    apiPortType.get_activity_work_skills(user, activity_id, result_code, error_msg, work_skill, capacity_category);
  }
  
  
@Override
public void get_activities(activity.toa.User user, activity.toa.Get_activities_resource_filter_element[] resources, activity.toa.Get_activities_date_filter date_range, java.lang.Integer select_from, int select_count, activity.toa.Get_activities_filter filter_expression, java.lang.String[] required_properties, javax.xml.rpc.holders.IntHolder result_code, javax.xml.rpc.holders.StringHolder error_msg, javax.xml.rpc.holders.StringHolder expression, activity.toa.holders.ActivitiesHolder activities, javax.xml.rpc.holders.BooleanWrapperHolder have_more_results, javax.xml.rpc.holders.StringHolder statistics) throws java.rmi.RemoteException{
    if (apiPortType == null)
      _initApiPortTypeProxy();
    apiPortType.get_activities(user, resources, date_range, select_from, select_count, filter_expression, required_properties, result_code, error_msg, expression, activities, have_more_results, statistics);
  }
  
  
}