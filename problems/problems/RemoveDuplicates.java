//Removing Duplicates Using Java 8 Stream.distinct()

package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));
		// Print the Arraylist
		System.out.println("ArrayList with duplicates: " + list);

		// Construct a new list from the set constructed from elements
		// of the original list
		List<Integer> newList = list.stream().distinct().collect(Collectors.toList());
		// Print the ArrayList with duplicates removed
		System.out.println("ArrayList with duplicates removed: " + newList);
	}

}
