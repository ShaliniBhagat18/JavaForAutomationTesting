package com.java.practice_Examples;

import java.util.Scanner;

public class AbsoluteTernary {
	/*
	 * Create a program to calculate the absolute value of a given integer
	 * 12 abs = 12
	 * -12 abs = 12
	 */
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Absolute Value\n");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        int result = num >= 0 ? num : -num;
        System.out.println("Absolute value is: " + result);
    }
}

