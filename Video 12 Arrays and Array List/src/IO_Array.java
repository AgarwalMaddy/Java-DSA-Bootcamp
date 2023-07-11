import java.util.Arrays;
import java.util.Scanner;

public class IO_Array {
    public static void main(String[] args) {

        /* Primitive Type : Cannot be divided further */
        /* Taking an array input */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the int array: ");
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print(arr1[0] + "\n");

        /* Printing all elements of an array */

        /* Method 1  - For Loop */
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        /* Method 2  - For Each Loop */
        for (int num : arr1) {
            System.out.print(num + " ");
        }

        System.out.println();

        /* Method 3 - .toString() method */
        System.out.println(Arrays.toString(arr1));

        /* Object Types : Can be divided further.
        * For Ex. String -> Characters
        *         Arrays -> Elements */

        /* Taking an array input for String array */
        System.out.println("Enter the elements of the String Array: ");
        String[] arr2 = new String[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.next();
        }

        /* Printing out the elements of the String array */
        /* Method 1  - For Loop */
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }

        /* Method 2  - For-Each Loop */
        for (String name:arr2) {
            System.out.print(name + " ");
        }

        /* Method 3  - .toString method */
        System.out.println(Arrays.toString(arr2));
    }
}
