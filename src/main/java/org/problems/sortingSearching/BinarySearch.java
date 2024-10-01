package sortingSearching;

public class BinarySearch {

	int binarySearch(int arr[], int n) {

		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;

			// Check if element n is present at mid index
			if (arr[mid] == n)
				return mid;

			// if n is greater ignore left half
			if (arr[mid] < n)
				left = mid + 1;

			// if n is lesser ignore right half
			if (arr[mid] > n)
				right = mid - 1;

		}
		return -1;
	}

	public static void main(String[] args) {
		BinarySearch ob = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 40, };
		//Arrays.sort(arr);
		// int n = arr.length;
		int x = 3;
		int result = ob.binarySearch(arr, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}
}
