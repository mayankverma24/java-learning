package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {
		using_arrays_dot_sort();
	}

	public static void using_arrays_dot_sort() {
		int intArray[] = { 33, 23, 14, 6, 7, 44, 32 };
		Arrays.sort(intArray);
		System.out.println(Arrays.toString(intArray));
		String stringArray[] = { "India", "Russia", "China", "France" };
		System.out.println("This is an example of a String Array " + stringArray[2]);
	}

	public static void using_for_loop() {
		System.out.println("Enter string to sort:");
		Scanner read = new Scanner(System.in);
		String inputStr = read.nextLine();
		// int intArray[] = { 33, 23, 14, 6, 7, 44, 32 };
		// System.out.println("Array length is " + intArray.length);
		int count = 0;
		for (int i = 0; i < inputStr.length(); i++) {
			if (inputStr.charAt(i) > inputStr.charAt(i)) {
				count = count++;
			}
		}

//		String stringArray[] = { "India", "Russia", "China", "France" };
		System.out.println("This is an example of a String Array " + count);

		read.close();
	}
}