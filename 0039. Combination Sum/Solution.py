class Solution(object):
    def combinationSum(self, candidates, target):
        """
        :type candidates: List[int]
        :type target: int
        :rtype: List[List[int]]
        """
        res = []
        self.helper(0,target,res,[],candidates)
        return res
        

    def helper(self,index,target,res,curr,nums):
        if(index==len(nums)):
            if(target==0):
                res.append(curr[:])
            return

        if(target>=nums[index]):
            curr.append(nums[index])
            self.helper(index,target-nums[index],res,curr,nums)
            curr.pop()

        self.helper(index+1,target,res,curr,nums)

