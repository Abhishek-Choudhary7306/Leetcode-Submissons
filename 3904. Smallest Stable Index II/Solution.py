class Solution(object):
    def firstStableIndex(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """

        suff = [0] * len(nums)

        mini = float('inf')
        maxi = float('-inf')

        for i in range(len(nums)-1,-1,-1):
            mini = min(nums[i],mini)
            suff[i] = mini

        for i in range(len(nums)):
            maxi = max(nums[i],maxi)
            score = maxi - suff[i]

            if score<=k:
                return i
        return -1

        