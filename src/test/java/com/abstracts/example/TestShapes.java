package com.abstracts.example;

public class TestShapes {
// We can not create obj for abstract class
	// One abstract method responsible for implementation of abstract methods in different classes
	public static void main(String[] args) {
		Circle circle = new Circle(5);
		Square square = new Square(10);
		System.out.println("Area of circle is " + circle.calculateArea());
		System.out.println("Area of square is " + square.calculateArea());
	}

}
