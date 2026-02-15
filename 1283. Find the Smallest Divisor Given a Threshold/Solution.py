class Solution(object):
    def smallestDivisor(self, nums, threshold):
        """
        :type nums: List[int]
        :type threshold: int
        :rtype: int
        """
        right = max(nums)
        left = 1
        ans = right

        while left<=right:
            mid = left + (right-left)//2

            if self.isPossible(nums,mid,threshold):
                ans = mid
                right = mid-1
            else:
                left = mid+1
        return ans

    def isPossible(self,nums,d,t):
        total = 0

        for i in nums:
            total += ((i+d-1)/d)

        return total<=t

        