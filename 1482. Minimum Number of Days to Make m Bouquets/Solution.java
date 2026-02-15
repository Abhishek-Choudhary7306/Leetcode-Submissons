class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int day : bloomDay) {
            if (day < min) min = day;
            if (day > max) max = day;
        }

        int left = min;
        int right = max;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isPossible(bloomDay, mid, m, k)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    private boolean isPossible(int[] bloomDay, int d, int m, int k) {
        int p = 0;
        int count = 0;
        for (int day : bloomDay) {
            if (day <= d) {
                count++;
                if (count == k) {
                    p++;
                    count = 0;
                    if (p >= m) return true;
                }
            } else {
                count = 0;
            }
        }
        return p >= m;
    }
}