package problems;

import java.util.Scanner;

public class LongestWordInString {

	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		Scanner input = new Scanner(System.in);
		System.out.println("Longest word is: " + findLongest(input.nextLine()));
		input.close();
	}

	public static String findLongest(String a) {
		int longestWord = 0;
		String[] str = a.split("[^A-Za-z0-9]");
		for (int i = 0; i < str.length; i++) {
			if (str[i].length() > str[longestWord].length()) {
				longestWord = i;
			}
		}
		return str[longestWord];
	}

}
