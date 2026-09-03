class Solution(object):
    def uniformArray(self, nums1):
        """
        :type nums1: List[int]
        :rtype: bool
        """

        minOdd = float('inf')
        nums2 = [0]*len(nums1)

        for i in range(len(nums1)):
            if(nums1[i]%2 != 0):
                minOdd = min(nums1[i],minOdd)

        
        if(minOdd == float('inf')):
            return True

        for i in range(len(nums1)):
            if(nums1[i]%2==0):
                nums2[i] = nums1[i] - minOdd

        for num in nums2:
            if(num<0):
                return False

        return True


        