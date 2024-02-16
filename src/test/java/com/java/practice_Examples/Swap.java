package com.java.practice_Examples;

import java.util.Scanner;

public class Swap {
//Create a program to swap two number
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Welcome to the swapping world \n");
		System.out.println("Enter the first number : ");
		int a = input.nextInt();
		System.out.println("Enter the second number : ");
		int b = input.nextInt();

		int c = a;
		a = b;
		b = c;
		
		System.out.println("Swapping is completed ...");
		System.out.println("Value of a is : " +a);
		System.out.println("Value of b is : " +b);

	}

}
