package com.collectionsExamples;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapCollections {
// LinkedHashMap allow null key and null value.
//	LinkedHashMap preserved insertion order
// Duplicate keys are not allowed

	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();

		map.put("Shalini", 980876567);
		map.put("Katlin", 987665647);
		map.put("Json", 58699799);
		map.put("Raymond", 980596567);
		map.put("Cristiano", 576876567);
		map.put(null, 576876567);
		map.put("Cristiano1", 0);
		map.put("Cristiano", 506876567);

		for (Map.Entry<String, Integer> e : map.entrySet()) {
			// System.out.print(e);
			// Printing key-value pairs
			System.out.println(e.getKey() + " " + e.getValue());
		}

	}

}
