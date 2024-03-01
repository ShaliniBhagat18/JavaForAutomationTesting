package com.java.practice_Examples;

import java.util.Scanner;

public class Grading {
// WAP that calculates grades based on marks
	// A. above 90%, B. above 75%, C. above 60%, D. above 30, E. below 30% 	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Grade calculator\n");
		System.out.print("Please enter your percentage: ");
		float percentage = input.nextFloat();

		if (percentage >= 90) {
			System.out.println("Great, You have got A");
		} else if (percentage >= 75) {
			System.out.println("Good, You have got B");
		} else if (percentage >= 60) {
			System.out.println("You have got C, Work harder next time");
		} else if (percentage >= 30) {
			System.out.println("You have got D, You seriously need to work harder");
		} else {
			System.out.println("Sorry, You have failed the test and got a F");
		}
	}
}