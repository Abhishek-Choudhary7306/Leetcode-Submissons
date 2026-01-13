class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        presum = 0
        count = 0
        freq = {}
        freq[0] = 1

        for i in nums:
            presum += i
            rem = presum - k
            count+=freq.get(rem,0)
            freq[presum] = freq.get(presum,0)+1

        return count

