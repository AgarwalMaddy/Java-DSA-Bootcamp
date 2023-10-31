import java.util.Arrays;

public class ArrayOfPrefixXOR {
    public static void main(String[] args){
        int[] arr = {5,2,0,3,1};
        System.out.println(Arrays.toString(originalXORarray(arr)));
    }
    public static int[] originalXORarray(int[] pref){
        int[] originalArray = new int[pref.length];
        originalArray[0] = pref[0];
        for(int i = 1 ; i < pref.length ; i++){
            originalArray[i] = pref[i] ^ pref[i-1];
        }

        return originalArray;
    }
}
