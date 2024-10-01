package problems;

import java.util.Scanner;

//Separate alphabets at even and odd index
public class OddEvenAlphabets {

	public static void main(String[] args) {
		System.out.println("Enter string to check:");
		Scanner scan = new Scanner(System.in);
		String T = scan.nextLine();
		String even = "";
		String odd = "";
		for (int j = 0; j < T.length(); j++) {
			if (j % 2 == 0) {
				even += T.charAt(j);
			} else {
				odd += T.charAt(j);
			}
		}
		System.out.println(even + " " + odd);

		scan.close();
	}
}