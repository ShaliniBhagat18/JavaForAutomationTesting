package com.java.practice_Examples;

import java.util.Scanner;

public class FahrenheitToCelsius {
// Create a program to conver Fahrenheit to Celsius
	// C= (F-32)*5/9
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Temperature converter");
		System.out.print("Enter your temp in F: ");
		float fah = input.nextFloat();
		float cel = (fah - 32) * 5.0f / 9.0f;
		System.out.println("Your temperature is: " + cel + "C");
	}
}