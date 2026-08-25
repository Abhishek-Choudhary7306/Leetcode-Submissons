class Solution(object):
    def maxProduct(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        prefix = 1
        suffix = 1
        res = float('-inf')
        n = len(nums)

        for i in range(len(nums)):
            if(prefix == 0):
                prefix = 1
            if(suffix == 0):
                suffix = 1

            prefix *= nums[i]
            suffix *= nums[n-i-1]

            res = max(res,max(prefix,suffix)) 


        return res
        