class Solution(object):
    def minEatingSpeed(self, piles, h):
        """
        :type piles: List[int]
        :type h: int
        :rtype: int
        """
        max = 0
        for i in piles:
            if i>max:
                max = i

        left = 1
        right = max
        ans = float('inf')
        while left<=right:
            mid = left + (right-left)//2
            ctime = self.getTime(piles,mid)

            if(ctime<=h):
                right = mid-1
                ans = mid
            else:
                left = mid+1
        return ans

        
    def getTime(self,piles,k):
        total = 0
        for i in range(len(piles)):
            total += (piles[i] + k - 1) // k
        return total