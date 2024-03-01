package com.collectionsExamples;

public class VarArgs {
// Write a method concatenate Strings that takes variable arguments of Strig type and concatenates them into a single string
	public static void main(String[] args) {
		System.out.println(concatenate("Shalini", "Ram"));
		System.out.println(concatenate("Shalini", "Ram", "Sonone"));
		System.out.println(concatenate("Shalini", "Ram", "Purvi"));

	}
	
	public static String concatenate(String...strs) {
		StringBuilder sb = new StringBuilder();
		for(String str : strs) {
			sb.append(str).append(" ");
		}
		return sb.toString();
	}

}
