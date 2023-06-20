class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] result = new int[m][n];
        int count = 0;
        
        for(int[] arr : indices){
            int rowIndex = arr[0];
            int colIndex = arr[1];
            
            for(int i = 0 ; i < n ; i++){
                result[rowIndex][i] += 1;
                if(result[rowIndex][i] % 2 == 0){
                    count--;
                } else {
                    count++;
                }
            }
            
            for(int j = 0 ; j < m ; j++){
                result[j][colIndex] += 1;
                if(result[j][colIndex] % 2 == 0){
                    count--;
                } else {
                    count++;
                }
            }
            
        }
        return count;
    }
}