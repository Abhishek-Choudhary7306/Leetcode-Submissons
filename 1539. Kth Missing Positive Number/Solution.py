#Brute force 
class Solution(object):
    def findKthPositive(self, arr, k):
        """
        :type arr: List[int]
        :type k: int
        :rtype: int
        """

        i = 1
        j = 0
        count = 0
        
        while True:
            if len(arr)>j and arr[j]==i:
                j+=1
                i+=1
            else:
                count+=1
                if(count==k):
                    return i
                i+=1
        return -1