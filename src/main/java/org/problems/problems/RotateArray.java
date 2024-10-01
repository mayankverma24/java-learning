package problems;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		Rotate(arr, 2, 7);
	}

	public static void Rotate(int[] arr, int d, int n) {

		for (int i = 2; i < n; i++) {
			System.out.println(arr[i]);
		}
		for (int i = 0; i < d; i++) {
			System.out.println(arr[i]);
		}
	}
}