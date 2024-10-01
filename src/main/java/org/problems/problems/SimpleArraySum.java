package problems;

public class SimpleArraySum {

	static int simpleArraySum(int[] ar) {
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum = ar[i] + sum;
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] newArray = { 1, 2, 3, 4, 10, 11 };
		System.out.println(simpleArraySum(newArray));
		
	}

}
