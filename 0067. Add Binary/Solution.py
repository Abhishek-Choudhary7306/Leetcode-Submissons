class Solution(object):
    def addBinary(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        i = len(a)-1
        j = len(b)-1
        res = ""
        carry = 0

        while i>=0 or j>=0 or carry!=0:
            total = carry

            if i>=0:
                total += ord(a[i]) - ord('0')
                i-=1
            if j>=0:
                total += ord(b[j]) - ord('0')
                j-=1

            res = str(total%2) + res
            carry = total//2
        return res
        