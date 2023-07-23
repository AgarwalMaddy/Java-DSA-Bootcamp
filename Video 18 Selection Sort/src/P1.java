import java.util.Arrays;

public class P1 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,5,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            int lastIndex = arr.length - i - 1;
            int maxIndex = maxElement(arr , 0 , lastIndex);
            swap(arr, maxIndex, lastIndex);
        }
    }
    public static int maxElement(int[] arr , int start , int end){
        int max = start;
        for(int i = start ; i <= end ; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    public static void swap(int[] arr, int e1 , int e2){
        int temp = arr[e1];
        arr[e1] = arr[e2];
        arr[e2] = temp;
    }
}
