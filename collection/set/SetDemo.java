package set;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo {

	public static void main(String[] args) {
		// Set demonstration using HashSet
		// Creating a Set
		Set<String> hash_Set = new HashSet<String>();

		// Adding values to a HashSet
		hash_Set.add("India");
		hash_Set.add("Russia");
		hash_Set.add("China");
		hash_Set.add("India");
		hash_Set.add("USA");

		System.out.println("Un-sorted Set " + '\n' + hash_Set);

		// Set demonstration using TreeSet
		Set<String> tree_Set = new TreeSet<String>(hash_Set);
		
		System.out.println("Sorted Set after passing into TreeSet " + '\n' + tree_Set);

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