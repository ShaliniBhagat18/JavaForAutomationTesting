package com.collectionsExamples;

import java.util.Iterator;

public class VarArg {

	public static void main(String... args) {
		System.out.println(sum(2, 4, 5, 6, 7, 6));
		System.out.println(sum1(23, 45, 3, 4, 5, 6));
		System.out.println(add(new int[] {12,34,56,6,7}));
	}

// First way
	public static int sum(int... a) {
		int sum = 0;
		for (int i : a) {
			sum = sum + i;
		}
		return sum;
	}

// Second way
	public static int sum1(int first, int second, int... a) {
		int sum = first + second;
		for (int i : a) {
			sum = sum + i;
		}
		return sum;
	}
//Traditional way using array

	public static int add(int[] a) {
		int sum = 0;
		for (int i : a) {
			sum = sum + i;
		}
		return sum;

	}
}
