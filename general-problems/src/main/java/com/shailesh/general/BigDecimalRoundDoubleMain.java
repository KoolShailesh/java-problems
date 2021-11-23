package com.shailesh.general;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import org.apache.commons.math3.util.Precision;
import org.decimal4j.util.DoubleRounder;

@SuppressWarnings("unused")
public class BigDecimalRoundDoubleMain {

	
	public static void main(String[] args) {

		Double rate = 4.85;
		Double hours = 12.5;
		BigDecimal rate1 = BigDecimal.valueOf(rate);

		BigDecimal hours1 = BigDecimal.valueOf(hours);
		BigDecimal hoursw = BigDecimal.valueOf(rate).multiply(BigDecimal.valueOf(hours));
		System.out.println(hoursw.setScale(2, RoundingMode.HALF_UP).doubleValue());
		System.out.println(BigDecimalRoundDoubleMain.roundDouble1(137.855));
		System.out.println(hoursw);
		System.out.println("________________");
		System.out.println( BigDecimalRoundDoubleMain.roundDouble1(60.62499999999999));
		
		System.out.println( Precision.round(60.62499999999999,2));
		
		System.out.println( DoubleRounder.round(60.62499999999999,2));
		
		System.out.println("________________");
		System.out.println(BigDecimalRoundDoubleMain.roundDouble(60.3424234234));
		System.out.println(BigDecimalRoundDoubleMain.roundDouble1(60.3424234234));
		DecimalFormat df = new DecimalFormat("#.##");
		df.setMaximumFractionDigits(2);
		df.setRoundingMode(RoundingMode.HALF_UP);
		Double d = 137.855;
		Double d1 = 60.62499999999999;
		Double d2 = 60.62453434343;
		Double d3 = 60.62259999;
		Double d4 = 4334560.3424234234;
		Double d5 = 60.0009999;
		System.out.println(":----" + df.format(d));
		System.out.println(":----" + df.format(d1));
		System.out.println(":----" + df.format(d2));
		System.out.println(":----" + df.format(d3));
		System.out.println(":----" + df.format(d4));
		System.out.println(":--sds--" + Math.round(60.6249999999 * 100) / 100);

		double roundOff = Math.round(60.6249999999 * 100) / 100;

	}

	private static double roundDouble(double d) {

		BigDecimal bigDecimal = BigDecimal.valueOf(60.62499999999999);

		bigDecimal = bigDecimal.setScale(2, RoundingMode.HALF_UP);
		return bigDecimal.doubleValue();
	}

	private static double roundDouble1(double d) {

		BigDecimal bigDecimal =new BigDecimal(Double.toString(d));

		BigDecimal setScale = bigDecimal.setScale(2, RoundingMode.HALF_UP);
		System.err.println(setScale);
		return setScale.doubleValue();
	}

}