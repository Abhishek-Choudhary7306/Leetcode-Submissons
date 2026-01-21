class Solution {
    public int romanToInt(String s) {
        int res = 0;
        int n = s.length();

        for(int i=0;i<n;i++){
            int curr = value(s.charAt(i));
            int next = (i+1<n)?value(s.charAt(i+1)):0;

            if(curr < next){
                res-=curr;
            }
            else{
                res+=curr;
            }
        }
        return res;
    }
    private int value(char c){
        switch (c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
}

//Another solution using HashMap

// class Solution {
//     public int romanToInt(String s) {
//         HashMap<Character,Integer> map = new HashMap<>();

//         map.put('I',1);
//         map.put('V',5);
//         map.put('X',10);
//         map.put('L',50);
//         map.put('C',100);
//         map.put('D',500);
//         map.put('M',1000);

//         int res = 0;
//         int n = s.length();

//         for(int i=0;i<n;i++){
//             int curr = map.get(s.charAt(i));
//             int next = (i+1<n)?map.get(s.charAt(i+1)):0;

//             if(curr<next){
//                 res-=curr;
//             }
//             else {
//                 res+=curr;
//             }
//         }

//         return res;
//     }
// }