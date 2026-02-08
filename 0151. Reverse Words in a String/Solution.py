class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        new = s.split()
        res = []

        for i in range(len(new)-1,-1,-1):
            res.append(new[i])

        return " ".join(res)
        