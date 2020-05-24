package arrays;

public class SingleDimensionArray {

	public static void main(String[] args) {
		SingleDimensionArray sda = new SingleDimensionArray(10);
		// traverseArray travArray = new traverseArray();
		sda.traverseArray();
		sda.insert(2, 23);
		sda.accessCell(2);
		sda.searchValue(243);
		sda.deleteValueFromTheCell(2);
		sda.traverseArray();
	}

	int arr[] = null;

	// Constructor
	public SingleDimensionArray(int sizeOfArray) {
		arr = new int[sizeOfArray];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}

	// Print the array
	public void traverseArray() {
		try {
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		} catch (Exception e) {
			System.out.println("Array no longer exists !");
		}
	}

	// Insert value in the array
	public void insert(int position, int value) {
		try {
			if (arr[position] == Integer.MIN_VALUE) {
				arr[position] = value;
				System.out.println("Value " + value + " is inserted at position " + position);
			} else {
				System.out.println("This cell is already occupied!");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access array!");
		}
	}

	// Access a particular element of an array
	public void accessCell(int cell) {
		try {
			System.out.println("Value at cell " + cell + " is " + arr[cell]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access array!");
		}
	}

	// Search for an element in the given Array
	public void searchValue(int value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				System.out.println("Value " + value + " is at position " + i);
			}
		}
		System.out.println("Value " + value + " is not found!");
	}

	// Delete value from given cell
	public void deleteValueFromTheCell(int cell) {
		try {
			arr[cell] = Integer.MIN_VALUE;
			System.out.println("Value is deleted from cell " + cell);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Cell #" + cell + " is not in the Array");
		}
	}

	// Delete an entire Array
	public void deleteArray() {
		arr = null;
		System.out.println("Array is deleted!");
	}
}
