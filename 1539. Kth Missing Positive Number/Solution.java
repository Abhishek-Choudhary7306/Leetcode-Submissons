//brute force

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i = 1;
        int count = 0;
        int j = 0;
        
        while(true){
            if(j<arr.length && arr[j]==i){
                i++;
                j++;
            }
            else{
                count++;
                if(count==k){
                    return i;
                }
                i++;
            }
        }
    }
}