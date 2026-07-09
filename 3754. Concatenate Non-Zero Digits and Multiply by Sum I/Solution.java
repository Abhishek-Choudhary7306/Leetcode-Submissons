class Solution {
    public long sumAndMultiply(int n) {
        if (n == 0) return 0;

        int sum = 0;
        long concat = 0;
        long place = 1;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;

            if (digit != 0) {
                concat = digit * place + concat;
                place *= 10;
            }

            n /= 10;
        }

        return concat * sum;
    }
}