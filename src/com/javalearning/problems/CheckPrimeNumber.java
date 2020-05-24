package com.javalearning.problems;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		boolean flag = false;

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println(n + " is Prime");
		} else {
			System.out.println(n + " is not Prime");
		}
		read.close();
	}
}