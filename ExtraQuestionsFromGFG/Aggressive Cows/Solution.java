class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int right = stalls[stalls.length-1]-stalls[0];
        int left = 1;
        int ans = -1;
        
        while(left<=right){
            int mid = left + (right-left)/2;
            
            if(isPossible(stalls,k,mid)){
                ans = mid;
                left = mid+1;
            }
            else{
                right = mid - 1;
            }
        }
        
        return ans;
    }
    private boolean isPossible(int[] stalls , int k,int d){
        int lastCow = stalls[0];
        int countCows = 1;
        
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-lastCow >= d){
                countCows++;
                lastCow = stalls[i];
            }
            if(countCows>=k)return true;
        }
        
        return false;
    }
}