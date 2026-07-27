class Solution {
    public int divide(int dividend, int divisor) {

        // Handle overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine the sign of the answer
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Convert to positive long values
        long d = Math.abs((long) dividend);
        long n = Math.abs((long) divisor);

        long quotient = 0;

        while (d >= n) {

            long temp = n;
            long multiple = 1;

            // Find the largest double of divisor that fits
            while ((temp << 1) <= d) {
                temp <<= 1;
                multiple <<= 1;
            }

            d -= temp;
            quotient += multiple;
        }

        if (negative) {
            quotient = -quotient;
        }

        return (int) quotient;
    }
}