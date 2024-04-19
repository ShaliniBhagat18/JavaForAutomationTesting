package com.java.practice_Examples;

import java.util.Scanner;

public class OddEvenTernary {
	/*
	 * Create a program to find if the given number is even or odd
	 */

	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.println("Welcome to Odd or even\n");
	        System.out.print("Please enter your number: ");
	        int num = input.nextInt();
	        String result = num % 2 == 0 ? "Even" : "Odd";
	        System.out.println("Your number is: " + result);
	    }
	}