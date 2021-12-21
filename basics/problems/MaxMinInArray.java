package problems;

public class MaxMinInArray {

	public static void main(String[] args) {

		int[] arr = { 1, 444, 132, 331, 3, 4, 6, 2, 9, 13 };
		int max = arr[0], min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Maximum number is: " + max);
		System.out.println("Minimum number is: " + min);
	}
}