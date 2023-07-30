import java.util.Arrays;
import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int n = sc.nextInt();
        System.out.print("Enter the Array Elements: ");
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Unsorted Array: " + Arrays.toString(arr));
        cycleSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void cycleSort(int[] arr){
        int i = 0;
        while(i < arr.length) {
            if (arr[i] != i + 1) {
                swap(arr, i, arr[i]-1);
            } else{
                i++;
            }
        }
    }

   public static void swap(int[] arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
   }
}
