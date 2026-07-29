class Solution(object):
    def smallestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """

        if len(s) == 1 :
            return s
        
        freq = {}

        for ch in s:
            if ch in freq:
                freq[ch] += 1
            else:
                freq[ch] = 1

        left = ""
        middle = ""

        for ch in sorted(freq):
            left += ch * (freq[ch]//2)

            if(freq[ch]%2==1):
                middle = ch

        return left + middle + left[::-1]
        
        