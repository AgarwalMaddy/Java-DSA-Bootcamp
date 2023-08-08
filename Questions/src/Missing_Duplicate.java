import java.util.Arrays;

public class Missing_Duplicate {
    public static void main(String[] args) {
        int[] arr = {2,2};
        int[] result = findTwoElement(arr , 2);
        System.out.println(Arrays.toString(result));
    }
    public static int[] findTwoElement(int arr[], int n) {
        // code here
        int i = 0;
        while(i < n){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr , i , correctIndex);
            } else {
                i++;
            }
        }

        int[] result = new int[2];
        for(int j = 0 ; j < n ; j++){
            if(arr[j] != j + 1){
                result[0] = arr[j];
                result[1] = j + 1;
            }
        }

        return result;
    }

    public static void swap(int arr[] , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
