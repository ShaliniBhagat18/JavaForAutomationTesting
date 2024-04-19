package com.java.practice_Examples;

public class StringManipulation {
	/*
	 * Concatenate and Convert: Take two strings, concatenate them, and covert the result to uppercase
	 */
	 public static void main(String[] args) {
	        String firstName = "Prashant";
	        String lasName = "Jain";
	        String fullName = firstName.concat( " ").concat(lasName);
	        System.out.println(fullName.toUpperCase());
	    }
	}
