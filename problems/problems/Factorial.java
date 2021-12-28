package problems;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner read = new Scanner(System.in);
		int num = read.nextInt();
		// System.out.println("Factorial is " + factorial_using_loop(num));
		System.out.println("Factorial is " + factorial_using_recursion(num));
		read.close();
	}

	public static int factorial_using_loop(int num) {
		int fac = 1;
		for (int i = 2; i <= num; i++) {
			fac = i * fac;
		}
		return fac;
	}

	public static int factorial_using_recursion(int num) {
		if (num < 1) {
			return 1;
		} else {
			return num * factorial_using_recursion(num - 1);
		}
	}
}
