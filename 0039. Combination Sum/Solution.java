class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        findCombinationSum(0,target,res,candidates,new ArrayList<>());
        return res;
    }

    private void findCombinationSum(int index,int target,List<List<Integer>> res,int[] arr,List<Integer> curr){
        if(index==arr.length){
            if(target==0){
                res.add(new ArrayList<>(curr));
            }
            return;
        }

        if(arr[index]<=target){
            curr.add(arr[index]);
            findCombinationSum(index,target-arr[index],res,arr,curr);
            curr.remove(curr.size() - 1);
        }
        findCombinationSum(index+1,target,res,arr,curr);
    }
}