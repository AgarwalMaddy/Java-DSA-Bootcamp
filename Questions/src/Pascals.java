import java.util.Arrays;

public class Pascals {
    public static void main(String[] args) {
        int row = 3;
        int n = row + 1;
        int[] result = new int[n];
        result[n-1] = 1;
        int i = n-2;
        while(i >= 0){
            for(int j = i; j < n - 1; j++){
                result[j] += result[j+1];
            }
            i--;
        }


        System.out.println(Arrays.toString(result));
    }
}
