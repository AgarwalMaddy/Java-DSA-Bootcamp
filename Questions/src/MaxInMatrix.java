import java.util.Arrays;

public class MaxInMatrix {
    public static int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] result = new int[n-2][n-2];
        for(int i = 0 ; i < n - 2 ; i++){
            for(int j = 0 ; j < n-2; j++){
                int max = maxElement(grid , i , j);
                result[i][j] = max;
            }
        }
        return result;
    }
    public static int maxElement(int[][] matrix , int a , int b){
        int max = Integer.MIN_VALUE;
        for(int i = a; i < a+3 ; i++){
            for(int j = b ; j < b+3; j++){
                if(max < matrix[i][j]){
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] matrix = {{20,8,20,6,16,16,7,16,8,10},{12,15,13,10,20,9,6,18,17,6},{12,4,10,13,20,11,15,5,17,1},{7,10,14,14,16,5,1,7,3,11},{16,2,9,15,9,8,6,1,7,15},{18,15,18,8,12,17,19,7,7,8},{19,11,15,16,1,3,7,4,7,11},{11,6,5,14,12,18,3,20,14,6},{4,4,19,6,17,12,8,8,18,8},{19,15,14,11,11,13,12,6,16,19}};
        int[][] result = largestLocal(matrix);
        for(int[] arr : result){
            System.out.println(Arrays.toString(arr));
        }
    }
}