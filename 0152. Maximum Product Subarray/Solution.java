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