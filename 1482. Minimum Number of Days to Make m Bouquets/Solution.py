class Solution(object):
    def minDays(self, bloomDay, m, k):
        """
        :type bloomDay: List[int]
        :type m: int
        :type k: int
        :rtype: int
        """
        if((m*k)>len(bloomDay)):
            return -1

        left = min(bloomDay)
        right = max(bloomDay)

        ans = right

        while left<=right:
            mid = left + (right-left)//2

            if(self.isPossible(bloomDay,mid,m,k)):
                ans = mid
                right = mid-1
            else:
                left = mid+1
        return ans


    def isPossible(self,bloomDay,d,m,k):
        b = 0
        count = 0
        for i in bloomDay:
            if i<=d:
                count+=1
            else:
                count = 0
            if count==k:
                b+=1
                count = 0
                if b>=m:
                    return True
        return b>=m


        