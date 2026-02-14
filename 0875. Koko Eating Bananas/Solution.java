//brute force slower
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i=0;i<piles.length;i++){
            max = Math.max(piles[i],max);
        }

        for(int i=1;i<=max;i++){
            if(getTime(piles,i)<=h)return i;
        }
        return -1;
    }
    private int getTime(int[] piles , int k){
        int total = 0;
        for(int i=0;i<piles.length;i++){
            total += Math.ceil((float)piles[i]/k);
        }

        return total;
    }
}