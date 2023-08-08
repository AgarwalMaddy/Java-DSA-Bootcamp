import java.util.Arrays;

public class FirstPositive {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int result = cycleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(result);
    }

    public static int cycleSort(int[] arr){
        int n = arr.length;
        int i = 0;
        while(i < n){
            int correctIndex = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= n && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        for(int j = 0 ; j < n ; j++){
            if(arr[j] != j + 1){
                return j+1;
            }
        }

        return n+1;
    }

    public static void swap(int[] arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
