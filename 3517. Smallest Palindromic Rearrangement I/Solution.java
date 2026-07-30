//better Solution Question specific (due to the input always given a palindrome )

class Solution {

    public String smallestPalindrome(String s) {
        int len = s.length();
        int partition = len / 2;

        char[] chars = s.toCharArray();
        Arrays.sort(chars, 0, partition);

        for (int i = 0; i < partition; i++) {
            chars[len - 1 - i] = chars[i];
        }

        return new String(chars);
    }
}

//first Solution
// class Solution {
//     public String smallestPalindrome(String s) {
//         HashMap<Character,Integer> freq = new HashMap<>();

//         for(char ch : s.toCharArray()){
//             freq.put(ch,freq.getOrDefault(ch,0)+1);
//         }

//         StringBuilder left = new StringBuilder();
//         char middle = '\0';

//         List<Character> chars = new ArrayList<>(freq.keySet());
//         Collections.sort(chars);

//         for(char ch : chars){
//             int count = freq.get(ch);

//             for(int i=0;i<count/2;i++){
//                 left.append(ch);
//             }

//             if(count%2 == 1){
//                 middle = ch;
//             }
//         }
        
//         StringBuilder ans = new StringBuilder();
//         ans.append(left);

//         if(middle!='\0'){
//             ans.append(middle);
//         }

//         ans.append(left.reverse());

//         return ans.toString();
        
//     }
// }