package com.java.practice_Examples;

import java.util.Scanner;
/*
 * Create a program to print fibonacci series up to a certain number
 * a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers. 
 * The simplest is the series 1, 1, 2, 3, 5, 8, etc.
 */

public class Fibonacci {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Fibonacci Series");
		System.out.print("Please enter the number up to which series has to be printed: ");
		int num = input.nextInt();
		System.out.println("Here is the Fibonacci Series");
		printFibonacci(num);
	}

	public static void printFibonacci(int num) {
		if (num < 0)
			return;
		System.out.print("0 ");
		if (num == 0)
			return;
		System.out.print("1 ");

		int first = 0, second = 1;
		while (first + second <= num) {
			int third = first + second;
			System.out.print(third + " ");
			first = second;
			second = third;
		}
	}
}