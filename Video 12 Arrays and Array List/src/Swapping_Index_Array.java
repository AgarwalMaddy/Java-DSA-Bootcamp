import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Swapping_Index_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the index to be swapped: ");
        int index1 = sc.nextInt();

        System.out.println("Enter the index to which swap should happen: ");
        int index2 = sc.nextInt();

        System.out.println("Array before swapping: " + Arrays.toString(arr1));

        swap(arr1, index1 , index2);

        System.out.println("Array after swapping: " + Arrays.toString(arr1));
    }

    static void swap(int[] arr , int index1 , int index2){
       int temp = arr[index1];
       arr[index1] = arr[index2];
       arr[index2] = temp;
    }
}
