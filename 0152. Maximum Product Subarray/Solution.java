//Optimal Soluiton 

class Solution {
    public int maxProduct(int[] nums) {
        int prefix = 1;
        int suffix = 1;
        int res = Integer.MIN_VALUE;
        int n = nums.length;

        for(int i=0;i<n;i++){
            if(prefix == 0)prefix = 1;
            if(suffix == 0)suffix = 1;

            prefix *= nums[i];
            suffix *= nums[n-i-1];

            res = Math.max(res,Math.max(prefix,suffix));
        }

        return res;

    }
}


// brute force Solution 

// class Solution {
//     public int maxProduct(int[] nums) {
//         int prod = nums[0];

//         for(int i=0;i<nums.length;i++){
//             int subProd = 1;
//             for(int j=i;j<nums.length;j++){
//                 subProd = subProd*nums[j];
//                 prod = Math.max(subProd,prod);
//             }   
//         }

//         return prod;
//     }
// }