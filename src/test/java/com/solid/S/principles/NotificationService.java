package com.solid.S.principles;

public class NotificationService {

	public static void sendOTP(String medium) {
		if (medium.equalsIgnoreCase("email")) {
			System.out.println("Use this logic");
		} else if (medium.equalsIgnoreCase("phone")) {
			System.out.println("Use this logic");
		} else {
			System.out.println("Nothing to use");
		}

	}
}
