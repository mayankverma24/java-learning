package javaBasics;

public class OperatorChallenge {

	public static void main(String[] args) {
		double firstVar = 20.00d;
		double secondVar = 80.00d;
		double result = (firstVar + secondVar) * 100.00;
		System.out.println(result);
		double remainder = result % 40.00d;
		System.out.println(remainder);
		boolean isRemainder = (remainder == 0) ? true : false;
		if (isRemainder) {
			System.out.println(isRemainder);
		} else if (!isRemainder) {
			System.out.println("Got some remainder");
		}

	}
}
