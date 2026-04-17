//best optimal space solution with O(1) space complexity
class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int col0 = 1;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0] = 0;
                    if(j!=0){
                        matrix[0][j] = 0;
                    }
                    else{
                        col0 = 0;
                    }
                    
                }
            }
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]!=0){
                    if(matrix[i][0]==0 || matrix[0][j]==0){
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        if(matrix[0][0] == 0){
            for(int i = 0;i<n;i++){
                matrix[0][i] = 0;
            }
        }

        if(col0 == 0){
            for(int i=0;i<m;i++){
                matrix[i][0] = 0;
            }
        }

    }
}

// //better solution O(n^2)

// class Solution {
//     public void setZeroes(int[][] matrix) {
//         int m = matrix.length;
//         int n = matrix[0].length;
//         int[] rows = new int[m];
//         int[] cols = new int[n];

//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if(matrix[i][j] == 0){
//                     rows[i] = 1;
//                     cols[j] = 1;
//                 }
//             }
//         }

//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if(rows[i]==1 || cols[j]==1){
//                     matrix[i][j] = 0;
//                 }
//             }
//         }
//     }
// }

// //bruteforce solution O(n^3)

// // class Solution {
// //     public void setZeroes(int[][] matrix) {
// //         int m = matrix.length;
// //         int n = matrix[0].length;
// //         int[][] res = new int[m][n];

// //         for(int i = 0; i < m; i++){
// //             for(int j = 0; j < n; j++){
// //                 res[i][j] = matrix[i][j];
// //             }
// //         }

// //         for(int i=0;i<m;i++){
// //             for(int j=0;j<n;j++){
// //                 if(matrix[i][j]==0){
// //                     setRowsZero(res[i]);
// //                     setColsZero(res,j);
// //                 }
// //             }
// //         }
// //         for(int i=0;i<m;i++){
// //             for(int j=0;j<n;j++){
// //                 matrix[i][j] = res[i][j];
// //             }
// //         }
// //     }
// //     public void setRowsZero(int[] row){
// //         for(int i=0;i<row.length;i++){
// //             row[i] = 0;
// //         }
// //     }
// //     public void setColsZero(int[][]matrix,int col){
// //         for(int i=0;i<matrix.length;i++){
// //             matrix[i][col] = 0;
// //         }
// //     }
// // }