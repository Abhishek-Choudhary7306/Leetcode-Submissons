class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int right = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            right = Math.max(right,nums[i]);
        }

        int ans = right;

        int left = 1;

        while(left<=right){
            int mid = left + (right-left)/2;

            if(isPossible(nums,mid,threshold)){
                ans = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return ans;
    }
    private boolean isPossible(int[] nums,int d,int t){
        int total = 0;
        for(int i=0;i<nums.length;i++){
            int ceil = (nums[i]+d-1)/d;
            total += ceil;
        }

        return total<=t;
    }
}