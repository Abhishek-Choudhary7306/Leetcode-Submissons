class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int[] number = divide(nums[i]);

            for(int j = 0;j<number.length;j++){
                res.add(number[j]);
            }
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    private int[] divide(int num){
        if(num==0)return new int[]{0};

        ArrayList<Integer> res = new ArrayList<>();
        while(num!=0){
            int d = num%10;
            num = num/10;
            res.add(d);
        }

        Collections.reverse(res);

        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}