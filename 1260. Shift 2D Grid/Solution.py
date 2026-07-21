class Solution(object):
    def shiftGrid(self, grid, k):
        """
        :type grid: List[List[int]]
        :type k: int
        :rtype: List[List[int]]
        """
        m = len(grid)
        n = len(grid[0])
        total = m*n

        res =[[0]*n for _ in range(m)]

        for i in range(m):
            for j in range(n):
                index = i * n + j
                newIndex = (index+k) % total

                newRow = newIndex / n
                newCol = newIndex % n

                res[newRow][newCol] = grid[i][j]

        
        return res