#best optimal space solution with O(1) space complexity
class Solution(object):
    def setZeroes(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """
        col0 = 1 
        m = len(matrix)
        n = len(matrix[0])

        for i in range(m):
            for j in range(n):
                if matrix[i][j]==0:
                    matrix[i][0]=0

                    if j==0:
                        col0 = 0
                    else:
                        matrix[0][j] = 0

        for i in range(1,m):
            for j in range(1,n):
                if matrix[0][j]==0 or matrix[i][0]==0:
                    matrix[i][j] = 0

        if matrix[0][0]==0:
            for j in range(n):
                matrix[0][j]=0

        if col0==0:
            for i in range(m):
                matrix[i][0] = 0




        

# #better solution O(n^2)

# class Solution(object):
#     def setZeroes(self, matrix):
#         """
#         :type matrix: List[List[int]]
#         :rtype: None Do not return anything, modify matrix in-place instead.
#         """

#         m = len(matrix)
#         n =len(matrix[0])

#         row = [0]*m
#         col = [0]*n

#         for i in range(m):
#             for j in range(n):
#                 if matrix[i][j] == 0:
#                     row[i] = 1
#                     col[j] = 1

#         for i in range(m):
#             for j in range(n):
#                 if row[i] == 1 or col[j] == 1:
#                     matrix[i][j] = 0
        