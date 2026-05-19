#Optimal Solution 
class Solution(object):
    def getCommon(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: int
        """
        i = 0
        j = 0

        while i<len(nums1) and j<len(nums2):
            if(nums1[i]==nums2[j]):
                return nums1[i]

            elif(nums1[i]>nums2[j]):
                j+=1
            else:
                i+=1
        return -1
        

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
        