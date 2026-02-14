//Better Solution 

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int i = 0; i < piles.length; i++) {
            max = Math.max(piles[i], max);
        }

        int l = 1;
        int r = max;
        int ans = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            long currentTime = getTime(piles, mid);

            if (currentTime <= h) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    private long getTime(int[] piles, int k) {
        long total = 0;
        for (int pile : piles) {
            total += (pile + k - 1) / k;
        }
        return total;
    }
}




//brute force slower

// class Solution {
//     public int minEatingSpeed(int[] piles, int h) {
//         int max = 0;
//         for(int i=0;i<piles.length;i++){
//             max = Math.max(piles[i],max);
//         }

//         for(int i=1;i<=max;i++){
//             if(getTime(piles,i)<=h)return i;
//         }
//         return -1;
//     }
//     private int getTime(int[] piles , int k){
//         int total = 0;
//         for(int i=0;i<piles.length;i++){
//             total += Math.ceil((float)piles[i]/k);
//         }

//         return total;
//     }
// }