package com.java.practice_Examples;

import java.util.Scanner;

public class FloatMultiplication {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Welcome to the float multiplication world \n");
		System.out.println("Enter the first number : ");
		double num1 = input.nextDouble();
		System.out.println("Enter the second number : ");
		double num2 = input.nextDouble();
		
		double floatMul = num1*num2;
		System.out.println("Multilplication is : " +floatMul);
		
	}
}
