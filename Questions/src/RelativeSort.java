import java.util.Arrays;

public class RelativeSort {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        for(int i : arr1){
            count[i]++;
        }
        int i = 0;
        for(int num : arr2){
            while (count[num]-- > 0){
                arr1[i++] = num;
            }
        }
        for (int j = 0; j < 1001; j++) {
            while (count[j]-- > 0){
                arr1[i++] = j;
            }
        }
       return arr1;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        System.out.println(Arrays.toString(relativeSortArray(arr1 , arr2)));
    }
}
