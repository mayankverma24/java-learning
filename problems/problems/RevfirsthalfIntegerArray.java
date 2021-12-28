package problems;

public class RevfirsthalfIntegerArray {

	public static void main(String[] args) {

		int[] arr = { 11, 54, 23, 76, 45, 22, 54, 34, 89, 99 };

		int halfArrLen = (arr.length) / 2;
		for (int i = halfArrLen - 1; i >= 0; i--) {
			System.out.println(arr[i]);

		}
		for (int i = halfArrLen; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
	}
}