package com.collectionsExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OneSpecificElementAtTop {
	public static void main(String[] args) {

		Set<String> API = new HashSet<String>();
		API.add("Shalini");
		API.add("Tester");
		API.add("QA");
		API.add("Tavant");
		API.add("Tech");

		List<String> myList2 = new ArrayList<String>();
		myList2.add("Tavant");
		myList2.add("Shalini");
		myList2.add("Tester");
		myList2.add("QA");
		myList2.add("Tech");

		Set<String> UI = new HashSet<String>();
		UI.add("Tavant");
		UI.add("Shalini");
		UI.add("Tester");
		UI.add("QA");
		UI.add("Tech");
		String expectedText = myList2.get(0);

		if (expectedText == "Tavant") {
			System.out.println("Test Pass");
		} else {
			System.out.println("Failed");
		}
		System.out.println(API);
		System.out.println(UI);
		if (API.equals(UI)) {
			System.out.println("It is same !!");
		} else {
			System.out.println("It is not same !!");
		}

	}

}
