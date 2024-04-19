package com.java.practice_Examples;

public class SumPositive {
	/*
	 * Create a program using continue to sum all 
	 * positive numbers entered by the user, skip any negative numbers
	 */
	 public static void main(String[] args) {
	        System.out.println("Welcome to adding positive numbers.");
	        int[] numArr = ArrayUtility.inputArray();

	        int sum = 0;
	        for (int num : numArr) {
	            if (num < 0) {
	                continue;
	            }
	            sum += num;
	        }
	        System.out.println("The sum of positive numbers is: " + sum);
	    }
	}
