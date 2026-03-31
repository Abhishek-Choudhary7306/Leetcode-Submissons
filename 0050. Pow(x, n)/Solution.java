//better iterative solution  

class Solution {
    public double myPow(double x, int n) {
        double res = 1;
        long N = n;
        if(n<0){
            x = 1/x;
            N = -N;
        }

        while(N>0){
            if(N%2==1){
                res = res*x;
                N--;
            }
            else {
                x = x*x;
                N = N/2;
            }
        }
        return res;
    }
}

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
