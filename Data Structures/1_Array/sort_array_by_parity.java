// https://leetcode.com/problems/sort-array-by-parity/

class Solution {
    public int[] sortArrayByParity(int[] A) {
        List<Integer> evens = new ArrayList<Integer>();
		List<Integer> odds = new ArrayList<Integer>();

		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0) {
				evens.add(A[i]);
			} else {
				odds.add(A[i]);
			}
		}

		Collections.sort(evens);
		Collections.sort(odds, Collections.reverseOrder());

		int[] ans = new int[evens.size() + odds.size()];
		int i = -1;
		for (int e : evens) {
			ans[++i] = e;
		}

		for (int e : odds) {
			ans[++i] = e;
		}
        
        return ans;
    }
}