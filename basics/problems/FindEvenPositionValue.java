package problems;

public class FindEvenPositionValue {

	public static void main(String[] args) {

		int[] myArray = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < myArray.length; i = i + 2) {
			System.out.println(myArray[i]);
		}
	}

}