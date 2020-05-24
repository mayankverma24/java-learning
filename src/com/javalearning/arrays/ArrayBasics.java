package com.javalearning.arrays;

import java.util.Arrays;

public class ArrayBasics {

	public static void main(String[] args) {
	

		int[] n = new int[3]; // declaring an array of size 3
		n[0] = 8;
		n[1] = 6;
		n[2] = 1;
		System.out.println(n.getClass().getName());
		System.out.println(Arrays.toString(n));
		for (int j = 0; j < n.length; j++) {
			System.out.println(n[j]);
		}

		int[] intArray = { 5, 1, 6, 9, 6, 4 }; // this type of syntax is used mostly
		for (int i = 0; i < intArray.length; i++) {
			// System.out.println(intArray[i]);
			if (intArray[i] == 4) {
				System.out.println("4 is at index " + i);
				break;
			}
		}
		System.out.println("Integer is not present in the array");
	}
}