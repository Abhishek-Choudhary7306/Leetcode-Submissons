class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];

        int i = 0;
        int j = nums.length - 1;
        int k = nums.length - 1;

        while(k>=0){
            int left = nums[i]*nums[i];
            int right = nums[j]*nums[j];

            if(left>=right){
                res[k] = left;
                k--;
                i++;
            } else {
                res[k] = right;
                k--;
                j--;
            }
        }

        return res;
    }
}