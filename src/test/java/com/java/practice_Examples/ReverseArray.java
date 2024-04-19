package com.java.practice_Examples;

public class ReverseArray {
	/*
	 * Create a program to reverse an array
	 * Eg : 2 , 3, 4, 5, 6
	 *      6 , 5, 4, 3, 2
	 */
	 public static void main(String[] args) {
	        System.out.println("Welcome to Array Reversal\n");
	        int[] numArr = ArrayUtility.inputArray();
	        reverse(numArr);
	        System.out.println("Your reversed array is");
	        ArrayUtility.displayArray(numArr);
	    }

	    public static void reverse(int[] arr) {
	        int i = 0;
	        while (i < arr.length / 2) {
	            int swap = arr[i];
	            arr[i] = arr[(arr.length - 1) - i];
	            arr[(arr.length - 1) - i] = swap;
	            i++;
	        }
	    }
	}