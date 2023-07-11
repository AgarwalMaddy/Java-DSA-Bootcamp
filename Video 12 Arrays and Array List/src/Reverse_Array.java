import java.util.Arrays;
import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Actual Array: ");
        System.out.println(Arrays.toString(arr1));

        reverseArray(arr1);
        System.out.println("Reversed Array: ");
        System.out.println(Arrays.toString(arr1));

        reverse(arr1);
        System.out.println("Reversed Twice Array: ");
        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr1);
    }

    /* Reverse Array using while loop */
    static void reverseArray(int[] arr){
       int start = 0;
       int end = arr.length - 1;
       while(end > start){
           int temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;

           start++;
           end--;
       }
    }

    /* Reverse Array using for loop */
    static void reverse(int[] arr2){
        int n = arr2.length;
        for(int i = 0 ; i < n / 2 ; i++){
            int temp = arr2[i];
            arr2[i] = arr2[n - i - 1];
            arr2[n - i - 1] = temp;
        }
    }
}
