//bruteforce may cause TLE

// class Solution {
//     public double myPow(double x, int n) {
//         int sign = 1;
//         if(n<0)sign = -1;

//         long n1 = Math.abs(n);
//         int i = 0;
//         double ans = 1;
//         while(i<n1){
//             ans*=x;
//             i++;
//         }

//         return (sign==-1)?(1/ans):ans;
//     }
// }
