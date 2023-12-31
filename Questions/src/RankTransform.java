import java.util.Arrays;
import java.util.Collections;

public class RankTransform {
    public static int[] arrayRankTransform(int[] arr) {
        int[] result = new int[arr.length];

        for(int i = 0 ; i < arr.length ; i++) {
            int count = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
                if (arr[i] == arr[j]) {
                    count--;
                }
            }
            result[i] = count;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {37,12,28,9,100,56,80,5,12};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));

    }
}
