package problems;

import java.util.Scanner;

public class NumberSwap {
	public static void main(String args[]) {
		System.out.println("Enter numbers to be swapped");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		//int x = 50;
		//int y = 60;
		System.out.println("Numbers before swapping");
		System.out.println(" number x is " + x);
		System.out.println(" number y is " + y);
// Swapping numbers
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("Numbers after swapping");
		System.out.println(" number x is " + x);
		System.out.println(" number y is " + y);
		s.close();
	}
}