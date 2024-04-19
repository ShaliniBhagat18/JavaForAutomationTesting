package com.java.practice_Examples;
/*
 * Verify if a number is palindrome  32123
 */

public class PalindromeArray {
	/*
	 * Create a program to check is the array is Palindrome or not 5, 6, 4, 4 ,6,5
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Palindrome Checker\n");
		int[] numArr = ArrayUtility.inputArray();
		boolean isPalin = isPalindrome(numArr);
		if (isPalin) {
			System.out.println("Your array is Palindrome");
		} else {
			System.out.println("Your array is not Palindrome");
		}
	}

	public static boolean isPalindrome(int[] numArr) {
		int i = 0;
		while (i < numArr.length / 2) {
			if (numArr[i] != numArr[numArr.length - 1 - i]) {
				return false;
			}
			i++;
		}
		return true;
	}
}