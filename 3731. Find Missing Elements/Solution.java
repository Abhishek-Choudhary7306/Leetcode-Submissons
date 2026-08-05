//one solution
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res = new ArrayList<>();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
            }
            if(nums[i]>max){
                max = nums[i];
            }
        }

        for(int i=min;i<=max;i++){
            if(notIn(i,nums)){
                res.add(i);
            }
        }

        return res;
    }
    private boolean notIn(int n,int[] nums){
        for(int i=0;i<nums.length;i++){
            if(n==nums[i])return false;
        }
        return true;
    }
}