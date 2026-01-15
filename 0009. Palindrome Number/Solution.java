class Solution {
    public boolean isPalindrome(int x) {
        int res = 0;
        int n1 = x;
        while(n1>0){
            int d = n1%10;
            res = 10*res + d;
            n1/=10;
        }

        return res==x;
    }
}