class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int count90 = 0;
        int count180 = 0;
        int count270 = 0;
        int count0 = 0;
        int n = mat.length;
        
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(target[i][j] == mat[n - j - 1][i]){
                    count90++;
                } 
                if(target[i][j] == mat[n - i - 1][n - j - 1]){
                    count180++;
                }
                if(target[i][j] == mat[j][n - i - 1]){
                    count270++;
                } 
                if(target[i][j] == mat[i][j]){
                    count0++;
                }
            }
        }
        if(count90==n*n||count270==n*n||count180==n*n||count0==n*n)
        return true;
        else return false;
    }
}