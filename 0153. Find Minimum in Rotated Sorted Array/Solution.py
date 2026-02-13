class Solution(object):
    def findMin(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        ans = float('inf')

        left = 0
        right = len(nums)-1

        while left<=right:
            mid = left+(right-left)//2

            if(nums[left]<=nums[right]):
                return min(ans,nums[left])

            if(nums[left]<=nums[mid]):
                ans = min(ans,nums[left])
                left = mid+1
            else:
                ans = min(ans,nums[mid])
                right = mid-1

        return ans