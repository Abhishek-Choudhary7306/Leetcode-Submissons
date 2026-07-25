class Solution {
    public int maxProduct(int n) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MAX_VALUE;

        int num = n;

        while(num>0){
            int d = num%10;

            if(d>max1){
                max2 = max1;
                max1 = d;
            }
            else if(d==max1){
                max2 = d;
            }
            else if(d>max2){
                max2 = d;
            }
            num = num/10;
        }

        return max1*max2;
    }
}