package com.java.practice_Examples;

public class HowToRemoveNull {

	public static void main(String[] args) {
		String x1 = "NY";
		String x2 = null;
		String x3 = "FL";
		String x4 = null;
		String newString = x1 + " " + x2 + " " + x3 + " " + x4;
		if (newString.contains("null")) {
			System.out.println("newString " + newString);
			String newString_1 = newString.replaceAll("null", "");
			System.out.println("newString " + newString_1);
		}
	}
}
