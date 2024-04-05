package com.java.practice_Examples;

import java.util.Scanner;

public class Prime {
	/*
	 * Create a program to check whether a given number is prime
	 * 2,3,5,7,11,13- The number only divisible by 1 or itself
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Prime Number checker");
		System.out.print("Please enter your number: ");
		int num = input.nextInt();
		boolean isPrime = isPrime(num);
		if (isPrime) {
			System.out.println("Your number is Prime");
		} else {
			System.out.println("Your number is not prime");
		}
	}

	public static boolean isPrime(int num) {
		int i = 2;
		while (i < num) {
			if (num % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}
}