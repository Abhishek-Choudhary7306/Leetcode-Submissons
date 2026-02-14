class Solution(object):
    def singleNonDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)
        
        if n==1:
            return nums[0]

        if nums[0]!=nums[1]:
            return nums[0]
        if nums[n-1]!=nums[n-2]:
            return nums[n-1]

        l = 1
        r = n-2

        while l<=r:
            m = l+(r-l)//2
            
            if nums[m]!=nums[m+1] and nums[m]!=nums[m-1]:
                return nums[m]

            if((m%2==0 and nums[m]!=nums[m+1]) or (m%2!=0 and nums[m]!=nums[m-1])):
                r = m-1
            else:
                l = m+1

        return -1     

        
        