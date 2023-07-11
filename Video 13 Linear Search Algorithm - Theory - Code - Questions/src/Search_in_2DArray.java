import java.util.Arrays;

public class Search_in_2DArray {
    public static void main(String[] args) {
        int[][] A = {
                {12,14},
                {23, 24,25},
                {34,35,36,37},
                {45,46,47},
                {56,51}
        };

        int element = 57;
        int[] result = search(A, element);
        System.out.println(Arrays.toString(result));

        System.out.println(max(A));
    }

    static int[] search(int[][] arr , int target){
        for(int row = 0 ; row < arr.length ; row++){
            for(int col = 0 ; col < arr[row].length ; col++){
                if(arr[row][col] == target){
                    return new int[] {row,col};
                }
            }
        }

        return new int[]{-1, -1};
    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] a : arr){
            for(int element : a){
                if(element > max){
                    max = element;
                }
            }
        }
        return  max;
    }
}
