class Solution(object):
    def largestInteger(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        map = {}

        for num in nums:
            if num in map:
                map[num]+=1
            else:
                map[num] = 1

        n = len(nums)

        if(k==1):
            ans = -1
            for num in nums:
                if(map[num]==1):
                    ans = max(ans,num)

            return ans

        if(k==n):
            return max(-1,max(nums))

        if(k>1 and k<n):
            ans = -1

            if(map[nums[0]]==1):
                ans = max(ans,nums[0])

            if(map[nums[-1]]==1):
                ans = max(ans,nums[-1])

            return ans
        return -1
