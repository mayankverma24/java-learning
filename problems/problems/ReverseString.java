package problems;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		reverse("mayank");
		Reverse_String();
	}

	public static void Reverse_String() {
		System.out.println("Enter string to reverse:");
		Scanner read = new Scanner(System.in);

		String inputStr = read.nextLine();
		String reverse = "";
		for (int i = inputStr.length() - 1; i >= 0; i--) {
			reverse += inputStr.charAt(i);
		}
		System.out.println("Reversed string using for-loop is: " + reverse);

		// Using StringBuilder
		StringBuilder builder = new StringBuilder(inputStr);
		builder.reverse();
		System.out.println("Reversed string using StringBuilder is: " + builder);

		// Using StringBuffer
		StringBuffer buffer = new StringBuffer(inputStr);
		buffer.reverse();
		System.out.println("Reversed string using StringBuffer is: " + buffer);
		read.close();

	}

	// Using recursion
	public static void reverse(String str) {
		if (str.isEmpty()) {
			return;
		} else {
			reverse(str.substring(1));
			System.out.print(str.charAt(0));

		}
	}

}