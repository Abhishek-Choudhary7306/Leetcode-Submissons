//optimal solution 
class Solution {
    public int findKthPositive(int[] arr, int k) {
        if(arr[0]>k)return k;

        int left = 0;
        int right = arr.length - 1;

        while(left<=right) {
            int mid = left + (right-left)/2;
            int missing = arr[mid] - (mid + 1);

            if(missing < k){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return  k + (right + 1);//here right + 1 == low 
        //so also can return low + k
    }
}


// //brute force

// class Solution {
//     public int findKthPositive(int[] arr, int k) {
//         int i = 1;
//         int count = 0;
//         int j = 0;
        
//         while(true){
//             if(j<arr.length && arr[j]==i){
//                 i++;
//                 j++;
//             }
//             else{
//                 count++;
//                 if(count==k){
//                     return i;
//                 }
//                 i++;
//             }
//         }
//     }
// }

// //another solution 
// class Solution {
//     public int findKthPositive(int[] arr, int k) {
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>k)return k;
//             else{
//                 k++;
//             }
//         }
//         return k;
//     }
// }