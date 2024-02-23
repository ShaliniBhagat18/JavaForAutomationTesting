package com.java.practice_Examples;

public class WhileLoops {

	public static void main(String[] args) {

		int i = 0;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		int count = 500;
		while (count >= 200) {
			System.out.println(count);
			count--;

		}
		// print * pattern

//		*
//		* *
//		* * *
//		* * * *
//		* * * * *

		int rows = 0;
		while (rows < 5) {
			System.out.print("*");
			int j = 0;
			while (j < rows) {
				System.out.print(" *");
				j++;
			}
			System.out.println();
			rows++;
		}
//Print
//		*
//		** 
//		** * 
//		** * * 
//		** * * * 
		int rows1 = 0;
		while (rows1 < 5) {
			System.out.print("*");
			int k = 0;
			while (k < rows1) {
				System.out.print("* ");
				k++;
			}
			System.out.println();
			rows1++;
		}
		System.out.println();

		int rows2 = 5;
		while (rows2 < 1) {
			System.out.print("*");

			int a = 5;
			while (a < rows2) {
				System.out.print(" *");
				a--;
			}
			System.out.println();
			rows2--;

		}
	}
}