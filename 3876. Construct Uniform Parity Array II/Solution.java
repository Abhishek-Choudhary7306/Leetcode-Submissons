//best Solution

class Solution {
    public boolean uniformArray(int[] nums1) {

        //find min Value 
        int min = Integer.MAX_VALUE;
        for(int num:nums1){
            min = Math.min(min,num);
        }

        //if min value is odd the ans is always True
        if (min%2!=0){
            return true;
        }


        //if min value is even we need to check all the elements should be even 
        for(int num : nums1){
            if(num%2!=0){
                return false;
            }
        }
        
        return true;
    }
}