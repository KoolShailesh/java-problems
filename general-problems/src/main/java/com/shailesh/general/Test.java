package com.shailesh.general;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
@SuppressWarnings("unused")
public class Test {

	public static void main(String[] args) {

		Calendar instance = Calendar.getInstance();
		instance.set(Calendar.DATE, 21);
		instance.set(Calendar.MONTH, Calendar.NOVEMBER);
		instance.set(Calendar.HOUR_OF_DAY, 23);
		instance.set(Calendar.MINUTE, 0);
		instance.set(Calendar.SECOND, 0);

		Date date = new Date(instance.getTimeInMillis());
		System.out.println(date);
		boolean inDaylightTime = TimeZone.getTimeZone("Europe/London").inDaylightTime(date);

		TimeZone timeZone = TimeZone.getTimeZone("Europe/London");

		System.err.println("date" + date + " inDaylightTime " + inDaylightTime);

		String datestr = "2021-05-31T23:00:00";
		LocalDateTime parse = LocalDateTime.parse(datestr);
		Instant instant = parse.toInstant(ZoneOffset.UTC);

		ZoneId of = ZoneId.of("Europe/London");
		ZonedDateTime zdt = ZonedDateTime.ofInstant(instant, of);

		System.out.println(zdt);

		Date from = Date.from(zdt.toInstant());

		System.out.println(from);
//		LocalDateTime.parse( "2016-09-25 17:26:12".replace( " " , "T" ) )
//.atZoneSameInstant( ZoneId.systemDefault() )
//        .format( DateTimeFormatter.ofLocalizedDateTime( FormatStyle.MEDIUM ) );

	}

}
