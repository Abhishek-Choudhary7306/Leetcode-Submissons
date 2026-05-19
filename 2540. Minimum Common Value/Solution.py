# #BruteForce Solution
# class Solution(object):
#     def getCommon(self, nums1, nums2):
#         """
#         :type nums1: List[int]
#         :type nums2: List[int]
#         :rtype: int
#         """
#         for num in nums1:
#             if(self.bsearch(nums2,num)):
#                 return num

#         return -1

#     def bsearch(self,nums,tar):
#         left = 0
#         right = len(nums) - 1

#         while(left<=right):
#             mid = (left+(right-left)//2)

#             if(nums[mid]==tar):
#                 return True

#             elif(nums[mid]<tar):
#                 left = mid+1

#             else:
#                 right = mid-1

#         return False
        