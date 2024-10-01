package problems;

import java.util.HashSet;

public class FindFirstDuplicateElement {

	static int getFirstRepeatingElementArray(int array[]) {
		// Initialize index of first repeating element
		int minimumIndex = -1;

		// Creates an empty hashset
		HashSet<Integer> set = new HashSet<>();

		// Iterate over the input array from right to left
		for (int i = array.length - 1; i >= 0; i--) {
			// If set contains the element, update minimum index
			if (set.contains(array[i]))
				minimumIndex = i;

			else // Else add element to hash set
				set.add(array[i]);
		}
		return minimumIndex;
	}

	public static void main(String[] args) throws java.lang.Exception {
		int[] array = { 10, 7, 8, 1, 6, 7 };
		int min = getFirstRepeatingElementArray(array);
		// Print the result
		if (min != -1)
			System.out.println("The first repeating element in array is " + array[min]);
		else
			System.out.println("There are no repeating elements");
	}

}
