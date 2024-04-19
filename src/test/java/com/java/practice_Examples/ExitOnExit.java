package com.java.practice_Examples;

import java.util.Scanner;

public class ExitOnExit {
	/*
	 * Create a program using break statement to read inputs from the user in a loop 
	 * and break the loop if a specific keyword (like "exit") is entered
	 */
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your command: ");
            String command = input.next();
            if (command.equalsIgnoreCase("exit")) {
                break;
            }
        }
        System.out.println("You have successfully exited.");
    }
}
