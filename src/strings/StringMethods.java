package strings;

import java.util.Scanner;

//String methods
public class StringMethods {

	public static void main(String... args) {
		String s = "Mayank";
		System.out.println(s.isEmpty());
		System.out.println(s.length());
		
		//length variable is applicable for arrays only but not for String objects
		int[] x = { 10, 20, 30, 40 };
		System.out.println(x.length);
		
		System.out.println(s.replace("a", "123"));
		System.out.println(s.substring(2));
		System.out.println(s.indexOf("b"));
		System.out.println(s.lastIndexOf("a"));
		System.out.println(s.toUpperCase());
		
		System.out.println(s.equalsIgnoreCase("mafyank"));
		
		//trim() method
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println(name.trim());
		sc.close();
	}
}
