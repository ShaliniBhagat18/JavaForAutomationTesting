package com.java.practice_Examples;

import java.util.Objects;

public class TryCatchUse {

	public static void main(String[] args) {
		String userNaeFromdB = "-";
		
		if(Objects.isNull(userNaeFromdB)|| userNaeFromdB.equalsIgnoreCase("")) {
			userNaeFromdB="-";
		}
		System.out.println(userNaeFromdB);

	}

}
