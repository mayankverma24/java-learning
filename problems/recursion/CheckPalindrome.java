package recursion;

public class CheckPalindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome("kayak"));
	}

	public static boolean isPalindrome(String s) {
		if (s == "") {
			return true;
		} else if (s.substring(0) == s.substring(s.length() - 1)) {
			isPalindrome(s.substring(s.length() - 1));
			return true;
		}
		return false;
	}

}
