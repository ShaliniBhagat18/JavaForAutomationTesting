package com.java.practice_Examples;

import java.util.Scanner;

public class MultiplicationTable {
	/*
	 * Develop a program that prints the multiplication table for a given number
	 * 4*1, 4*2, 4*3......
	 */
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Welcome to Multiplication World\n");
	        System.out.print("Please enter your number: ");
	        int num = scanner.nextInt();
	        printMultiplicationTable(num);
	    }

	    public static void printMultiplicationTable(int num) {
	        int i = 1;
	        while (i <= 10) {
	            System.out.println(num + " X " + i + " = " + (num * i));
	            i++;
	        }
	    }
	}