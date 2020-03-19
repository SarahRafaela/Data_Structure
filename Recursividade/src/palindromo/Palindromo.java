package palindromo;

public class Palindromo {

	private static boolean isPalindrome(String s, int left, int right) {
		if (left >= right) {
			return true;
		} else {
			if (s.charAt(left) == s.charAt(right)) {
				return isPalindrome(s, ++left, --right);
			} else {
				return false;
			}
		}
	}

	public static void main(String[] args) {
		String s = "arara";
		System.out.println(isPalindrome(s, 0, s.length() - 1));
	}
}
