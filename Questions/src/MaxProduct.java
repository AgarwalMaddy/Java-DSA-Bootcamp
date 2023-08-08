import java.util.Arrays;

public class MaxProduct {
    public static void main(String[] args) {
        int[] arr = {-100 , -98 , -1 , 2, 3, 4};
        System.out.println(maxProduct(arr));

    }
    public static int maxProduct(int[] arr){
        int maxP = Integer.MIN_VALUE;
        int product = 1;
        Arrays.sort(arr);
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1 , k = j+1 ; j < arr.length-1 ; j++){
                product = arr[i] * arr[j] * arr[k];
                if(product > maxP){
                    maxP = product;
                }
                k++;
            }
        }
        return maxP;
    }
}
