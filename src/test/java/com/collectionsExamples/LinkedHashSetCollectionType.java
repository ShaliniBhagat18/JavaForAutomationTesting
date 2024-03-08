package com.collectionsExamples;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetCollectionType {

//	LinkedHashSet
//	1. Null allows only once
//	2. Duplicate not allow
//	3. Insertion order is preserved
//	4. Hetorogenious objects are allowed.
//  5. Remove, add and other all operation is similer to others	

	public static void main(String[] args) {
		Set<String> mySet = new LinkedHashSet<String>();

		mySet.add("Shalini");
		mySet.add("Shalini");// Duplicate not allowed
		mySet.add(null);// only one null is accept
		mySet.add("Tester");
		mySet.add("QA");
		mySet.add("Tavant");
		mySet.add("QE");
		mySet.add("QE1");
		mySet.add("QE2");

		// Insertion order is preserved
		System.out.println(mySet);// [Shalini, null, Tester, QA, Tavant, QE, QE1, QE2]

		for (String name : mySet) {
			System.out.println(name);
		}

		Iterator<String> i = mySet.iterator();

		// Holds true till there is single element remaining
		while (i.hasNext())

			// Iterating over elements
			// using next() method
			System.out.println(i.next());
	}
}
