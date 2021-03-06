class Solution {
    // Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n) {
        int k = 1;
        while (n > 0) {
            if ((n & 1) == 1)
                return k;
            k++;
            n = n >> 1;
        }
        return 0;

    }
}