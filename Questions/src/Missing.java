import java.util.ArrayList;

public class Missing {
    public static int present(int[] arr, int n){
        int sum = (n * (n+1))/2;
        int sum2 = 0;
        for(int i : arr){
            sum2 += i;
        }

        return sum - sum2;
    }

    public static void main(String[] args) {
        int[] arr = {6,1,2,8,3,4,7,10,5};
        System.out.println(present(arr , 10));
    }
}
