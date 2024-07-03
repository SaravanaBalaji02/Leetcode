
class Solution {
    public int reverse(int x) {
        int temp = Math.abs(x);
        int rem = 0;
        long rev = 0; // Use long to check overflow later
        while (temp > 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }
        // No need to check x < 0 here
        if (x < 0) {
            rev = -rev;
        }
        return (int) rev;
    }
}
