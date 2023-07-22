class Solution {
    public int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int row = 0;
        int col = cols - 1;
        int count = 0;
        while(row < rows){
            while(col >= 0 && grid[row][col] < 0){
                col--;
            }
            count += cols - col - 1;
            row++;
        }
        
        return count;
    }
}