package com.collectionsExamples;

import java.util.ArrayList;
import java.util.List;

public class ListCollectionType {

//	List
//	1. Insertion order is preserved
//	2. Duplicate are allowed
//	3. Null values are allowed
//	4. Heterogenious Objects are allowed
//	5. List is indexed, the element which we wish to change is referenced by the index of the element

	public static void main(String[] args) {
		// Creating an object of List interface,
		// implemented by ArrayList class
		List<String> al = new ArrayList<String>();

		// Adding elements to object of List interface
		// Custom elements

		// Adding elements to List class using add() method
		al.add("Shalini");
		al.add("Name_3");
		al.add("Name_2");// Duplicates allowed
		al.add("Name_2");
		al.add(null); // Null allowed
		al.add(1, "Tester");
		System.out.println(al);

		for (String name : al) {
			System.out.println(name);
		}
		// o/p: [Shalini, Tester, Name_3, Name_2, Name_2, null] Insertion order also
		// preserved

		// Updating elements
		al.set(1, "Bhagat");
		System.out.println(al);
		// o/p: [Shalini, Bhagat, Name_3, Name_2, Name_2, null]

		// Searching for elements

		// create a list of integers
		List<Integer> numbers = new ArrayList<Integer>();

		// add some integers to the list
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(2);

		// use indexOf() to find the first occurrence of an
		// element in the list
		int index = numbers.indexOf(2);
		System.out.println("The first occurrence of 2 is at index " + index); // The first occurrence of 2 is at index 1

		// use lastIndexOf() to find the last occurrence of
		// an element in the list
		int lastIndex = numbers.lastIndexOf(2);
		System.out.println("The last occurrence of 2 is at index " + lastIndex);// The last occurrence of 2 is at index
																				// 3

		List<String> removal = new ArrayList<String>();

		removal.add("First_Index");
		removal.add("Second_Index");
		removal.add("Third_Index");
		removal.add("Fourth_Index");

		removal.add(1, "Shalini");
		System.out.println(removal); // [First_Index, Shalini, Second_Index, Third_Index, Fourth_Index]

		// Now remove element from the above list
		// present at 1st index
		removal.remove(1);
		System.out.println(removal);// [First_Index, Second_Index, Third_Index, Fourth_Index]

		// Now remove the current object from the updated
		// List
		removal.remove("Shalini");
		System.out.println(removal);//[First_Index, Second_Index, Third_Index, Fourth_Index]
		
		//Accessing Elements get(int index)
		
		String firstName = removal.get(0);
		String secondtName = removal.get(1);
		String thirdName = removal.get(2);
		String fourthName = removal.get(3);
		
		System.out.println(firstName);
		System.out.println(secondtName);
		System.out.println(thirdName);
		System.out.println(fourthName);
		
		//Checking if an element is present in the List
		
		// Checking if element is present using contains()
        // method
        boolean isPresent = al.remove("ghghghg");
        System.out.println(isPresent);


	}

}
