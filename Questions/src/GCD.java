import java.util.*;
public class GCD {
    public static int findGCD(int[] nums, int k) {
        int count = 0;
        for(int i = 0 ; i < nums.length - 1; i++){
            int j = i + 1;
            if(fGCD(nums[i] , nums[j]) == k) {
                count++;
            }
            if(fGCD(nums[j] , 0) == k){
                count++;
            }
        }
        return count;
    }
    public static int fGCD(int a , int b){
        if(a == 0){
            return b;
        }
        if(b == 0){
            return a;
        }

        if(a == b){
            return a;
        }
        if(a > b){
           return fGCD(a-b , b);
        }

        return fGCD(a , b - a);
    }

    public static void main(String[] args) {
        int[] arr = {4};
        System.out.println(findGCD(arr , 4));
    }
}
