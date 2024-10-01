package org.collection.set;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo2 {

	public static void main(String[] args) {
		// Set demonstration using HashSet
		// Creating a Set
		Set<String> hashSet = new HashSet<String>();

		// Adding values to a HashSet
		hashSet.add("India");
		hashSet.add("Russia");
		hashSet.add("China");
		hashSet.add("India");
		hashSet.add("USA");

		System.out.println("Un-sorted Set " + '\n' + hashSet);

		// Set demonstration using TreeSet
		Set<String> treeSet = new TreeSet<String>(hashSet);
		
		System.out.println("Sorted Set after passing into TreeSet " + '\n' + treeSet);

		LinkedHashSet<Integer> linked_HashSet = new LinkedHashSet<Integer>();
		linked_HashSet.add(2);
		linked_HashSet.add(4);
		linked_HashSet.add(1);
		linked_HashSet.add(9);
		linked_HashSet.add(2);

		// System.out.println(linked_HashSet);
		// System.out.println(linked_HashSet.contains(2));
		// System.out.println("Is Linked Hash Set empty? "+linked_HashSet.isEmpty());
		// System.out.println("Size of Linked Hash Set is: "+linked_HashSet.size());

	}
}