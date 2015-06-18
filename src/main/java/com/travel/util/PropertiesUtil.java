package com.travel.util;

import java.util.ResourceBundle;

public class PropertiesUtil {
	private static ResourceBundle rb = ResourceBundle.getBundle("qiniu");
	
	public static String getProperty(String key){
		if(!rb.containsKey(key)){
			return null;
		}
		String value = rb.getString(key);
		if(value!=null && value.trim().length()>0){
			return value.trim();
		}
		return null;
	}
}
