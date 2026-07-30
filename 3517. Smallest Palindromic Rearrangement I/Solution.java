class Solution {
    public String smallestPalindrome(String s) {
        HashMap<Character,Integer> freq = new HashMap<>();

        for(char ch : s.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }

        StringBuilder left = new StringBuilder();
        char middle = '\0';

        List<Character> chars = new ArrayList<>(freq.keySet());
        Collections.sort(chars);

        for(char ch : chars){
            int count = freq.get(ch);

            for(int i=0;i<count/2;i++){
                left.append(ch);
            }

            if(count%2 == 1){
                middle = ch;
            }
        }
        
        StringBuilder ans = new StringBuilder();
        ans.append(left);

        if(middle!='\0'){
            ans.append(middle);
        }

        ans.append(left.reverse());

        return ans.toString();
        
    }
}