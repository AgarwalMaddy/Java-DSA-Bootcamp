import java.util.*;
public class SmallerAfter {
    public static List<Integer> countSmaller(int[] nums) {
        List<Integer> counts = new ArrayList<>();
        counts.add(nums.length - 1 , 0);
        if(nums.length == 1){
            counts.add(0);
            return counts;
        }
        for(int i = nums.length - 1 ; i >= 0; i--){

        }
        return counts;
    }

    public static void main(String[] args) {
        int[] arr = {5,2,6,1};
        System.out.println(countSmaller(arr));
    }
}
