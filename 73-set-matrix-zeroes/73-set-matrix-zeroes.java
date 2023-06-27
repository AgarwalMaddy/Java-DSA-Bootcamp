class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        int[] rowArray = new int[n];
        int[] colArray = new int[m];
        for(int i = 0 ; i < n ; i++){
            for(int  j = 0 ; j < m ; j++){
                if(matrix[i][j] == 0){
                    rowArray[i] = -1;
                    colArray[j] = -1;
                }
            }
        }
        
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(rowArray[i] == -1 || colArray[j] == -1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}