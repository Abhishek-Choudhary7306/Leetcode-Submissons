class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        if(n1>n2) return findMedianSortedArrays(nums2,nums1);

        int left = 0;
        int right = n1;
        int req = (n1+n2+1)/2;

        while(left<=right){
            int mid1 = left + (right-left)/2;
            int mid2 = req - mid1;

            int l1 = Integer.MIN_VALUE;
            int l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE;
            int r2 = Integer.MAX_VALUE;

            if(mid1<n1) r1 = nums1[mid1];
            if(mid2<n2) r2 = nums2[mid2];

            if(mid1-1>=0)l1 = nums1[mid1-1];
            if(mid2-1>=0)l2 = nums2[mid2-1];

            if(l1<=r2 && l2<=r1){
                if((n1+n2)%2==1) return Math.max(l1,l2);
                return (double)((Math.max(l1,l2)) + Math.min(r1,r2))/2.0;
            }
            else if(l1>r2) right = mid1-1;
            else left = mid1+1;
        }
        return -1;
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
