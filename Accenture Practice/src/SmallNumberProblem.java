import java.util.Arrays;

public class SmallNumberProblem {
    public static void main(String[] args) {
        int[] arr = {10,5,4,5,3,2,1};
        int[] result = NextSmallerProblem(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] NextSmallerProblem(int[] arr){
        int[] result = new int[arr.length];
        if(arr.length == 0){
            return new int[0];
        }

        for(int i = 0 ; i < arr.length - 1 ; i++){
            int nextMax = -1;
            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[j] < arr[i] && arr[j] > nextMax){
                    nextMax = arr[j];
                    result[i] = nextMax;
                }
            }
        }

        result[arr.length - 1] = -1;
        return result;
    }
}
