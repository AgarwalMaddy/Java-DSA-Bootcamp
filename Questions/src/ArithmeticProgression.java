import java.util.Arrays;

public class ArithmeticProgression {
    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        if(arr.length == 1 || arr.length == 2){
            return false;
        }
        int diff = arr[1] - arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            for (int j = i+1; j < arr.length ; j++) {
                if(diff != (arr[j] - arr[i])){
                    return false;
                }
                i++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,0,6,10,14,8,12};
        System.out.println(canMakeArithmeticProgression(arr));
    }
}
