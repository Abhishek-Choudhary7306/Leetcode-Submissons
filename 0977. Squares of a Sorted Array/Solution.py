class Solution(object):
    def sortedSquares(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        res = [0] * len(nums)

        i = 0
        j = len(nums)-1
        k = len(nums)-1


        while(k>=0):
            left = nums[i]*nums[i]
            right = nums[j]*nums[j]

            if left>=right:
                res[k] = left
                i+=1
                k-=1
            else:
                res[k] = right
                j-=1
                k-=1

        return res

