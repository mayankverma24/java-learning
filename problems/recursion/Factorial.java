package recursion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		//System.out.println("Enter a number: ");
		//Scanner read = new Scanner(System.in);
		//int num = read.nextInt();
		System.out.println("Factorial is " + fac(5));
		//read.close();
	}

	public static int fac(int num) {
		if (num <= 1) {
			return 1;
		} else {
			return num * fac(num - 1);
		}
	}
}
