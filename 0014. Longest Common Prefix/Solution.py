class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        strs.sort()

        str1 = strs[0]
        str2 = strs[len(strs) - 1]
        i=0
        res = ""

        while i<len(str1):
            if i==len(str2) or str1[i]!=str2[i]:
                return res
            res+=str1[i]
            i+=1

        return res
        