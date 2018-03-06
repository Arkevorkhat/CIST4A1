package logic;

public class Palindrome {

	public static String reverse(String in) {
		StringBuffer stor = new StringBuffer(in);
		stor.reverse();
		return stor.toString();
	}

	public static Boolean getIsPalindrome(String input) {
		Boolean palin = null;
		char[] in = input.toCharArray();
		char[] rStorage = reverse(input).toCharArray();
		for (int i = in.length; i > 0; i++) {
			if (in[i] == rStorage[i]) {
				palin = true;
				continue;
			} else {
				System.out.println("This is not a palindrome.");
				palin = false;
				break;
			}
		}
		return palin;
	}

	public static String makePalindrome(int len) {
		StringBuffer stor = new StringBuffer(64);
		for (int i = 0; i < len / 2; i++) {
			stor.appendCodePoint((int) Math.ceil((Math.random() * 26) + 96));
		}
		StringBuffer stor2 = new StringBuffer(reverse(stor.toString()));
		stor2.delete(1, 1);
		stor.append(stor2);
		return stor.toString();
	}
}
