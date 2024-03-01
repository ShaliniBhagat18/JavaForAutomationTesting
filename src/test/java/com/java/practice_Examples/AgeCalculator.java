package com.java.practice_Examples;

import java.util.Scanner;

public class AgeCalculator {
	//WAP that categorize the person into different age groups
	// Child-Below 13,  Teen-below 20, Adult-below 60, Sr. Citizen-above 60 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to age calculator");
		System.out.print("Please enter your age: ");
		int age = input.nextInt();

		if (age >= 65) {
			System.out.println("You are a senior citizen");
		} else if (age >= 20) {
			System.out.println("You are an adult");
		} else if (age >= 13) {
			System.out.println("You are a teenager");
		} else {
			System.out.println("You are a child");
		}
	}
}