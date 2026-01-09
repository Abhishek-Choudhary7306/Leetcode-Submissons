class Solution {
    public long maxMatrixSum(int[][] matrix) {

        int negCount = 0;
        long res = 0;
        int minabs = Integer.MAX_VALUE;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                int val = matrix[i][j];

                if(val<0){
                    negCount++;
                }

                int abs = Math.abs(val);
                res+=abs;

                if(abs<minabs){
                    minabs = abs;
                }
            }
        }

        if(negCount%2!=0){
            res -= 2L*minabs;
        }

        return res;
    }
}