#optimal solution 
class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        n = len(matrix)
        m = len(matrix[0])

        row = 0
        col = m-1 

        while row<n and col>=0:
            if matrix[row][col] == target:
                return True
            elif matrix[row][col]<target:
                row+=1
            else:
                col-=1

        return False



#better solution O(m log n)
# class Solution:
#     def searchMatrix(self, matrix, target):
#         m = len(matrix)
#         n = len(matrix[0])

#         for i in range(m):
#             left = 0
#             right = n - 1

#             while left <= right:
#                 mid = left + (right - left) // 2

#                 if matrix[i][mid] == target:
#                     return True
#                 elif matrix[i][mid] < target:
#                     left = mid + 1
#                 else:
#                     right = mid - 1

#         return False