package com.solid.S.principles;

public class SPrinciple {
// S - Single Responsibility Principle
	
//	Single responsibility principle: The single responsibility principle states that 
//	every Java class must perform a single functionality.Implementation of 
//	multiple functionalities in a single class mashup the code.
//Here we have written all code in single class, instead of all code in single class, let segregate according to functionalities in different classed
	public static void sendOTP(String medium) {

		if (medium.equalsIgnoreCase("email")) {
			System.out.println("Use this logic");
		} else if (medium.equalsIgnoreCase("phone")) {
			System.out.println("Use this logic");
		} else {
			System.out.println("Nothing to use");
		}

	}

	public static void printPassbook() {
		System.out.println("Use this code !!");
	}

	public void getLoanInterestInfo(String loanType) {
		if (loanType.equalsIgnoreCase("homeloan")) {
			System.out.println("Home loan Info");
		} else if (loanType.equalsIgnoreCase("PersonalLoan")) {
			System.out.println("Use this code");
		} else {
			System.out.println("Use this code");
		}

	}

	public long deposit(long amount, String accountNo) {
		System.out.println("This is deposit !!");
		return amount;
	}

	public long withDraw(long amount, String accountNo) {
		System.out.println("Use this code for account details !!!");
		return amount;

	}

}
