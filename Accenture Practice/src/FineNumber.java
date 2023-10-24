import java.util.Arrays;

public class FineNumber {
    public static void main(String[] args) {
        int[] a = {6,7,8,11};
        int[] b = {3,1,2};
        System.out.println(fineNumber(a , b));
    }
    public static int fineNumber(int[] a , int[] b){
        int result;
        int n = a.length;
        int m = b.length;
        Arrays.sort(a);
        Arrays.sort(b);
        result = Math.max(Math.abs(a[0] - b[b.length-1]),Math.abs(b[0] - a[a.length-1]) );
        return  result;
    }
}
