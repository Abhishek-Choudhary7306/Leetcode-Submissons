class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s)!=len(t):
            return False

        freq = {}

        for i in s:
            if i not in freq:
                freq[i] = 0
            freq[i]+=1
        
        for i in t:
            if i not in freq:
                return False
            freq[i]-=1

        for key,value in freq.items():
            if value!=0:
                return False
        
        return True
            

