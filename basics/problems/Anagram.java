package problems;

import java.util.Scanner;

public class Anagram {

	// Complete the makeAnagram function below.
	static int makeAnagram(String a, String b) {
		int x = 0;

		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < b.length(); j++) {
				if (a.charAt(i) == b.charAt(j)) {
					x = x + 1;

				}

			}
		}
		return x;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(makeAnagram(a, b));
		in.close();
	}
}