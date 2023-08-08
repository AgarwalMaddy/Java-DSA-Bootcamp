import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {2,0,1};
        int result = cycleSort(arr);
        System.out.println(result);
    }
    public static int cycleSort(int[] arr){
        int n = arr.length;
        int i = 0;
        while(i < n) {
            int actualIndex = arr[i];
            if (arr[i] != arr[actualIndex]) {
                swap(arr, i , actualIndex);
            } else{
                i++;
            }
        }
        int j = 0;
        while(j < n){
            if(j != arr[j]){
                return j;
            } else{
                j++;
            }
        }
        return n;
    }

    public static void swap(int[] arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
