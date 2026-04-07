// User function Template for Java

class Solution {
    public List<String> AllPossibleStrings(String s) {
        // Code here
        List<String> res = new ArrayList<>();
        
        solve(s,"",0,res);
        Collections.sort(res);
        
        return res;
    }
    
    private void solve(String s,String curr,int index,List<String> res){
        if(index==s.length()){
            if(!curr.isEmpty()){
                res.add(curr);
            }
            return;
        }
        
        solve(s,curr+s.charAt(index),index+1,res);
        solve(s,curr,index+1,res);
    }
}