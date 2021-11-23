/**
 * 
 */
package com.shailesh.general;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author shailesh.chandra
 *
 */
public class DateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String date ="2/4/2021 10:49:05 AM";
		LocalDateTime parse = LocalDateTime.parse(date, DateTimeFormatter.ofPattern("M/d/yyyy hh:mm:ss a"));
		System.out.println(parse);

	}
	

}
