import java.util.*;
public class GFGMajority {
    public static void main(String[] args) {
        int[] a = {1,12};
        System.out.println(majorityElement(a , 2));
    }
    static int majorityElement(int a[], int size)
    {
        // your code here
        Arrays.sort(a);
        if(size == 1){
            return a[0];
        }
        if(size == 2){
            if(a[0] == a[1]){
                return a[0];
            }
        }
        if(size > 3){
            if(a[size/2] == a[size/2 - 1] || a[size/2] == a[size/2 + 1]){
                return a[size/2];
            }
        }

        return -1;
    }
}
