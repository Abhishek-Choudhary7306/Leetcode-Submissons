#better Solution

class Solution(object):
    def maxProduct(self, n):
        """
        :type n: int
        :rtype: int
        """
        
        num = n
        max1 = float('-inf')
        max2 = float('-inf')

        while(num>0):
            d = num%10
            if(d>max1):
                max2 = max1
                max1 = d

            elif(d==max1):
                max2 = max1
            
            elif(d>max2):
                max2 = d
            
            num = num/10

        return max1*max2



        