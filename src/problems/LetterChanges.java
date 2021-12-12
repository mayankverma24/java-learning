/*Have the function LetterChanges(str) take the str parameter being passed and modify it using the following algorithm.
 * Replace every letter in the string with the letter following it in the alphabet (ie. c becomes d, z becomes a).
 * Then capitalize every vowel in this new string (a, e, i, o, u) and finally return this modified string.
 */
package problems;

import java.util.Scanner;

public class LetterChanges {
	public static String LetterChange(String str) {
		String newString = null;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			//int ascii = ch;
			ch++;
			newString += Character.toString(ch);
		}

		return newString;
	}

	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		Scanner read = new Scanner(System.in);
		System.out.println(LetterChange(read.nextLine()));
		read.close();
	}
}
