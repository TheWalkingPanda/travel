package com.travel.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	
	/**
	 * 获取指定时间的指定格式的字符串
	 */
	public static String getFormatDate(String format, Date date){
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}
	
	/**
	 * 获取当前时间指定天数后的时间的指定格式的字符串
	 * @param days	若为正数，则为当前时间后days天；若为负数，则为当前时间前days天
	 */
	public static String getTheDate(int days, String format){
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, days);
		return getFormatDate(format, calendar.getTime());
	}
	
}
