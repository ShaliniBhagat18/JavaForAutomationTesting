package com.java.practice_Examples;

import java.util.Scanner;

public class LeapYear {
	//WAP to determines if a given year is a leap year.
	//(Considering condition a like divisible by 4 but not 100 , unless also divisible by 400 )
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to New Year Calculator\n");
		System.out.print("Please enter the year that you want to check: ");
		int year = input.nextInt();

		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("Your year is a leap year");
		} else {
			System.out.println("Your year is not a leap year");
		}
	}
}
