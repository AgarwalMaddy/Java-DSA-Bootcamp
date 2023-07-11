import java.util.Arrays;
import java.util.Scanner;

public class Multidimensional_Array_IO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of cols: ");
        int cols = sc.nextInt();

        int[][] arr1 = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols ; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        /* For output of an 2D array the counter variables used in for loop are to be used */

        /* Method 1 for output of 2D array */
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols ; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        /* Method 2 for output of 2D array .toString method */
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(arr1[i]));
        }

        /* Method 3 for output of 2D array using enhanced for-each loop */
        for (int[] arr: arr1) {
            System.out.println(Arrays.toString(arr));
        }

        /* Case when column size is not fixed */
        int[][] arr3 = {{1,2,3,4}, {1,2}, {1,2,3}};
        for (int[] ints : arr3) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
