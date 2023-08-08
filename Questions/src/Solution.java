import java.util.ArrayList;
import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        int[] arr = {2,3,1,2,3};
        cycleSort(arr , 5);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < 5 ; i++){
            if(arr[i] != i){
                list.add(i);
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(list);
    }

    public static void cycleSort(int[] arr, int n){
        int i = 0 ;
        while(i < n){
            int correctIndex = i;
            if(arr[i] != correctIndex){
                swapIndex(arr , arr[i] , correctIndex);
            } else{
                i++;
            }
        }
    }
    public static void swapIndex(int[] arr, int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}