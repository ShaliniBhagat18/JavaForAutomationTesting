package com.java.practice_Examples;

public class DiagonalSum2DArray {
	/*
	 * Create a program to find the sum of two diagonal elements
	 *   1 2 3 
	 *   4 5 6
	 *   7 8 9
	 *   (1+ 3+ 5+ 7+ 9)=  
	 */
	 public static void main(String[] args) {
	        System.out.println("Welcome to Diagonal Sum");
	        int[][] numArr = ArrayUtility.input2DArray();
	        long sum = sumOfDiagonals(numArr);
	        System.out.println("Sum of diagonals is: " + sum);
	    }

	    public static long sumOfDiagonals(int[][] numArr) {
	        long leftSum = sumOfLeftDiagonal(numArr);
	        long rightSum = sumOfRightDiagonal(numArr);
	        long sum = leftSum + rightSum;
	        if (numArr.length % 2 != 0) {
	            int ind = numArr.length / 2;
	            sum -= numArr[ind][ind];
	        }
	        return sum;
	    }

	    public static long sumOfLeftDiagonal(int[][] numArr) {
	        long sum = 0;
	        int i = 0;
	        while (i < numArr.length) {
	            sum += numArr[i][i];
	            i++;
	        }
	        return sum;
	    }

	    public static long sumOfRightDiagonal(int[][] numArr) {
	        long sum = 0;
	        int i = 0;
	        while (i < numArr.length) {
	            int col = numArr.length - 1 - i;
	            sum += numArr[i][col];
	            i++;
	        }
	        return sum;
	    }
	}