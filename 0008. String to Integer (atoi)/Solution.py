class Solution(object):
    def myAtoi(self, s):
        """
        :type s: str
        :rtype: int
        """
        i = 0
        res = 0
        sign = 1
        n = len(s)

        INT_MAX = 2**31 - 1
        INT_MIN = -2**31

        while i<n and s[i]==' ':
            i+=1
        
        if i<n and (s[i]=='+' or s[i]=='-'):
            if s[i]=='-':
                sign = -1
            i+=1

        while i<n and s[i].isdigit():
            digit = int(s[i])
            
            if res > (INT_MAX - digit) // 10:
                return INT_MAX if sign == 1 else INT_MIN

            res = res*10 + digit
            i+=1

        return sign*res