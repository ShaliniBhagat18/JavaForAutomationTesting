package com.collectionsExamples;

import java.util.HashMap;
import java.util.Map;

public class HashMapCollection {
    //It stores the data in (Key, Value) pairs.
	//To access a value one must know its key.
	//HashMap allow null key and null value
	//Insertion order is not preserve in HashMap
	//HashMap cannot contain duplicate keys and each key can map to at most one value
	
	public static void main(String[] args) {

		// Creating an empty HashMap 
        Map<String, Integer> hm = new HashMap<String, Integer>(); 
        hm.put("Shalini", 982345688);
        hm.put("Jason", 980986767);
        hm.put("Alex", 989564342);
        hm.put("Lara", 987675560);
     // Traversing through Map using for-each loop 
        for (Map.Entry<String, Integer> me : 
             hm.entrySet()) { 
  
            // Printing keys 
            System.out.print(me.getKey() + ":"); 
            System.out.println(me.getValue()); 
        } 
        
     // Creating an empty HashMap 
        Map<String, Integer> map = new HashMap<String, Integer>(); 
  
        // Inserting entries in the Map 
        // using put() method 
        map.put("vishal", 10); 
        map.put("sachin", 30); 
        map.put("vaibhav", 20);
        map.put(null, 20);
        map.put("vaibhav", 0);
  //Not preserve any order
//        vaibhav 20
//        vishal 10
//        sachin 30
        // Iterating over Map 
        for (Map.Entry<String, Integer> e : map.entrySet()) 
  
            // Printing key-value pairs 
            System.out.println(e.getKey() + " "
                               + e.getValue()); 
    } 
} 

	
