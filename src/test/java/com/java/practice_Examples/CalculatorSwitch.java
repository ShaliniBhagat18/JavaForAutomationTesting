package com.java.practice_Examples;

import java.util.Scanner;

public class CalculatorSwitch {
	/*
	 * Create a program to create a simple calculator that uses a switch statement to perform basic arithmatic
	 * operations like addition, subtraction, multiplication, division
	 */

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculator\n");
        System.out.print("Please enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Now, enter the second number: ");
        int num2 = input.nextInt();
        System.out.print("Now, enter the operation: ");
        String operation1 = input.next();
        
        switch (operation1) {
		case "+":
			System.out.println("Addition " +(num1+num2));
			break;
			
		case "-":
			System.out.println("Sub " +(num1-num2));
			break;
			
		case "*":
			System.out.println("Mul " +(num1*num2));
			break;
			
		case "/":
			System.out.println("Addition " +(num1/num2));
			break;

		default:
			break;
		}

       /* int result = switch (operation) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> -1;
        };*/

        System.out.println("Your answer is: " + result);
    }
}
}
