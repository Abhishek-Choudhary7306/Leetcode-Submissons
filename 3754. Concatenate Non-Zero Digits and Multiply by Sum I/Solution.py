class Solution(object):
    def sumAndMultiply(self, n):
        """
        :type n: int
        :rtype: int
        """
        num = str(n)
        res = ""
        digitsum = 0

        for i in num:
            digit = int(i)
            digitsum += digit

            if digit!=0:
                res+=i  

        if res=="":
            return 0

        return int(res)*digitsum
