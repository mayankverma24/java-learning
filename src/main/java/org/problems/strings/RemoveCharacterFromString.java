package strings;

//Write a method which will remove any given character from a String
public class RemoveCharacterFromString {

	public static void main(String[] args) {
		String s = "abcd";
		char charTobeRemoved = 'b';

		// System.out.println(removeRecursive(s, charTobeRemoved));
		System.out.println(removeReplaceAll(s, charTobeRemoved));
		System.out.println(removeForLoop(s, charTobeRemoved));
	}

	public static String removeRecursive(String s, char ch) {
		int index = s.indexOf(ch);
		if (index == -1) {
			return s;
		}
		return removeRecursive(s.substring(0, index) + s.substring(index + 1, s.length()), ch);
	}

	public static String removeReplaceAll(String s, char ch) {
		String str = s.replaceAll(Character.toString(ch), "");
		return str;
	}

	public static StringBuilder removeForLoop(String s, char ch) {
		StringBuilder sb = new StringBuilder();
		for (char c : s.toCharArray()) {
			if (c != ch) {
				sb.append(c);
			}
		}
		return sb;
	}
}
