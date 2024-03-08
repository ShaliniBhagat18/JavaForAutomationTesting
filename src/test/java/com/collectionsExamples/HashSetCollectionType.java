package com.collectionsExamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetCollectionType {

//	HashSet
//	1. Only one null allowed
//	2. Duplicate not allowed
//	3. Insertion order is not preserved.
//	4. Hetorogenious objects are allowed.

	public static void main(String[] args) {

		Set<String> setcol = new HashSet<String>();
		setcol.add("Shalini");
		setcol.add("Tester");
		setcol.add("Tavant");
		setcol.add("QE practice");
		setcol.add("null");// Only one null is allowed
		setcol.add("Bhagat"); // Duplicate not allowed
		setcol.add("Bhagat");
		// Insertion order is not preserved.
		System.out.println(setcol);// [Shalini, Tester, null, QE practice, Bhagat, Tavant]

		// Accessing the Elements- In set get method is not applicable.

		String check = "Tavant";
		System.out.println(setcol.contains(check));

		// Removing the Values
		System.out.println("Before removal " + setcol);

		setcol.remove(null);
		System.out.println("After removal of the values " + setcol);// [Shalini, Tester, null, QE practice, Bhagat,
																	// Tavant]
		// o/p : Null can not be removed

		setcol.remove("Tavant");
		System.out.println("After removal of the values " + setcol);
		// o/p After removal of the values [Shalini, Tester, null, QE practice, Bhagat]

		// Iterative Type-1
		for (String name : setcol) {
			System.out.println(name);
		}

		// Iterative Type-2 Not applicable in Set as set is not index it is object base
		System.out.println("Using sinple for loop !!");
		for (int i = 0; i < setcol.size(); i++) {
			System.out.println(setcol.size());
		}

		// Display message
		System.out.println("Iterating over list:");

		
		//Iterative Type-3 using iterator
		// Iterating over hashSet items
		Iterator<String> i = setcol.iterator();

		// Holds true till there is single element remaining
		while (i.hasNext())

			// Iterating over elements
			// using next() method
			System.out.println(i.next());
	}

}
