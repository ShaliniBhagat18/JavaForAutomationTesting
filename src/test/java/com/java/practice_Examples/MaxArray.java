package com.java.practice_Examples;

public class MaxArray {
	/*
	 * Create a program using for-each to find the maximum value in an Interger Array
	 */
	
	 public static void main(String[] args) {
	        System.out.println("Welcome to finding the maximum\n");
	        int[] arr = ArrayUtility.inputArray();

	        int max = Integer.MIN_VALUE;
	        for (int num: arr) {
	            if (max < num) {
	                max = num;
	            }
	        }

	        System.out.println("Maximum number is: " + max);
	    }
	}