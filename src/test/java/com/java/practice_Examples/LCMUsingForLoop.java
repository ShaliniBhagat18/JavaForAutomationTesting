package com.java.practice_Examples;

public class LCMUsingForLoop {

	public static void main(String[] args) {
		int firstNo = 20;
		int secondNo = 15;
		int factor;
		for(int i=1; i<=secondNo; i++) {
			factor=firstNo*i;
			if(factor % secondNo==0) {
				System.out.println("Factorial of the number is " +factor);
				break;
			}
		}
		

	}

}
