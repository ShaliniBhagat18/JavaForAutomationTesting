package com.arrayExamples;

import java.util.Scanner;

public class ArraySearching {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the array search world !!");
		int[] sampleArray = { 23, 56, 67, 45, 67, 78, 33, 90, 23 };
		System.out.print("Enter the number !!!");
		int num = input.nextInt();

		boolean isFound = isFound(sampleArray, num);
		if (isFound) {
			System.out.println("Number is available !!");
		} else {
			System.out.println("Number is not available !!");
		}

		String[] sampleString = { "Shalini", "Ram", "Bhagat", "Darwha" };
		System.out.println("Enter the string !!");
		String myString = input.next();

		boolean isStringFound = isStringFound(sampleString, myString);
		if (isStringFound) {
			System.out.println("String is available !!");
		} else {
			System.out.println("String is not available !!!");
		}

		/*
		 * for (int i = 0; i < sampleArray.length; i++) { if (num == sampleArray[i]) {
		 * System.out.println("Number is matching "); } }
		 */

	}

	public static boolean isFound(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				return true;
			}
		}
		return false;

	}

	public static boolean isStringFound(String[] stringArray, String myStr) {
		for (int i = 0; i < stringArray.length; i++) {
			if (myStr.equalsIgnoreCase(stringArray[i])) {
				return true;
			}
		}
		return false;
	}

}
