import java.util.Arrays;

public class ReducingDishes {
    public static void main(String[] args) {
        int[] arr = {-1,-4,-5};
        Arrays.sort(arr);
        int n = arr.length;
        int startMultiplier = 1;
        int startIndex = 0 , sum = 0 , max = Integer.MIN_VALUE;
        while(startIndex < n) {
            sum = arraySum(arr, n, startIndex++, startMultiplier);
            if (sum > max) {
                max = sum;
            }
        }
        if(max < 0){
            max = 0;
        }
        System.out.println(max);
    }
    public static int arraySum(int[] arr , int n , int startIndex , int startMultiplier){
        int sum = 0;
        for(int i = startIndex ; i < n ; i++){
            sum += arr[i] * startMultiplier;
            startMultiplier++;
        }
        return sum;
    }
}
