package com.java.practice_Examples;

import java.util.Scanner;

public class DeleteFromArray {
	/*
	 * Create a program to return a new array deleting a specific element.
	 * Here we can not change array size so first need to find occurrences of the deleting element and create new array without occ
	 * Arra = [34, 56, 24, 56, 45 24] = 24
	 * Array[4] = [34, 56, 56, 45]
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Array Deletion\n");
		int[] numArr = ArrayUtility.inputArray();
		System.out.print("Now, enter then number you want to delete: ");
		int numToDelete = input.nextInt();
		int[] newArr = deleteNumber(numArr, numToDelete);
		System.out.println("Here is your new array");
		ArrayUtility.displayArray(newArr);
	}

	public static int[] deleteNumber(int[] numArr, int numToDelete) {
		int occ = OccurrencesArray.noOfOccurrences(numArr, numToDelete);
		if (occ == 0) {
			return numArr;
		}
		int newSize = numArr.length - occ;
		int[] newArr = new int[newSize];

		int i = 0, j = 0;
		while (i < numArr.length) {
			if (numArr[i] != numToDelete) {
				newArr[j] = numArr[i];
				j++;
			}
			i++;
		}

		return newArr;
	}
}