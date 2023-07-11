import java.util.Arrays;
import java.util.Scanner;

public class Using_Functions_in_Arrays {
    public static void main(String[] args) {
        /* This behaviour of arrays shows its mutability : changing behaviour */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        /* Original Array */
        System.out.println(Arrays.toString(arr1));

        changeElement(arr1);

        /* Array after element is updated */
        System.out.println("Array Element Updated");
        System.out.println(Arrays.toString(arr1));
    }
    static void changeElement(int[] arr2){
        arr2[2] = 59;
    }
}
