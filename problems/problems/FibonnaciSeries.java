package problems;

import java.util.Scanner;

public class FibonnaciSeries {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner read = new Scanner(System.in);
		int num = read.nextInt();
		// fibLoop(num);
		System.out.println("Fibonnaci series is " + fibRecursion(num));
		read.close();
	}

	public static int fibRecursion(int num) {
		// num = 1;
		if (num ==0) {
			return 0;
			} else if (num == 1 || num == 2) {
			return 1;
		} else {
			return fibRecursion(num - 1) + fibRecursion(num - 2);
		}
		//return fibRecursion(num - 1) + fibRecursion(num - 2);
		//return fibRecursion(num);

	}

	public static void fibLoop(int num) {
		int a = 0, b = 0, c = 1;
		for (int i = 0; i <= num; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.print(a + " "); // if you want to print on the same line, use

		}
	}
}
