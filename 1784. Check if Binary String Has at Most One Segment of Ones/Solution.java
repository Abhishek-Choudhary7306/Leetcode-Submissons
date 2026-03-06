class Solution {
    public boolean checkOnesSegment(String s) {
        int n = s.length();

        if(n==0 || n==1 || n==2){
            return true;
        }
        int i = 0;

        while(i<n && s.charAt(i)=='0'){
            i++;
        }

        while(i<n && s.charAt(i)=='1'){
            i++;
        }

        while(i<n && s.charAt(i)=='0'){
            i++;
        }

        if(i<n && s.charAt(i)=='1'){
            return false;
        }

        return true;
    }
}