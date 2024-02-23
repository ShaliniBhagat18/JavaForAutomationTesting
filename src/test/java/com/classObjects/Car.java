package com.classObjects;

public class Car {

	int noOfWheels;
	String color;
	float maxSpeed;
	float currentFuelOnLitter;
	int noOfSeats;

	public void drive() {
		if(currentFuelOnLitter<=0) {
			System.out.println("You can not drive the car !!");
		} else if(currentFuelOnLitter<5) {
			System.out.println("Your car is in reserved mode, please refuel it");
			currentFuelOnLitter--;
		}else
		System.out.println("Car is driving !!!");
		currentFuelOnLitter--;
	}

	public void addFuel(float fuel) {
		currentFuelOnLitter = currentFuelOnLitter + fuel;

	}

	public float getCurrentFuelLevel() {
		return currentFuelOnLitter;
	}
	
	public static void main(String[] args) {
		
	}
}
