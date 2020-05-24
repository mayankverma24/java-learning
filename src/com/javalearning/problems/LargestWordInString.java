package com.javalearning.problems;

import java.util.Scanner;

public class LargestWordInString {

	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		Scanner input = new Scanner(System.in);
		System.out.println("Largest word is " + findLargest(input.nextLine()));
		input.close();
	}

	public static String findLargest(String a) {
		int temp = 0;
		String[] words = a.split("[^A-Za-z0-9]");
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > words[temp].length()) {
				temp = i;
			}
		}
		return words[temp];
	}

}
