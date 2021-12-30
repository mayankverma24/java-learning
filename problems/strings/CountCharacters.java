package strings;
//How to count the occurrence of a given character in String

public class CountCharacters {
	public static void main(String[] args) {
		String s = "mayank";
		String ch = "a";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			// if (s.charAt(i) == ch) {
			// count++;
			// }
		}
		// System.out.println("Character " + ch + " appears " + count + " times");
		System.out.println("Character " + ch + " occurs " + countCharactersRecursive(s, ch));
	}

	public static int countCharactersRecursive(String s, String ch) {
		if (s.length() == 0) {
			return 0;
		} else if (s.substring(0, 1).equals(ch)) {
			// System.out.println(1 + countCharactersRecursive(s.substring(1), ch));
			return 1 + countCharactersRecursive(s.substring(1), ch);
		}
		// System.out.println(countCharactersRecursive(s.substring(1), ch));
		return countCharactersRecursive(s.substring(1), ch);

	}
}
