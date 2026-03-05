class Solution(object):
    def romanToInt(self, s):

        roman = {'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000}
        res = 0

        for i in range(len(s)):
            curr = roman[s[i]]

            if i < len(s)-1 and curr < roman[s[i+1]]:
                res -= curr
            else:
                res += curr

        return res