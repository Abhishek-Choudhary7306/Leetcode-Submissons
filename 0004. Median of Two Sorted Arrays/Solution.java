class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int n = nums1.length;
        int m = nums2.length;
        int low = 0, high = n;

        while (low <= high) {
            int cut1 = (low + high) / 2;
            int cut2 = (n + m + 1) / 2 - cut1;

            int l1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
            int r1 = (cut1 == n) ? Integer.MAX_VALUE : nums1[cut1];

            int l2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];
            int r2 = (cut2 == m) ? Integer.MAX_VALUE : nums2[cut2];

            if (l1 <= r2 && l2 <= r1) {
                if ((n + m) % 2 == 0) {
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                } else {
                    return Math.max(l1, l2);
                }
            }
            else if (l1 > r2) {
                high = cut1 - 1;
            }
            else {
                low = cut1 + 1;
            }
        }
        return 0.0; 
    }
}

//brute force solution 
// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int n1 = nums1.length;
//         int n2 = nums2.length;

//         int[] nums3 = new int[n1+n2];
//         int i=0,j=0,k=0;

//         while(i<n1 && j<n2){
//             if(nums1[i]<nums2[j]){
//                 nums3[k++] = nums1[i++];
//             }
//             else{
//                 nums3[k++] = nums2[j++];
//             }
//         }
//         while(i<n1){
//             nums3[k++] = nums1[i++];
//         }
//         while(j<n2){
//             nums3[k++] = nums2[j++];
//         }

//         int n = nums3.length;
//         if(n==1)return nums3[0];

//         if(n%2==0){
//             return (float)(nums3[n/2-1]+nums3[n/2])/2;
//         }
//         else{
//             return nums3[n/2];
//         }
//     }
// }
