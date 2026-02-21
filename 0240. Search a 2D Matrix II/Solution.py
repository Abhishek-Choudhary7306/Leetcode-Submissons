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