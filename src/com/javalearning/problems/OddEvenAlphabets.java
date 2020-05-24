package com.javalearning.problems;

import java.util.Scanner;

public class OddEvenAlphabets {

	public static void main(String[] args) {
		System.out.println("Enter string to check:");
		Scanner scan = new Scanner(System.in);
		String T = scan.nextLine();
		String even = "";
		String odd = "";
		for (int j = 0; j < T.length(); j++) {
			if (j % 2 == 0) {
				even += T.charAt(j);
			} else {
				odd += T.charAt(j);
			}
		}
		System.out.println(even + " " + odd);

		scan.close();
	}
}