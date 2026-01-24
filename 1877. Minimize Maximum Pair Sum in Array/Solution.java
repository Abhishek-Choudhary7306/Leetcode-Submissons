class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        
        int i = 0;
        int j = nums.length - 1;
        int maxPairSum = 0;

        while (i < j) {
            int pairSum = nums[i] + nums[j];
            maxPairSum = Math.max(maxPairSum, pairSum);
            i++;
            j--;
        }

        return maxPairSum;
    }
}
