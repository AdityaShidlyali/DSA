public class Test {

	static int sum = 0;

	public static void main(String args[]) {
		System.out.println(getSum(2336));
	}

	private static int getSum(int n) {
		if (n == 0) {
			return 0;
		}

		return getSum(n / 10) + n % 10;
	}
}