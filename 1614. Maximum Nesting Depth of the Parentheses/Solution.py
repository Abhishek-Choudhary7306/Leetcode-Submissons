class Solution(object):
    def maxDepth(self, s):
        """
        :type s: str
        :rtype: int
        """
        d = 0
        res = 0

        for i in s:
            if i=='(':
                d+=1
            if i==')':
                d-=1

            res = max(d,res)

        return res
        