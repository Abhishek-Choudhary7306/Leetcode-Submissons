class Solution {
    public boolean isValid(String s) {
        Stack<Character> st =  new Stack<>();

        for(int i=0;i<s.length();i++){
            char e = s.charAt(i);
            if(e=='('||e=='{'||e=='['){
                st.push(e);
            }

            else{
                if (st.isEmpty()) return false;

                char c = st.pop();

                if((e==')' && c!='(')||(e=='}' && c!='{')||(e==']' && c!='['))return false;
            }
        }
        return st.isEmpty();
    } 
}