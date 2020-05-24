package com.javalearning.javabasics;

public class test {

	public static void main(String[] args) {
		// keep this function call here
		int i, k = 1;
		// Scanner s = new Scanner(System.in);
		// System.out.print(s.nextLine());
		for (i = 1; i <= 4; i++) {
			k = i * k;
		}
		System.out.println(k);
		float maxByteNumber = 5.3F;
		System.out.println(maxByteNumber);
		// System.out.println(Integer.MAX_VALUE);
		int score = 10;
		if ((score > 30) || (score < 100)) {
			System.out.println("And condition satisfied!");
		}

		// Assignment operator or Equal to operator
		boolean isCar = false;
		if (!isCar) {
			System.out.println("This is true");
		}

		// Ternary Operator
		isCar = true;
		boolean wasCar = isCar ? true : false;
		if (wasCar) {
			System.out.println("wasCar is true");
		}
	}

}
