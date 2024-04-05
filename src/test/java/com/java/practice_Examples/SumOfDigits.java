package com.java.practice_Examples;

import java.util.Scanner;

public class SumOfDigits {
	/*
	 * Sum of digit of integer number
	 * eg. no=123= 1+2+3
	 * 123%10= 3 and devide=12
	 * 12%10 =2 and 1
	 * 1%10 =1 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Sum Of Digits");
		System.out.print("Please enter your number: ");
		int num = input.nextInt();
		int sum = sumOfDigits(num);
		System.out.println("Sum of Digits is: " + sum);
		int mul = mulOfDigits(num);
		System.out.println("Sum of mul is: " + mul);
	}

	public static int sumOfDigits(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}
	public static int mulOfDigits(int num) {
		int mul = 1;
		while (num > 0) {
			mul *=num % 10;
			num /= 10;
		}
		return mul;
	}

}