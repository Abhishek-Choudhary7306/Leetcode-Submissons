class Solution {
    List<List<String>> res = new ArrayList<>();
    boolean[] cols,diag1,diag2;
    int n;


    public List<List<String>> solveNQueens(int n) {
        this.n = n;
        cols = new boolean[n];
        diag1 = new boolean[2*n];
        diag2 = new boolean[2*n];

        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }

        backtrack(0,board);
        return res;
    }

    void backtrack(int row,char[][] board){
        if(row==n){
            List<String> temp = new ArrayList<>();
            for(char[] r:board){
                temp.add(new String(r));
            }

            res.add(temp);
            return;
        }

        for(int col = 0;col<n;col++){
            int d1 = row - col + n;
            int d2 = row + col;

            if(cols[col] || diag1[d1] || diag2[d2])continue;
            cols[col] = diag1[d1] = diag2[d2] = true;
            board[row][col]  = 'Q';

            backtrack(row+1,board);

            cols[col] = diag1[d1] = diag2[d2] = false;
            board[row][col] = '.';
        }
    }
}