package strings;

public class String_Buffer {

	public static void main(String args[]) {

		StringBuffer sb1 = new StringBuffer("Mayank");
		//sb1.append(" software");
		StringBuffer sb2 = new StringBuffer("Mayank");

		System.out.println(sb1 == sb2); // false
		System.out.println(sb1.equals(sb2)); // false
		//System.out.println(sb1);

	}

}
