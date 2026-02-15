class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = Integer.MIN_VALUE;
        int right = 0;

        for(int i=0;i<weights.length;i++){
            left = Math.max(left,weights[i]);
            right+=weights[i];
        }

        int ans = right;

        while(left<=right){
            int mid = left + (right-left)/2;

            if(isPossible(weights,days,mid)){
                ans = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return ans;
    }
    private boolean isPossible(int[] weights,int days,int c){
        int total = 0;
        int daysTaken = 1;
        for(int i : weights){
            if((total+i)>c){
                daysTaken+=1;
                total = i;

                if(daysTaken>days)return false;
            }
            else{
                total += i;
            }  
        }
        return days>=daysTaken;
    }
}