package com.java.practice_Examples;

import java.util.Scanner;

public class RightHalfPyramid {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("We are here to print pattern \n");
		System.out.println("Please Enter the no of rows: ");
		int rows = input.nextInt();
		printRightHalfPyramid(rows);
		printReverseRightHalfPyramid(rows);
	}
	
	public static void printReverseRightHalfPyramid(int maxRows) {
		System.out.println("\n Here is Right Half Pyramid");
		int rows = maxRows;
		while(rows>0) {
			int i=0;
			while(i<rows) {
				System.out.println(" *");
				i++;
			}
			System.out.println();
			rows--;
		}
	}

	public static void printRightHalfPyramid(int rows) {
		
	}

}
