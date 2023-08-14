import java.util.*;

public class SortIntegerBits {
    public static int[] sortByBits(int[] arr) {
        int[] result = new int[arr.length];
        HashMap<Integer ,Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++) {
            map.put(arr[i], Integer.bitCount(arr[i]));
        }
        int temp = map.get(arr[0]);
        for(int i = 1 ; i < arr.length ; i++){
            if(temp < map.get(arr[i])){
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(sortByBits(arr)));

    }
}
