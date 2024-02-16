package com.abstracts.example;

public class Square  extends Shape{
	private double sideInCm;
	
	
	
	

	public double getSideInCm() {
		return sideInCm;
	}


	public Square(double sideInCm) {
		this.sideInCm = sideInCm;
	}





	@Override
	public double calculateArea() {
		return sideInCm*sideInCm;
	}

}
