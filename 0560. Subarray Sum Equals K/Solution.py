class Solution(object):
    def subarraySum(self, nums, k):
        prefix_sum = 0
        count = 0
        hashmap = {0: 1}

        for x in nums:
            prefix_sum += x
            rem = prefix_sum - k
            if rem in hashmap:
                count += hashmap[rem]
            hashmap[prefix_sum] = hashmap.get(prefix_sum, 0) + 1

        return count
