package org.core.java8.probems;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JulianDate {
	
	public static void main(String[] args) {
		System.out.println(getJulianDateAsString());
		
		Calendar calendar =Calendar.getInstance();
		calendar.set(Calendar.DATE,1);
		calendar.set(Calendar.MONTH,Calendar.JANUARY);
		calendar.set(Calendar.YEAR,2019);
		
		System.out.println(getJulianDateAsString(calendar.getTime()));
	}
	
	
	public static String getJulianDateAsString() {
		Date dNow = new Date();
		DateFormat julianDatePattern = new SimpleDateFormat("yyyyDDD");
		return julianDatePattern.format(dNow);
	}
	
	public static String getJulianDateAsString(Date dNow) {
		System.out.println(dNow);
		DateFormat julianDatePattern = new SimpleDateFormat("yyyyD");
		return julianDatePattern.format(dNow);
	}

}
