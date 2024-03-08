package com.collectionsExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OneSpecificElementAtTop {
	public static void main(String[] args) {

		List<String> API = new ArrayList<String>();
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

		for (int i = 0; i < API.size(); i++) {
			if (API.contains("Tavant")) {
				API.remove("Tavant");
				API.add(0, "Tavant");
			} else {
				System.out.println("Not available in the list!! ");
			}
		}
		System.out.println(API);
		
		if(API.equals(myList2)) {
			System.out.println("It is same !!");
			System.out.println(API);
			System.out.println(myList2);
		}else {
			System.out.println("It is not same !!");
			System.out.println(API);
			System.out.println(myList2);
			
		}

	}

}
