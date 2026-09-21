#Optimal Solution 

class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        ans = []
        nums = sorted(nums)

        for i in range(len(nums)):
            if(i>0 and nums[i]==nums[i-1]):
                continue

            j = i+1
            k = len(nums) - 1

            while(j<k):
                csum = nums[i]+nums[j]+nums[k]

                if csum<0:
                    j+=1
                elif csum>0:
                    k-=1
                else:
                    curr = [nums[i],nums[j],nums[k]]
                    ans.append(curr)
                    j+=1
                    k-=1

                    while(j<k and nums[j]==nums[j-1]):
                        j+=1
                    while(j<k and nums[k]==nums[k+1]):
                        k-=1
        return ans
                

