
/*class Solution {
    public int addDigits(int num) {
        int m = num;
        long sum = sumCalculation(m);

        while (sum > 9) {
            sum = sumCalculation((int) sum);
        }

        return (int) sum;
    }

    public long sumCalculation(int n) {
        long sum = 0;
        int m = n;

        while (m > 0) {
            sum += m % 10;
            m = m / 10;
        }

        return sum;
    }
}/* */

/*class Solution {
    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Check for overflow before updating rev
            if (rev > Integer.MAX_VALUE / 10 ||
                (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            if (rev < Integer.MIN_VALUE / 10 ||
                (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            rev = rev * 10 + digit;
        }

        return rev;
    }
}/* */