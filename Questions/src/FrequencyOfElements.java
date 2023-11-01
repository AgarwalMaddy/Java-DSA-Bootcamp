import java.util.Arrays;
import java.util.HashMap;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] arr = {2,3,2,3,5};
        int n = arr.length;
        int p = 5;
        frequencyCount(arr , n , p);
    }
    public static void frequencyCount(int[] arr , int N , int P){
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < N; i++) {
            if(arr[i] <= P){
                if(freq.containsKey(arr[i])){
                    freq.put(arr[i] , freq.get(arr[i]) + 1);
                }else{
                    freq.put(arr[i], 1);
                }
            }
        }
        for(int i = 1 ; i <= N ; i++){
            arr[i-1] = freq.getOrDefault(i, 0);
        }

        System.out.println(Arrays.toString(arr));
    }
}
