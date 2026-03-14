class Solution(object):
    def checkOnesSegment(self, s):
        """
        :type s: str
        :rtype: bool
        """
        n = len(s)

        if n==1 or n==2 or n==0:
            return True

        i = 0 

        while i<n and s[i]=='0':
            i+=1

        while i<n and s[i]=='1':
            i+=1

        while i<n and s[i]=='0':
            i+=1
        
        if i<n and s[i]=='1':
            return False
        
        return True
        
        