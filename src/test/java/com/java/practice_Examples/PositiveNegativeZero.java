package com.java.practice_Examples;

import java.util.Scanner;

public class PositiveNegativeZero {
//WAP that determines if a number is positive , negative or zero
	//We can use if else or ternary operator.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Number checker\n");
		System.out.print("Please enter your number: ");
		int num = input.nextInt();

//		if (num > 0) {
//			System.out.println("Your number is positive");
//		} else if (num == 0) {
//			System.out.println("Your number is zero");
//		} else {
//			System.out.println("Your number is negative");
//		}
		
		String numType = (num > 0)?"Positive":(num == 0)?"Zero":"Negative";
		System.out.println("Num type is "+numType);
	}
}
