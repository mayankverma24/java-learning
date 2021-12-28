package problems;

import java.util.Scanner;

public class FibonnaciSeries {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner read = new Scanner(System.in);
		int num = read.nextInt();
		fibonnaci_using_loop(num);
		// System.out.println("Fibonnaci series is " + fibonnaci_using_recursion(num));
		read.close();
	}

	public static int fibonnaci_using_recursion(int num) {
		if (num < 1) {
			// System.out.println("Error");
		} else if (num == 1 || num == 2) {
			return (num - 1);
		} else {
			return fibonnaci_using_recursion(num - 1) + fibonnaci_using_recursion(num - 2);
		}
		return fibonnaci_using_recursion(num - 1) + fibonnaci_using_recursion(num - 2);
	}

	public static void fibonnaci_using_loop(int num) {
		int a = 0, b = 0, c = 1;
		for (int i = 0; i <= num; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.print(a + " "); // if you want to print on the same line, use

		}
	}
}
