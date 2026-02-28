class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        check1 = {}
        check2 = {}
        for i in range(len(s)):
            if s[i] not in check1:
                check1[s[i]] = t[i]
                continue

            if check1[s[i]]!=t[i]:
                return False
        for i in range(len(t)):
            if t[i] not in check2:
                check2[t[i]] = s[i]
                continue

            if check2[t[i]]!=s[i]:
                return False
        return True