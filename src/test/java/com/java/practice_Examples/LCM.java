package com.java.practice_Examples;

import java.util.Scanner;

public class LCM {
	/*
	 * Find the Least Common Multiple (LCM) of 
	 * 15 20 LCM = 60  these 2 number divide 60 so LCM is 60 
	 * Here we are considering first number and checking table for it and checking table value is fully divisible by second number or not
	 * Dono se divide hone vala number is LCM
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to LCM");
		System.out.print("Please enter your number: ");
		int first = input.nextInt();
		System.out.print("Please enter your number: ");
		int second = input.nextInt();
		int lcm = lcm(first, second);
		System.out.println("LCM of the two numbers is: " + lcm);
	}

	public static int lcm(int first, int second) {
		int i = 1;
		while (true) {
			int factor = first * i;
			if (factor % second == 0) {
				return factor;
			}
			i++;
		}
	}
}