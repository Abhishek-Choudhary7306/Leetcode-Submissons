// //brute force
// class Solution {
//     public int singleNonDuplicate(int[] nums) {
//         if(nums.length==1){
//             return nums[0];
//         }
//         for(int i=0;i<nums.length;i++){
//             if(i==0){
//                 if(nums[i]!=nums[i+1])return nums[i];
//             }

//             if(i==nums.length-1){
//                 if(nums[i]!=nums[i-1])return nums[i];
//             }

//             if(i!=0 && i!=nums.length-1){
//                 if(nums[i]!=nums[i-1] && nums[i]!=nums[i+1])return nums[i];
//             }
//         }
//         return -1;
//     }
// }

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if(n==1)return nums[0];
        if(nums[0]!=nums[1])return nums[0];
        if(nums[n-1]!=nums[n-2])return nums[n-1];
        int l = 1;
        int r = n-2;

        while(l<=r){
            int m = l+(r-l)/2;

            if(nums[m]!=nums[m-1] && nums[m]!=nums[m+1]){
                return nums[m];
            }
            //we have crossed the unique element
            if((m%2==0 && nums[m]!=nums[m+1])||(m%2!=0 && nums[m]!=nums[m-1])){
                r = m-1;
            }
            else{
                l = m+1;
            }
        }
        return -1;
    }
}