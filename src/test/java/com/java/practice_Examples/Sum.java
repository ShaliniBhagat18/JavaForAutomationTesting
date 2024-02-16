package com.java.practice_Examples;

import java.util.Scanner;

public class Sum {
//Create a program to take twoinput from user
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the sum world");
		System.out.println("Enter the first number : ");
		int firstNum = input.nextInt();
		System.out.println("Enter the second number : ");
		int secondNum = input.nextInt();
		int sum = firstNum + secondNum;
		System.out.println("Sum of two number is : " + sum);

	}

}
