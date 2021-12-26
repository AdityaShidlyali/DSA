// https://leetcode.com/problems/valid-palindrome/

class Solution {

	public boolean isPalindrome(String s) {

		int flag = 0;
		s = s.toLowerCase();

		String convertedString = "";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				convertedString = convertedString + s.charAt(i);
			} else if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
				convertedString = convertedString + s.charAt(i);
			} else if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
				convertedString = convertedString + s.charAt(i);
			}
		}

		int i = 0, j = convertedString.length() - 1;
		while (i <= j) {
			if (convertedString.charAt(i) == convertedString.charAt(j)) {
				flag = 1;
			} else {
				flag = 0;
				break;
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
}