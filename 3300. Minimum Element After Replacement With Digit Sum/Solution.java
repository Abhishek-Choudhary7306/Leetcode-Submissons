class Solution {
    public int minElement(int[] nums) {
        int res = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            nums[i] = digitSum(nums[i]);
            if(nums[i]<res){
                res = nums[i];
            }
        }

        return res;
    }
    private int digitSum(int n){
        int sum = 0;
        while(n!=0){
            sum += n%10;
            n/=10;
        }

        return sum;
    }
}