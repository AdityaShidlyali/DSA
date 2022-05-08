// https://www.geeksforgeeks.org/position-rightmost-different-bit/
// Time Complexity: O(log2(n))
// Space Complexity: O(1)

public class Test {

    public static int posOfRightMostDiffBit(int m, int n) {
        if (m == n) {
            return -1;
        } else {
            int positionCount = 1;

            int xorOfGivenTwoNumbers = m ^ n;

            while (xorOfGivenTwoNumbers != 0) {
                if ((xorOfGivenTwoNumbers & 1) == 1) {
                    return positionCount;
                }

                xorOfGivenTwoNumbers = xorOfGivenTwoNumbers >> 1;

                ++positionCount;
            }

            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(posOfRightMostDiffBit(6, 2));
    }
}