class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        l = 0
        r = len(nums)-1
        i = 0

        while(i<=r):
            if(nums[i]==0):
                temp = nums[i]
                nums[i] = nums[l]
                nums[l] = temp
                i+=1
                l+=1

            elif(nums[i]==2):
                temp = nums[i]
                nums[i] = nums[r]
                nums[r] = temp
                r-=1

            else:
                i+=1
