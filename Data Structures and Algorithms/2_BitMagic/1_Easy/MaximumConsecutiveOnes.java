import java.util.*;

class Solution {

	public static int maxConsecutiveOnes(int n) {
		int currentMax = 0, actualMax = 0;
		while (n > 0) {

			if ((n & 1) == 1) {
				currentMax++;
			} else {
				currentMax = 0;
			}

			actualMax = Math.max(currentMax, actualMax);

			n = n >> 1;
		}

		return actualMax;
	}

	public static void main(String[] args) {
		System.out.println(maxConsecutiveOnes(222));
	}
}