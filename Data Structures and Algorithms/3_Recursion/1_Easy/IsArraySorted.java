class Solution {
	public boolean isSorted(int[] arr, int size) {
		if (size == 1) {
			if (arr[size] > arr[size - 1]) {
				return true;
			} else {
				return false;
			}
		}

		if (arr[size] > arr[size - 1]) {
			return isSorted(arr, size - 1);
		} else {
			return false;
		}
	}
}