import java.util.Arrays;
import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the Size of the Array: ");
       int n = sc.nextInt();
       System.out.print("Enter the Array Elements: ");
       int[] array = new int[n];
       for(int i = 0 ; i < n ; i++){
           array[i] = sc.nextInt();
       }
       bubbleSort(array);
       System.out.print(Arrays.toString(array));
    }
    public static void bubbleSort(int[] arr){
        boolean isSwapped ;
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            isSwapped = false;
            for(int j = 1 ; j < n - i ; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped)break;
        }
    }
}