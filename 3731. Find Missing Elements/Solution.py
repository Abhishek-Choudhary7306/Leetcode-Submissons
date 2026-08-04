class Solution(object):
    def findMissingElements(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        minE = min(nums)
        maxE = max(nums)

        res = []

        for i in range(minE,maxE+1):
            if i not in nums:
                res.append(i)

        return res