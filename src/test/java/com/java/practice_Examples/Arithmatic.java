package com.java.practice_Examples;

import java.util.Scanner;

public class Arithmatic {
// WAP that takes two numbers and shows result of all arithmetic operation 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Welcome to the arithmatic world \n");
		System.out.println("Enter the first number: ");
		int num1 = input.nextInt();
		System.out.println("Enter second number: ");
		int num2 = input.nextInt();

		int add = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;
		int mod = num1 % num2;
		
		System.out.println("Addition of two number is: " + add);
		System.out.println("Subtraction of two number is: " +sub);
		System.out.println("Multiplication of two number is: " +mul);
		System.out.println("Division of is: " + div);
		System.out.println("Modulus is: " +mod);
	}

}
