package strings;

public class StringBasics {

	public static void main(String args[]) {

		/*
		 * String newString = "Mayank$:Verma:Bangalore:Manyata";
		 * System.out.println(newString.substring(newString.indexOf("$"))); String[]
		 * splitString = newString.split(":"); for (String x : splitString) {
		 * System.out.println(x); }
		 */
		String s1 = new String("Mayank");
		//String s2 = s1.concat(" software");
		String s2 = new String("Mayank");

		/*
		 * In String class, .equals method is overridden for content comparison. In
		 * String Buffer class, .equals method is not overridden for content comparison,
		 * but for reference comparison. == always meant for reference comparison, it
		 * will be true only when two objects are pointing to the same value.
		 */
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // true
		//System.out.println(s2);

	}

}
