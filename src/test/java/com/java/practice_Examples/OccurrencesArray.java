package com.java.practice_Examples;

import java.util.Scanner;

public class OccurrencesArray {
	/*
	 * Create a program to find number of occurrences of an elements in an Array 
	 * Eg [2, 4, 5, 4, 5]
	 * 4
	 * occ = 2
	 */
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.println("Welcome to Array Occurrences\n");
	        int[] numArr = ArrayUtility.inputArray();
	        System.out.print("Now enter the number you want to find: ");
	        int num = input.nextInt();
	        int occurrences = noOfOccurrences(numArr, num);
	        System.out.println("Your element was found " + occurrences + " times in the array");
	    }

	    public static int noOfOccurrences(int[] numArr, int num) {
	        int occ = 0;
	        int i = 0;
	        while (i < numArr.length) {
	            if (numArr[i] == num) {
	                occ++;
	            }
	            i++;
	        }
	        return occ;
	    }
	}