#solution using Enumeration

class Solution(object):
    def findMissingElements(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        nums = sorted(nums)

        res = []

        for i in range(0,len(nums)-1):
            for j in range(nums[i]+1,nums[i+1]):
                res.append(j)

        return res



#one solution 

# class Solution(object):
#     def findMissingElements(self, nums):
#         """
#         :type nums: List[int]
#         :rtype: List[int]
#         """
#         minE = min(nums)
#         maxE = max(nums)

#         res = []

#         for i in range(minE,maxE+1):
#             if i not in nums:
#                 res.append(i)

#         return res