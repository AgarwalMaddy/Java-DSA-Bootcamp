import java.sql.SQLOutput;
import java.util.* ;
public class Product_Array {
    public static int[] productPuzzle(int[] nums, int n) {
        // Write your code here.
        int[] prefixArray = new int[n];
        prefixArray[0] = 1; //First element doesnot have any prefix.
        for(int i = 1 ; i < n ; i++){
            prefixArray[i] = prefixArray[i-1] * nums[i-1];
        }
        int sufixElement = 1;

        int[] answer = new int[n];
        for(int i = n - 1 ; i >= 0 ; i--){
            answer[i] = prefixArray[i] * sufixElement;
            sufixElement *= nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,3,10,2};
        int n = 5;
//        System.out.println((180 ^ 1)) ;
        System.out.println(Arrays.toString(productPuzzle(arr , n)));
    }
}