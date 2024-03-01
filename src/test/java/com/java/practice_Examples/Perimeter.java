package com.java.practice_Examples;

import java.util.Scanner;

public class Perimeter {
	//Write a program to calculate Perimeter of a rectangle 
	// Perimeter of rectangle ABCD = A+B+C+D
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.println("Welcome to Perimeter Calculator");
	        System.out.print("Please enter all 4 sides in cms: ");
	        double a = input.nextDouble();
	        double b = input.nextDouble();
	        double c = input.nextDouble();
	        double d = input.nextDouble();

	        double perimeter = a + b + c + d;
	        System.out.println("Perimeter of your rectangle is: " + perimeter + "cm");
	    }
	}