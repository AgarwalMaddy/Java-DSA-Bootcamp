class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int mRows = mat.length;
        int mCols = mat[0].length;
        
        if(mRows*mCols != r*c){
            return mat;
        }
        
        int[][] result = new int[r][c];
        int rRows = 0;
        int rCols = 0;
        for(int i = 0 ; i < mRows ; i++){
            for(int j = 0 ; j < mCols ; j++){
                result[rRows][rCols] = mat[i][j];
                rCols++;
                
                if(rCols == c){
                    rCols = 0;
                    rRows++;
                }
            }
        }
        return result;
    }
}