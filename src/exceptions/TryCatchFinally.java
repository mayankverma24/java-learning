package exceptions;

public class TryCatchFinally {

	public static void main(String args[]) {
		int a = 100;
		try {
			int[] array = { 100 };
			System.out.println("Error in try catch" + array[9]);

		} catch (Exception e) {
			System.out.println("Something went wrong and the error is " + e);
		} finally {
			System.out.println("The 'try catch' is finished.");
		}
		if (a < 180) {
			throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		} else {
			System.out.println("Access granted - You are old enough!");
		}
	}
}