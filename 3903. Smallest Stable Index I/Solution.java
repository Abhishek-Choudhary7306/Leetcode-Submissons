//BruteForce Soluiton O(n2)

class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max = nums[0];

        for(int i=0;i<nums.length;i++){
            max = Math.max(nums[i],max);
            int min = Integer.MAX_VALUE;
            for(int j=i;j<nums.length;j++){
                min = Math.min(min,nums[j]);
            }

            int score = max - min;
            if(score <= k){
                return i;
            }
        }
        return -1;
    }
}