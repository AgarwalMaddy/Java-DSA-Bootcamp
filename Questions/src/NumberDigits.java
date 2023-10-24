import java.lang.reflect.Array;
import java.util.*;
public class NumberDigits {
    public static int[] separateDigits(int[] nums) {
        ArrayList<Integer> allDigits = new ArrayList<>();
        for(int i = nums.length - 1; i >= 0 ; i--){
            ArrayList<Integer> temp = new ArrayList<>();
            temp = digits(nums[i]);
            allDigits.addAll(temp);
        }
        Collections.reverse(allDigits);
        int[] resultArray = new int[allDigits.size()];
        for (int i = 0; i < allDigits.size(); i++) {
            resultArray[i] = allDigits.get(i);
        }

        return  resultArray;

    }
    public static ArrayList<Integer> digits(int n){
        ArrayList<Integer> numberDigits = new ArrayList<>();
        while(n > 0){
            int temp = n % 10;
            numberDigits.add(temp);
            n = n / 10;
        }
        return numberDigits;
    }

    public static void main(String[] args) {
        int[] nums = {13,25,83,77};
        System.out.println(Arrays.toString(separateDigits(nums)));
    }
}
