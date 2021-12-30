package recursion;

import java.util.Scanner;

public class ReverseIntegers {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner read = new Scanner(System.in);
		int num = read.nextInt();
		read.close();
		System.out.println(Reverse_Integer(num));
	}

	public static int Reverse_Integer(int num) {
		int reversed = 0;

		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num = num / 10;
		}
		return reversed;

	}

}