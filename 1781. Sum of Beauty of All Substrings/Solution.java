class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int sum = 0;

        for(int i=0;i<n;i++){
            HashMap<Character,Integer> map = new HashMap<>();
            for(int j = i;j<n;j++){
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);

                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;

                for(int v:map.values()){
                    max = Math.max(max,v);
                    min = Math.min(min,v);
                }
                sum+=max-min;
            }
        }
        return sum;
    }
}