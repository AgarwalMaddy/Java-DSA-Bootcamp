public class Max_1s {
    public static void main(String[] args) {
        int[][] grid = {{0,0}, {0,0}};
        System.out.println(rowWithMax1s(grid , 2, 2));
    }
    public static int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int row = 0;

        int max = Integer.MIN_VALUE;
        int resultRow = -1;
        while(row < n){
            int col = m - 1, count = 0;
            while(col >= 0 && arr[row][col] == 1 )
            {
                count++;
                col--;
            }

            if(count != 0 && count > max){
                max = count;
                resultRow = row;
            }
            row++;
        }

        return resultRow;
    }
}
