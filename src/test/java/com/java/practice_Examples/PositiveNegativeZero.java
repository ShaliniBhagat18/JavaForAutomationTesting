package com.java.practice_Examples;

import java.util.Scanner;

public class PositiveNegativeZero {
//WAP that determines if a number is positive , negative or zero
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Number checker\n");
		System.out.print("Please enter your number: ");
		int num = input.nextInt();

		if (num > 0) {
			System.out.println("Your number is positive");
		} else if (num == 0) {
			System.out.println("Your number is zero");
		} else {
			System.out.println("Your number is negative");
		}
	}
}
