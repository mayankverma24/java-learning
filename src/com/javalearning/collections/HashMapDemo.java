package com.javalearning.collections;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// Creating a HashMap
		HashMap<String, Integer> numberMapping = new HashMap<String, Integer>();

		// Adding key-value pairs to a HashMap
		numberMapping.put("One", 1);
		numberMapping.put("Two", 2);
		numberMapping.put("Three", 3);
		numberMapping.put(null, null);

		// Add a new key-value pair only if the key does not exist in the HashMap, or is
		// mapped to `null`
		numberMapping.putIfAbsent("Four", 4);

		System.out.println(numberMapping);
	}
}