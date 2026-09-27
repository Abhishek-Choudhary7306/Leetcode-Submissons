//O(n2) bruteforce solution
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;

        for(int i = 0;i<nums.length;i++){
            int j = i;
            int prod = 1;

            while(prod < k && j<nums.length){
                prod *= nums[j];
                if(prod<k){
                    count++;
                }
                j++;
            }
        }

        return count;
    }
}