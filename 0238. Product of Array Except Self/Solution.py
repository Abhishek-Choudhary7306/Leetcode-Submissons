class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """

        prod = 1

        res = [0]*len(nums)

        for i in range(len(nums)):
            res[i] = prod
            prod *= nums[i]

        prod = 1

        for i in range(len(nums)-1,-1,-1):
            res[i] *= prod
            prod *= nums[i]

        return res

        