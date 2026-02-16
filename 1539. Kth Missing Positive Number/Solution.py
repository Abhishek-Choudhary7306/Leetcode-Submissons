#optimal solution with O(log n)
class Solution(object):
    def findKthPositive(self, arr, k):
        """
        :type arr: List[int]
        :type k: int
        :rtype: int
        """
        if len(arr)!=0 and arr[0]>k:
            return k
        
        left = 0
        right = len(arr)-1

        while left<=right:
            mid = left + (right-left)//2
            missing = arr[mid] - (mid+1)

            if missing<k:
                left = mid + 1
            else:
                right = mid - 1
        
        return left + k

        


 #Brute force 
# class Solution(object):
#     def findKthPositive(self, arr, k):
#         """
#         :type arr: List[int]
#         :type k: int
#         :rtype: int
#         """

#         i = 1
#         j = 0
#         count = 0
        
#         while True:
#             if len(arr)>j and arr[j]==i:
#                 j+=1
#                 i+=1
#             else:
#                 count+=1
#                 if(count==k):
#                     return i
#                 i+=1
#         return -1