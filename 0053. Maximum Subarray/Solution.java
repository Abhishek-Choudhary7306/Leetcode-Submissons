class Solution {
    public int maxSubArray(int[] nums) {
        int csum = nums[0];
        int msum = nums[0];

        for (int i=1;i<nums.length;i++){
            if((csum+nums[i]>nums[i])){
                csum = csum+nums[i];
            }
            else{
                csum = nums[i];
            }

            if(csum>msum){
                msum = csum;
            }
        }

        return msum;
    }
}