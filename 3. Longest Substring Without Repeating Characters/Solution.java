class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0;
        int left = 0;
        for(int right=0;right<s.length();right++){
            char c = s.charAt(right);

            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(c);
            
            int cmax = set.size();

            max = Math.max(max,cmax);
        }

        return max;
    }
}