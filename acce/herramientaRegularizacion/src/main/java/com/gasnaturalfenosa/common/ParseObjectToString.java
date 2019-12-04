package com.gasnaturalfenosa.common;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;

public class ParseObjectToString {

	public static Map<String, Object> getFieldNamesAndValues(final Object valueObj) {
		Map<String, Object> fieldMap = new LinkedHashMap<String, Object>();
		fieldMap.put("Class", valueObj.getClass().getName());
		Field[] valueObjFields = valueObj.getClass().getDeclaredFields();

		for (int i = 0; i < valueObjFields.length; i++) {

			String fieldName = valueObjFields[i].getName();

			valueObjFields[i].setAccessible(true);

			Object newObj = null;
			try {
				newObj = valueObjFields[i].get(valueObj);
				if (newObj != null && newObj.getClass().isMemberClass()
						&& newObj.getClass().getDeclaredFields().length > 0) {
					newObj = getFieldNamesAndValues(newObj);
				}
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}

			fieldMap.put(fieldName, newObj);

		}
		return fieldMap;
	}
}
