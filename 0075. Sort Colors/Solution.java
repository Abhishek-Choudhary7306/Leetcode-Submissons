class Solution {
    public void sortColors(int[] nums) {
        int i=0,l,r,temp;
        l = 0;
        r = nums.length-1;

        while(i<=r){
            if(nums[i]==0){
                temp = nums[i];
                nums[i] = nums[l];
                nums[l] = temp;

                i++;
                l++;
            }
            else if(nums[i]==2){
                temp = nums[i];
                nums[i] = nums[r];
                nums[r] = temp;
                r--;
            }
            else{
                i++;
            }
        }
    }
}