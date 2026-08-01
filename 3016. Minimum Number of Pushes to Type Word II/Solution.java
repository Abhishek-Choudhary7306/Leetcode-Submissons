class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer> cfreq = new HashMap<>();

        for(char ch : word.toCharArray()){
            cfreq.put(ch,cfreq.getOrDefault(ch,0)+1);
        }

        List<Integer> freq =  new ArrayList<>(cfreq.values());

        Collections.sort(freq,Collections.reverseOrder());

        int res = 0;

        for(int i=0;i<freq.size();i++){
            int f = freq.get(i);

            if(i<8){
                res+=f;
            }
            else if(i<16){
                res+= 2*f;
            }
            else if(i<24){
                res+= 3*f;
            }
            else{
                res+= 4*f;
            }
        }

        return res;
    }
}