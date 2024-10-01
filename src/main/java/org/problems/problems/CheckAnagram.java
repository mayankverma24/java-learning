package org.problems.problems;

import java.util.Arrays;
import java.util.Scanner;

//Check if two strings are anagram
public class CheckAnagram {

	// Complete the makeAnagram function below.
	static boolean checkAnagram(String a, String b) {
		char[] charArrA = a.toCharArray();
		char[] charArrB = b.toCharArray();

		Arrays.sort(charArrA);
		Arrays.sort(charArrB);

		for (int i = 0; i < charArrA.length; i++)
			if (charArrA.length != charArrB.length) {
				return false;		
			} else if (charArrA[i] != charArrB[i]) {
				return false;
			}
		return true;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two strings to check for anagram: ");
		String a = in.next();
		String b = in.next();
		System.out.println(checkAnagram(a, b));
		in.close();
	}
}