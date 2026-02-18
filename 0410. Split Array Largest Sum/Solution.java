class Solution {
    public int splitArray(int[] nums, int k) {
        int left = Integer.MIN_VALUE;
        int right = 0;
        for(int i : nums){
            left = Math.max(left,i);
            right+=i;
        }

        while(left<=right){
            int mid = left + (right-left)/2;
            int curr = minSubSum(nums,mid);

            if(curr<=k){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }

    private int minSubSum(int[] nums,int d){
        int count = 1;
        int curr = 0;
        for(int i=0;i<nums.length;i++){
            if(curr+nums[i]<=d){
                curr += nums[i];
            }
            else{
                count++;
                curr = nums[i];
            }
        }
        return count;
    }
}