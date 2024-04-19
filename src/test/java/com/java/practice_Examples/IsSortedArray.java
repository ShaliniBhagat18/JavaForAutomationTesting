package com.java.practice_Examples;

public class IsSortedArray {
	/*
	 * Create a program to check if the given array is sorted 
	 * 1 , 2, 5, 8, 8, 9 Increasing Order
	 * 53, 47, 23, 5, Decreasing order
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Array Sorting Check post\n");
		int[] numArr = ArrayUtility.inputArray();
		boolean isInc = isIncreasing(numArr);
		boolean isDec = isDecreasing(numArr);
		if (isInc || isDec) {
			System.out.println("Your array is sorted");
		} else {
			System.out.println("Your array is not sorted");
		}
	}

	public static boolean isDecreasing(int[] numArr) {
		int i = 1;
		while (i < numArr.length) {
			if (numArr[i] > numArr[i - 1]) {
				return false;
			}
			i++;
		}
		return true;
	}

	public static boolean isIncreasing(int[] numArr) {
		int i = 1;
		while (i < numArr.length) {
			if (numArr[i] < numArr[i - 1]) {
				return false;
			}
			i++;
		}
		return true;
	}
}