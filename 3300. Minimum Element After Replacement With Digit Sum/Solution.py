class Solution(object):
    def minElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        res = float('inf')
        for i in range(len(nums)):
            res = min(res,self.digitSum(nums[i]))

        return res


    def digitSum(self,num):
        sum = 0
        while num:
            sum+=num%10
            num = num//10

        return sum
        