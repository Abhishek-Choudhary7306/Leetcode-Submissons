//Better Solution O(n)

class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] suff = new int[nums.length];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = nums.length-1;i>=0;i--){
            min = Math.min(min,nums[i]);
            suff[i] = min;
        }

        for(int i=0;i<nums.length;i++){
            max = Math.max(nums[i],max);

            int score = max - suff[i];

            if(score<=k){
                return i;
            }
        }

        return -1;
    }
}

//BruteForce Soluiton O(n2)

// class Solution {
//     public int firstStableIndex(int[] nums, int k) {
//         int max = nums[0];

//         for(int i=0;i<nums.length;i++){
//             max = Math.max(nums[i],max);
//             int min = Integer.MAX_VALUE;
//             for(int j=i;j<nums.length;j++){
//                 min = Math.min(min,nums[j]);
//             }

//             int score = max - min;
//             if(score <= k){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }