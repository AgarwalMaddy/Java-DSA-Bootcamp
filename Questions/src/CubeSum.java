import java.util.*;

public class CubeSum {
    public static void main(String[] args) {
        int limit = (int)Math.pow(9, 1/3);
        int[] a = new int[limit + 1];
        for(int i = 0 ; i < limit + 1  ; i++){
            a[i] = i + 1;
        }
        System.out.println(a[1]);
        List<ArrayList<Integer>> result = new ArrayList<>();
    }
}
