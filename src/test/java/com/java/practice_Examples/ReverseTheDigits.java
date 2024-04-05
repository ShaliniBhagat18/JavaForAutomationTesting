package com.java.practice_Examples;

import java.util.Scanner;

public class ReverseTheDigits {
/*
 * Create a program to reverse the digits of a number
 * first divide given number by 10 and see the modulus
 * eg 1234
 * 1234%10 =4, 123%10=3, 12%10=2, 1%10=1
 * 0*10+4=4
 * 4*10+3=43
 * 43*10+2=432
 * 432*10+1=4321 
 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Reverse digitals ");
		System.out.println("Plese enter your number ");
		int num = input.nextInt();
		int reverse = reverse(num);
		System.out.println("Reverse of your number is "+reverse);

	}
	public static int reverse(int num) {
		
		int newNum=0;
		while(num>0) {
			int digit =num%10;
			newNum = newNum*10+digit;
			num=num/10;
		}
		return newNum;
		
	}

}
