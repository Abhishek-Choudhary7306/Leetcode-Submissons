class Solution {
    public int minTime(int[] arr, int k) {
        // code here
        if(k>arr.length){
            return -1;
        }
        int left = Integer.MIN_VALUE;
        int right = 0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>left)left = arr[i];
            right+=arr[i];
        }
        
        while(left<=right){
            int mid = left + (right-left)/2;
            int painters = countPainters(arr,mid);
            
            if(painters>k){
                left = mid+1;
            }
            else{
                right = mid-1; 
            }
        }
        return left;
    }
    
    public int countPainters(int[] arr,int board){
        int painters = 1;
        int boards = 0;
        
        for(int i=0;i<arr.length;i++){
            if((arr[i]+boards)<=board){
               boards = arr[i]+boards; 
            }
            else{
                painters +=1;
                boards = arr[i];
            }
        }
        return painters;
    }
}
