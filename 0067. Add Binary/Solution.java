class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder res = new StringBuilder();
        int total = 0;

        while(i>=0 || j>=0 || carry!=0){
            total = carry;

            if(i>=0){
                total += a.charAt(i) - '0';
                i--;
            }

            if(j>=0){
                total += b.charAt(j) - '0';
                j--;
            }

            res.append(total%2);
            carry = total/2;
        }
        return res.reverse().toString();
    }
}