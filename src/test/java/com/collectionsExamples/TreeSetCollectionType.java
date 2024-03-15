package com.collectionsExamples;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetCollectionType {

//	TreeSet
//	1. Null not at all allows in TreeSet
//	2. Duplicate not allow
//	3. Insertion order is ascending.
//	4. Hetorogenious objects are allowed.
	public static void main(String[] args) {
		Set<String> treeObject = new TreeSet<String>();
		treeObject.add("Shalini");
		treeObject.add("Tavant");
		treeObject.add("QA");
		treeObject.add("Tester");
		treeObject.add("Hyderabad");
		treeObject.add("Hyderabad"); // Duplicate not allowed
		//treeObject.add(null); // Null not allows, It is through Exception in thread "main" java.lang.NullPointerException
        System.out.println(treeObject);
        // [Hyderabad, QA, Shalini, Tavant, Tester] - Ascending order is maintain
        
        //Iteration
        for(String value : treeObject) {
        	System.out.println(value);
        }
	}

}
