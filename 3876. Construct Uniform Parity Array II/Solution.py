#best Solution

class Solution(object):
    def uniformArray(self, nums1):
        """
        :type nums1: List[int]
        :rtype: bool
        """
        #find min Value 
        min_val = min(nums1)


        #if min value is odd the ans is always True
        if(min_val %2 != 0):
            return True

        #if min value is even we need to check all the elements should be even 
        for num in nums1:
            if(num%2!=0):
                return False 
            
        return True


#Better Solution

# class Solution(object):
#     def uniformArray(self, nums1):
#         """
#         :type nums1: List[int]
#         :rtype: bool
#         """
        
#         minEven = float('inf')
#         minOdd = float('inf')

#         for num in nums1:
#             if num%2==0:
#                 minEven = min(minEven,num)
#             else:
#                 minOdd = min(minOdd,num)
            

#         return minOdd == float('inf') or minEven>minOdd


#One Solution 

# class Solution(object):
#     def uniformArray(self, nums1):
#         """
#         :type nums1: List[int]
#         :rtype: bool
#         """

#         minOdd = float('inf')
#         nums2 = [0]*len(nums1)

#         for i in range(len(nums1)):
#             if(nums1[i]%2 != 0):
#                 minOdd = min(nums1[i],minOdd)

        
#         if(minOdd == float('inf')):
#             return True

#         for i in range(len(nums1)):
#             if(nums1[i]%2==0):
#                 nums2[i] = nums1[i] - minOdd

#         for num in nums2:
#             if(num<0):
#                 return False

#         return True


        