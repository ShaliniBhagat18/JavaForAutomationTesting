package com.interfaces.example;

public abstract class Birds implements Flyable{
	
	private String breed;

	
	public Birds(String breed) {
		this.breed = breed;
	}
	
	public String getBreed() {
		return breed;
	}
	
}
