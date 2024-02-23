package com.classObjects;

public class Drivers {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.addFuel(6);
		myCar.drive();
		System.out.println(myCar.getCurrentFuelLevel());

	}

}
