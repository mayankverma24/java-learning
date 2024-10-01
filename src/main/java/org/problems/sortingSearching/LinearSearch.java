package sortingSearching;

public class LinearSearch {

	public int LinearS(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		LinearSearch ob = new LinearSearch();
		int arr[] = { 22, 33, 4, 10, 40 };
		int x = 4;
		int result = ob.LinearS(arr, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}
}