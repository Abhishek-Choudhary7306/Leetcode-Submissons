class Solution(object):
    def shipWithinDays(self, weights, days):
        """
        :type weights: List[int]
        :type days: int
        :rtype: int
        """
        left = max(weights)
        right = sum(weights)
        ans = right

        while left<=right:
            mid = left + (right-left)//2

            if self.isPossible(weights,days,mid):
                ans = mid
                right = mid-1
            else:
                left = mid+1
        return ans

    def isPossible(self,weights,days,c):
        total = 0
        daysTaken = 1

        for i in weights:
            if total+i>c:
                daysTaken+=1
                total = i

                if daysTaken>days:
                    return False
            else:
                total+=i
        return daysTaken<=days

