package com.java.practice_Examples;

import java.util.Scanner;

public class Factorial {
	/*
	 * Write the function that caculates the factorial of a given numbers
	 * 8!=1*2*3*4*5*6*7*8
	 */

	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.println("Welcome to Factorial");
	        System.out.print("Please enter your number: ");
	        int num = input.nextInt();
	        long fact = factorial(num);
	        System.out.println("Factorial is: " + fact);
	    }

	    public static long factorial(int num) {
	        if (num < 2) {
	            return 1;
	        }
	        long fact = 1;
	        int i = 2;
	        while (i <= num) {
	            fact *= i;
	            i++;
	        }
	        return fact;
	    }
	}