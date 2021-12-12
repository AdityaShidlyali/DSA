// https://leetcode.com/problems/first-unique-character-in-a-string/submissions/

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String s = input.next();

		Solution sol = new Solution();
		System.out.println(sol.firstUniqChar(s));

		input.close();
	}
}

class Solution {
	public int firstUniqChar(String s) {

		int[] freq = new int[26];

		for (int i = 0; i < s.length(); i++) {
			freq[s.charAt(i) - 97]++;
		}

		for (int i = 0; i < s.length(); i++) {
			if (freq[s.charAt(i) - 97] == 1) {
				return i;
			}
		}

		return -1;
	}
}