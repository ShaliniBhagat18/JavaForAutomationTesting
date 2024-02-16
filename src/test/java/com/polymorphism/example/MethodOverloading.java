package com.polymorphism.example;

public class MethodOverloading {

	public int sum(int a, int b) {
		return a + b;
	}

	public int sum(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		System.out.println(obj.sum(5, 10));
		System.out.println(obj.sum(5, 10, 34, 45));
	}

}
