import java.util.*;

public class Duplicates {
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,3};
        int n = 5;
        System.out.println(duplicates(arr , n));
    }
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        for(int i = 0 ; i < n ; i++){
            if(arr[i] != i){
                swapIndexes(arr , i, arr[i]);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            if(arr[i] != i){
                result.add(i);
            }
        }
        return result;
    }
    public static void swapIndexes(int[] arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
