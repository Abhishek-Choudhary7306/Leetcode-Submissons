class Solution(object):
    def findPeakGrid(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        n = len(mat)
        m = len(mat[0])

        low = 0
        high = m-1

        while low<=high:
            mid = low + (high - low)//2
            row = self.maxinIt(mat,n,mid)
            
            left = mat[row][mid-1] if (mid-1)>=0 else -1
            right = mat[row][mid+1] if (mid+1)<m else -1

            if mat[row][mid]>left and mat[row][mid]>right:
                return [row,mid]

            elif mat[row][mid]<left:
                high = mid-1

            else:
                low = mid+1
        return [-1,-1]


    def maxinIt(self,mat,n,col):
        ans = -1
        maxi = float('-inf')

        for i in range(n):
            if(mat[i][col]>maxi):
                ans = i
                maxi = mat[i][col]
        return ans
