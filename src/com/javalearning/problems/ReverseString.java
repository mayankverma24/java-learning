package com.javalearning.problems;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		using_for_loop();
		// using_StringBuilder();
		// using_StringBuffer();
	}

	public static void using_for_loop() {
		System.out.println("Enter string to reverse:");
		Scanner read = new Scanner(System.in);

		String inputStr = read.nextLine();
		String reverse = "";
		for (int i = inputStr.length() - 1; i >= 0; i--) {
			reverse = reverse + inputStr.charAt(i);
		}

		System.out.println("Reversed string is: " + reverse);
		read.close();
	}

	public static void using_StringBuilder() {
		System.out.println("Enter string to reverse:");
		Scanner read = new Scanner(System.in);

		String inputStr = read.nextLine();
		StringBuilder builder = new StringBuilder(inputStr);
		builder.reverse();

		System.out.println("Reversed string is: " + builder);
		read.close();
	}

	public static void using_StringBuffer() {
		System.out.println("Enter string to reverse:");
		Scanner read = new Scanner(System.in);

		String inputStr = read.nextLine();
		StringBuffer buffer = new StringBuffer(inputStr);
		buffer.reverse();

		System.out.println("Reversed string is: " + buffer);
		read.close();
	}
}