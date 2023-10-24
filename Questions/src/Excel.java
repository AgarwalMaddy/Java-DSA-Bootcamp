import java.util.* ;
import java.io.*;
public class Excel {
    public static void main(String[] args) {
        System.out.println(titleToNumber("A"));
    }
    public static long titleToNumber(String str)
    {
        long length = str.length();
        long result = 0;
        for(int i = 0; i < length ; i++){
            result = result * 26;
            int a = (str.charAt(i) - 'A' + 1);
            result = result + a;
        }

        return result;
    }
}
