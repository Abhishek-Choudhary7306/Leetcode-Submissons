#another approach
class Solution(object):
    def separateDigits(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        res = []
        for i in nums:
            for d in str(i):
                res.append(int(d))
     
        return res
        



#first approach

# class Solution(object):
#     def separateDigits(self, nums):
#         """
#         :type nums: List[int]
#         :rtype: List[int]
#         """
#         res = []

#         for i in range(len(nums)):
#             curr = self.divide(nums[i])

#             for j in range(len(curr)):
#                 res.append(curr[j])


#         return res

#     def divide(self,num):
#         if num==0:
#             return [0]

#         res = []
#         while(num):
#             d = num%10
#             num = num//10
#             res.append(d)

#         res.reverse()
#         return res

