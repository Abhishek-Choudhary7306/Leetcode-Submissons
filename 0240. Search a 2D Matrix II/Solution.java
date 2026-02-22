//optimal solution O(log(m*n))

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int n = matrix.length;
        int m = matrix[0].length;

        int row = 0;
        int col = m-1;

        while(row<n && col>=0){
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col]<target){
                row++;
            }
            else{
                col--;
            }
        }
        return false;
    }
}

//better O(m log n)
// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int m = matrix.length;
//         int n = matrix[0].length;
//         for(int i=0;i<m;i++){
//             int left = 0;
//             int right = n-1;

//             while(left<=right){
//                 int mid = left + (right-left)/2;

//                 if(matrix[i][mid]==target){
//                     return true;
//                 }
//                 else if(matrix[i][mid]<target){
//                     left = mid + 1;
//                 }
//                 else{
//                     right = mid - 1;
//                 }
//             }
//         }
//         return false;
//     }
// }


//bruteForce O(m*n) 
// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int row = matrix.length;
//         int col = matrix[0].length;
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 if(matrix[i][j]==target){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }