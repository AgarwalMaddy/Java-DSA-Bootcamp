import java.util.HashSet;
import java.util.Scanner;

public class MarchingPeople {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][3];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < 3 ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(maximumBarrier(matrix , n));
    }

    public static int maximumBarrier(int[][] matrix, int rows){
        HashSet<Integer> elements = new HashSet<>();
        for(int[] arr : matrix){
            int element = arr[0];
            for (int i = element; i <= arr[0] + arr[2]; i++) {
                elements.add(element++);
            }
        }


        return elements.size();
    }

}
