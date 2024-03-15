package com.collectionsExamples;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.Multimap;

public class ArrayListMultimapCollection {
	public static void main(String args[]) {
//Key behaviour
//		HashMap
//		1. Null not allowed
//		2. Duplicate not allow
//		3. Insertion order is not preserved
//		4. Hetorogenious objects are allowed..

//Values behaviour
//		ArrayList
//		1. Null is allowed.
//		2. Duplicate allowed
//		3. Insertion order is preserved.
//		4. Hetorogenious objects are allowed.

		List<String> myList = new ArrayList<String>();
		myList.add("Shalini");
		myList.add("Alex");
		myList.add("Json");
		myList.add("Katalyn");
		myList.add("Rustal");
		myList.add("John");
		myList.add("John");

		List<Integer> myList1 = new ArrayList<Integer>();
		myList1.add(890999898);
		myList1.add(878787878);
		myList1.add(932345678);
		myList1.add(799898989);
		myList1.add(565656565);
		myList1.add(965656565);
		myList1.add(965656567);
		

		List<String> myList2 = new ArrayList<String>();
		myList2.add("Tavant");
		myList2.add("");
		myList2.add("Tech Mahindra");
		myList2.add("Oracle");
		myList2.add("TCS");
		myList2.add("Tech");
		myList2.add("Tech M");
		Multimap<String, String> dataFromAPI = LinkedListMultimap.create();
		for (int i = 0; i < myList.size(); i++) {
			dataFromAPI.put(myList.get(i).toString(), myList1.get(i).toString());
		}
		for (int j = 0; j < myList1.size(); j++) {
			dataFromAPI.put(myList.get(j).toString(), myList2.get(j).toString());
		}
		System.out.println(dataFromAPI);
	}

}
