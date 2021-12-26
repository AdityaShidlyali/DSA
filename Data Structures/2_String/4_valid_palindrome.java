// https://leetcode.com/problems/valid-palindrome/

class Solution {

	public boolean isPalindrome(String s) {

		String convertedString = Solution.getString(s);
		convertedString = convertedString.toLowerCase();

		int i = 0, j = convertedString.length() - 1;
		int flag = 0;
		while (i <= j) {

			if (convertedString.charAt(i) != convertedString.charAt(j)) {
				flag = 0;
				break;
			} else {
				flag = 1;
			}

			i++;
			j--;
		}

		if (flag == 1) {
			return true;
		} else if (convertedString.length() == 0) {
			return true;
		} else {
			return false;
		}
	}

	private static String getString(String s) {
		String convertedStringAnswer = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				convertedStringAnswer = convertedStringAnswer + s.charAt(i);
			} else if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
				convertedStringAnswer = convertedStringAnswer + s.charAt(i);
			} else if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
				convertedStringAnswer = convertedStringAnswer + s.charAt(i);
			}
		}
		return convertedStringAnswer;
	}
}