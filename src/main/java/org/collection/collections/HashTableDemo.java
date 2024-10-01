package org.collection.collections;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Integer, String> newHashTable = new Hashtable<Integer, String>();
		newHashTable.put(0, "China");
		newHashTable.put(1, "India");
		newHashTable.put(2, "USA");
		
		System.out.println(newHashTable.values());
	}

}
