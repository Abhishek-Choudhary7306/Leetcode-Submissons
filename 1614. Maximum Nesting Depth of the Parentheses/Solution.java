class Solution {
    public int maxDepth(String s) {
        if(s.length()==0)return 0;
        int max = 0;
        int depth = 0;
        for(char i : s.toCharArray()){
            if(i=='('){
                depth++;
            }

            else if(i==')'){
                depth--;
            }
            max = Math.max(max,depth);
        }

        return max;
    }
}