// https://leetcode.com/problems/least-number-of-unique-integers-after-k-removals/

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class LeetCode {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		input.close();
	}
}

class Solution {
	public int findLeastNumOfUniqueInts(int[] nums, int k) {
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		int count = 0;
		int size = 0;

		// Store the occurrence of the values
		for (int i = 0; i < nums.length; i++) {

			// if the key is not already present then add it to the hashmap
			if (m.containsKey(nums[i]) == false) {
				m.put(nums[i], 1);
				size++;
			}

			// if already present increment the count of the element
			else {
				m.put(nums[i], m.get(nums[i]) + 1);
			}
		}

		// start removing the elements from beginning
		for (Entry<Integer, Integer> e : m.entrySet()) {

			// remove if current value is less than or equal to k
			if (e.getKey() <= k) {
				k -= e.getKey();
				count++;
			}
		}

		// else return the remaining elements
		return size - count;
	}
}