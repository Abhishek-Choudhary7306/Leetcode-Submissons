class Solution {
    public int myAtoi(String s) {
        int res = 0;
        int n = s.length();
        int i = 0;
        int sign = 1;

        while(s.charAt(i)==' '){
            i++;
        }

        if(i<n &&(s.charAt(i)=='+' || s.charAt(i)=='-')){
            if(s.charAt(i)=='-'){
                sign = -1;
            }
            i++;
        }

        while(i<n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i)-'0';
            if(res > (Integer.MAX_VALUE - digit) / 10){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = res*10 + digit;
            i++;
        }

        return sign*res;
    }
}

//using recursion

// class Solution {
//     public int myAtoi(String s) {
//         s = s.trim();
//         if (s.isEmpty()) return 0;

//         int sign = 1;
//         int startIdx = 0;

//         if (s.charAt(0) == '-') {
//             sign = -1;
//             startIdx = 1;
//         } else if (s.charAt(0) == '+') {
//             startIdx = 1;
//         }

//         return (int) recHelper(s, startIdx, 0L, sign);
//     }

//     private long recHelper(String s, int index, long currentRes, int sign) {
//         if (index >= s.length() || !Character.isDigit(s.charAt(index))) {
//             return currentRes * sign;
//         }

//         int digit = s.charAt(index) - '0';
//         currentRes = currentRes * 10 + digit;

//         if (sign == 1 && currentRes > Integer.MAX_VALUE) return Integer.MAX_VALUE;
//         if (sign == -1 && (-currentRes) < Integer.MIN_VALUE) return Integer.MIN_VALUE;

//         return recHelper(s, index + 1, currentRes, sign);
//     }
// }