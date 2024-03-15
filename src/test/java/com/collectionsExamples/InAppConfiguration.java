package com.collectionsExamples;

import java.util.HashSet;
import java.util.Set;

public class InAppConfiguration {

	public static void main(String[] args) {
		Set<String> moduleNameFromAPI = new HashSet<String>();
		moduleNameFromAPI.add("Grower Opportunities");
		moduleNameFromAPI.add("CHT");
		moduleNameFromAPI.add("Top10");
		moduleNameFromAPI.add("Secure");
		moduleNameFromAPI.add("Catalyst");
		moduleNameFromAPI.add("Points by Product");

		Set<String> moduleNameFromUI = new HashSet<String>();
		moduleNameFromUI.add("Grower Opportunities");
		moduleNameFromUI.add("CHT");
		moduleNameFromUI.add("Top10");
		moduleNameFromUI.add("Secure");
		moduleNameFromUI.add("Catalyst");
		moduleNameFromUI.add("Points by Product");
		
		for(int i =0; i<moduleNameFromAPI.size(); i++) {
			if(moduleNameFromAPI.equals("CHT")) {
				break;
			}
		}

		if (moduleNameFromAPI.equals("CHT")) {
			System.out.println("User should be navigating to CHT screen");

		} else {
			System.out.println("Any other module");
		}

	}

}
