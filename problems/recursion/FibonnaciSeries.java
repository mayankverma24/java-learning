package recursion;

import java.util.Scanner;

public class FibonnaciSeries {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner read = new Scanner(System.in);
		int num = read.nextInt();
		System.out.println("Fibonnaci series is " + fib(num));
		read.close();
	}

	public static int fib(int num) {
		if (num == 0) {
			return 0;
		} else if (num == 1 || num == 2) {
			return 1;
		} else {
			return fib(num - 1) + fib(num - 2);
		}
	}

}
