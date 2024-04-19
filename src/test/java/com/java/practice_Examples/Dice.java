package com.java.practice_Examples;

public class Dice {
	/*
	 * Simulate a dice roll using Math.random() and display the outcome (1 to 6)
	 */

	int roll() {
		double random = Math.random() * 6;
		return (int) Math.ceil(random);
	}

	public static void main(String[] args) {
		Dice dice = new Dice();
		for (int i = 0; i < 100; i++) {
			System.out.println(dice.roll());
		}
	}
}