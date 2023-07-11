import java.util.Scanner;

public class Multidimension_Array_Declaration {
    public static void main(String[] args) {
        /* Creating a 2D array */

        Scanner sc = new Scanner(System.in);

        /* Method 1 */
        int[][] arr1 = new int[3][3];

        /* Mentioning the number of rows is mandatory while number of columns is not */
        int[][] arr2 = new int[3][];

        /* Method 2 */
        int[][] arr3 = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                       };
    }
}
