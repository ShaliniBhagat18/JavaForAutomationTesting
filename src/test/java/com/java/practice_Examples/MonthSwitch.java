package com.java.practice_Examples;

import java.util.Scanner;

public class MonthSwitch {
	/*
	 * Create a program to print the month of the year based on a number (1-12) input by the user.
	 */

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Month mapping\n");
        System.out.print("Please enter your month number: ");
        int monthNum = input.nextInt();
        String monthName = getMonthName(monthNum);
        System.out.println("Your month name is: " + monthName);
    }

    public static String getMonthName(int monthNum) {
    	switch (monthNum) {
		case 1 :
			System.out.println("January");
			break;
		case 2 :
			System.out.println("February");
			break;

		default:
			break;
		}
		return null;
    	
		/*
		 * return switch (monthNum) { case 1 -> "January"; case 2 -> "February"; case 3
		 * -> "March"; case 4 -> "April"; case 5 -> "May"; case 6 -> "June"; case 7 ->
		 * "July"; case 8 -> "August"; case 9 -> "September"; case 10 -> "October"; case
		 * 11 -> "November"; case 12 -> "December"; default -> "Mars Month"; };
		 */
    }
}