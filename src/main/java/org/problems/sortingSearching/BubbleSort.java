package sortingSearching;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
		int n = arr.length; //n=7
		for (int i = 0; i < n - 1; i++) { //outer loop will run 7 times
			for (int j = 0; j < n - 1; j++) { //inner loop will run 7 times
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
