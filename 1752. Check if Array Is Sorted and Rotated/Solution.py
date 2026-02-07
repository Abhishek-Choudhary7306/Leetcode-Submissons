class Solution(object):
    def check(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        count = 0
        n = len(nums)

        for i in range(n):
            if nums[i] > nums[(i + 1) % n]:
                count += 1
                if count > 1:
                    return False

        return True
    

#another solution     
# class Solution(object):
#     def check(self, nums):
#         """
#         :type nums: List[int]
#         :rtype: bool
#         """
#         n = len(nums)

#         # find index of minimum element
#         min_index = 0
#         for i in range(1, n):
#             if nums[i] < nums[min_index]:
#                 min_index = i

#         # check sorted order in circular manner
#         for i in range(n - 1):
#             curr = nums[(min_index + i) % n]
#             nxt = nums[(min_index + i + 1) % n]
#             if curr > nxt:
#                 return False

#         return True
