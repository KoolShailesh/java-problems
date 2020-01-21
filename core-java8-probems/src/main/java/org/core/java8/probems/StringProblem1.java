package org.core.java8.probems;

import java.util.Arrays;

public class StringProblem1 {

	public static void main(String[] args) {
		extracted();

		extracted1();
		
	}

	private static void extracted1() {
		String string = "     hello       world!     b   y    e   ";
		String[] arr = string.trim().split("\\s+");
		System.out.println(Arrays.asList(arr));
	}

	private static void extracted() {
		String s = " hello world! b y e ";
		s = s.replaceAll("( )+", " ").trim();
		
		String[] split = s.split(" ");
		System.out.println(Arrays.asList(split));
	}

}
