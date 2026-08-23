class Solution(object):
    def maxProfit(self,prices):
        profit = 0
        mini = prices[0]

        for i in range(1,len(prices)):
            if (prices[i]-mini)>profit:
                profit = prices[i]-mini

            mini = min(prices[i],mini)

        return profit  
    