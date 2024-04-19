package com.java.practice_Examples;

import java.util.Scanner;

public class PasswordChecker {
	
	/*
	 * Create a program using do-while to find password checker until  a valid password is entered. 
	 */
	
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to set your Password \n");
		String password;
		do {
			System.out.println("Please enter your password !!");
			password= input.next();
		}while(!isValidPassword(password));
		System.out.println("Thanks for entering a valid password");
	}
	
	public static boolean isValidPassword(String password) {
		return password.length()>6;
		
	}

}
