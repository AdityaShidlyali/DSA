public class Test {

    // Naive approach
    private static int findOdd(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count % 2 != 0) {
                System.out.println(arr[i] + " ");
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4};
        findOdd(arr, 6);
    }
}
