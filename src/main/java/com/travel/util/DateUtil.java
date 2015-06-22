package com.travel.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DateUtil {
	private static Log log = LogFactory.getLog(DateUtil.class);
	
	/**
	 * @param format	日期字符串格式，如2015-06-21 12:53:05，则为yyyy-MM-dd HH:mm:ss
	 * @param dateStr	日期字符串，如2015-06-21 12:53:05
	 */
	public static Date str2date(String format, String dateStr){
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try {
			return sdf.parse(dateStr);
		} catch (ParseException e) {
			log.info(e);
			return null;
		}
	}
	
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
