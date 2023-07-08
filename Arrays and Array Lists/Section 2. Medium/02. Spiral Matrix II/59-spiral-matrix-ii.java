class Solution {
    public int[][] generateMatrix(int n) {
      int element = 1;
        
        int[][] result = new int[n][n];
        
        int top = 0 , bottom = n - 1 , left = 0 , right = n - 1;
        while(top <= bottom  && left <= right){
            for(int i = left ; i <= right ; i++){
                result[top][i] = element;
                element++;
            }
            top++;
            
            for(int i = top ; i <= bottom ; i++){
                result[i][right] = element;
                element++;
            }
            right--;
            
            if(top <= bottom){
                for(int i = right ; i >= left ; i--){
                    result[bottom][i] = element;
                    element++;
                }
                bottom--;
            }
            
            if(left <= right){
                for(int i = bottom ; i >= top ; i--){
                    result[i][left] = element;
                    element++;
                }
                left++;
            }
        }
        return result;
    }
}