import java.util.Arrays;

public class P1 {
    public static void main(String[] args) {
        int[] arr = {5,-3,4,1,2,23,3,211,-12313,9132};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j > 0 ; j--){
                if(arr[j] < arr[j-1]){
                    swapElements(arr, j , j-1);
                } else {
                    break;
                }
            }
        }
    }
    public static void swapElements(int[] arr , int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
