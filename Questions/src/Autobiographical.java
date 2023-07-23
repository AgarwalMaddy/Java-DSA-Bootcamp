import java.util.*;
public class Autobiographical {
    public static void main(String args[]) {
        int inp= 1210;
        if(checkAutobiographical(inp))
            System.out.println(inp + " is an autobiographical number.");
        else
            System.out.println(inp + " is not an autobiographical number.");
    }
    public static boolean checkAutobiographical(int n){
        int inputNumber = Math.abs(n);
        int temp = inputNumber;
        String s = String.valueOf(inputNumber);
        int arr[] = new int[s.length()];
        for(int i = arr.length - 1; i >= 0; i--) {
            arr[i] = temp % 10;
            temp = temp/10;
        }
        boolean f = true;
        for(int i = 0; i < arr.length; i++) {
            int count = 0;
            for(int j = 0; j < arr.length; j++) {
                if(i == arr[j])
                    count++;
            }
            if(count != arr[i]) {
                f = false;
                break;
            }
        }
        if(f)
            return true;
        else
            return false;
    }
}