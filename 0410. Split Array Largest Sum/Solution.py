class Solution(object):
    def splitArray(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        left = max(nums)
        right = sum(nums)

        while left<=right:
            mid = left + (right-left)//2
            curr = self.minSubSum(nums,mid)

            if(curr<=k):
                right = mid-1
            else:
                left = mid+1
        return left

    
    def minSubSum(self,nums,d):
        count = 1
        curr = 0

        for i in nums:
            if (curr+i)<=d:
                curr+=i
            else:
                count+=1
                curr=i
        
        return count 
