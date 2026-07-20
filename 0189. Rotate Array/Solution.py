class Solution(object):
    def rotate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        k = k%n

        self.reverse(nums,0,n-1)
        self.reverse(nums,0,k-1)
        self.reverse(nums,k,n-1)
        

    def reverse(self,nums,i,j):
        while i<j:
            temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp
            i+=1
            j-=1

        