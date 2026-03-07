class Solution(object):
    def beautySum(self, s):
        """
        :type s: str
        :rtype: int
        """
        sum = 0

        for i in range(len(s)):
            map = {}
            for j in range(i,len(s)):
                map[s[j]] = map.get(s[j],0)+1

                maxf = max(map.values())
                minf = min(map.values())

                sum+=maxf-minf

        return sum


        