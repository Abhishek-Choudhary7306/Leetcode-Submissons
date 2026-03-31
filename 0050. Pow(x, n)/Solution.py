#better iterative solution  

class Solution(object):
    def myPow(self, x, n):
        """
        :type x: float
        :type n: int
        :rtype: float
        """

        N = n
        res = 1

        if(N<0):
            N = -N
            x = 1/x

        while N>0:
            if(N%2==1):
                res = res*x
                N-=1

            else:
                x = x*x
                N=N/2
        
        return res
        
#using recursion

# class Solution(object):
#     def myPow(self, x, n):
#         """
#         :type x: float
#         :type n: int
#         :rtype: float
#         """

#         N = n 
#         if N<0:
#             N = -N
#             x = 1/x

#         return self.power(x,N)



#     def power(self,x,n):
#         if n==0:
#             return 1

#         half = self.power(x,n//2)

#         if n%2:
#             return x * half * half
#         else:
#             return half*half

        

        

        

# bruteforce may cause TLE

# class Solution(object):
#     def myPow(self, x, n):
#         """
#         :type x: float
#         :type n: int
#         :rtype: float
#         """
#         sign = -1 if (n<0) else 1

#         i = 0
#         N = abs(n)
#         res = 1

#         while i<N:
#             res*=x
#             i+=1

#         return (1/res) if (sign<0) else res