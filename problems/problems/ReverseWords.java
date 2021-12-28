package problems;

import java.util.Scanner;

// Reversing words in a string
public class ReverseWords {

	public static void main(String[] args) {
		Reverse_Words();
	}

	public static void Reverse_Words() {
		System.out.println("Enter string to reverse:");
		Scanner read = new Scanner(System.in);

		String inputStr = read.nextLine();
		String[] strArray = inputStr.split("[^A-Za-z0-9]");

		String reversedWord = "";
		String reversedString = "";
		for (int i = 0; i < strArray.length; i++) {
			for (int j = strArray[i].length() - 1; j >= 0; j--) {
				reversedWord += strArray[i].charAt(j);
			}
			reversedString += reversedWord + " ";
			reversedWord = "";
		}
		System.out.println("Reversed string is: " + reversedString);
		read.close();
	}
}
