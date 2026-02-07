class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
                if (count > 1) {
                    return false;
                }
            }
        }
        return true;
    }
}


//another solution 
// class Solution {
//     public boolean check(int[] nums) {
//         int n = nums.length;

//         int minIndex = 0;
//         for (int i = 1; i < n; i++) {
//             if (nums[i] < nums[minIndex]) {
//                 minIndex = i;
//             }
//         }

//         // check if array is sorted from minIndex in circular way
//         for (int i = 0; i < n - 1; i++) {
//             int curr = nums[(minIndex + i) % n];
//             int next = nums[(minIndex + i + 1) % n];
//             if (curr > next) {
//                 return false;
//             }
//         }

//         return true;
//     }
// }
