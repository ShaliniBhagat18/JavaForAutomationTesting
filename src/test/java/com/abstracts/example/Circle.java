package com.abstracts.example;

public class Circle extends Shape {
	private double radiusInCm;

	public Circle(double radiusInCm) {
		this.radiusInCm = radiusInCm;
	}

	public double getRadiusInCm() {
		return radiusInCm;
	}

	@Override
	public double calculateArea() {
		return Math.PI*Math.pow(radiusInCm, 2);
	}

}
