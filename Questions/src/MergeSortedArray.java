import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] n1 = {1,2,3,0,0,0};
        int[] n2 = {2,5,6};
        int m = 3 , n = 3;
        for(int i = 0 ; i < n ; i++){
            n1[m+i] = n2[i];
        }
        Arrays.sort(n1);
        System.out.println(Arrays.toString(n1));
    }
}
