import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinAbsoluteDiff {
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();

        int minDiff = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length - 1 ; i++){
            int diff = arr[i + 1] - arr[i];
            if(diff < minDiff){
                minDiff = diff;
            }
         }
        for(int i = 0 ; i < arr.length - 1 ; i++){
            List<Integer> rows = new ArrayList<>();
            int j = i + 1;
            if(arr[j] - arr[i] == minDiff){
                rows.add(arr[i]);
                rows.add(arr[j]);
                result.add(rows);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,6,10,15};
        int[] arr2 = {4,3,1,2};
        int[] arr3 = {40,11,26,27,-20};
        List<List<Integer>> result = minimumAbsDifference(arr2);
        System.out.println(result);
    }
}
