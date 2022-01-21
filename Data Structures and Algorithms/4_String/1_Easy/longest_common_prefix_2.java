// https://leetcode.com/problems/longest-common-prefix/

class Solution {
	public String longestCommonPrefix(String[] strs) {
		String prefix = strs[0];

		for (int i = 1; i < strs.length; i++) {
			prefix = longestCommonPrefixUtil(prefix, strs[i]);
		}

		return prefix;
	}

	public static String longestCommonPrefixUtil(String str1, String str2) {
		String answer = "";

		int n1 = str1.length();
		int n2 = str2.length();

		for (int i = 0, j = 0; i < n1 && j < n2; i++, j++) {
			if (str1.charAt(i) != str2.charAt(j)) {
				break;
			}
			answer += str1.charAt(i);
		}

		return answer;
	}
}