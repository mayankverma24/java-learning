package com.javalearning.collections;

import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// List demonstration using ArrayList
		// Creating a List
		List<String> a = new ArrayList<String>();
		List<String> b = new LinkedList<String>();
		List<String> c = new Vector<String>();

		// Adding values to a HashSet
		a.add("India");
		a.add("Russia");
		a.add("China");
		a.add("India");
		b.add(0, null);
		c.add(0, null);
		c.add(1, null);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		// List demonstration using TreeSet
		System.out.println("Sorted Set after passing into TreeSet");
		Set<String> tree_Set = new TreeSet<String>(a);
		System.out.println(tree_Set);

		LinkedHashSet<Integer> linked_HashSet = new LinkedHashSet<Integer>();
		linked_HashSet.add(2);
		linked_HashSet.add(4);
		linked_HashSet.add(1);
		linked_HashSet.add(9);
		linked_HashSet.add(2);

		System.out.println(linked_HashSet);
		System.out.println(linked_HashSet.contains(2));
		System.out.println("Is Linked Hash Set empty? " + linked_HashSet.isEmpty());
		System.out.println("Size of Linked Hash Set is: " + linked_HashSet.size());

	}
}