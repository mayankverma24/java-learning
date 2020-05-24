package com.javalearning.problems;

public class SimpleArraySum {

	static int simpleArraySum(int[] ar) {
		int temp = 0;
		for (int i = 0; i < ar.length; i++) {
			temp = ar[i] + temp;
		}
		return temp;
	}

	public static void main(String[] args) {
		int[] newArray = { 1, 2, 3, 4, 10, 11 };
		System.out.println(simpleArraySum(newArray));
	}

}
