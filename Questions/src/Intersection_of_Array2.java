import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Intersection_of_Array2 {
    public static void main(String[] args) {
        int[] nums1 = {1};
        int[] nums2 = {1};
        int[] result = intersect(nums1 , nums2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] intersect(int[] nums1 , int[] nums2){
        ArrayList<Integer> list = new ArrayList<>();
        int n1 = nums1.length , n2 = nums2.length;
        HashMap<Integer , Integer> frequency = new HashMap<>();
        if(n1 >= n2){
            for(int i : nums1){
                if(frequency.containsKey(i)){
                    frequency.put(i, frequency.get(i) + 1);
                } else {
                    frequency.put(i , 1);
                }
            }
            for(int i : nums2){
                if(frequency.containsKey(i) && frequency.get(i) > 0){
                    list.add(i);
                    frequency.put(i , frequency.get(i) - 1);
                }
            }
        } else if (n2 > n1) {
            for(int i : nums2){
                if(frequency.containsKey(i)){
                    frequency.put(i, frequency.get(i) + 1);
                } else {
                    frequency.put(i , 1);
                }
            }
            for(int i : nums1){
                if(frequency.containsKey(i)){
                    list.add(i);
                    frequency.put(i , frequency.get(i) - 1);
                }
            }
        }

        int[] result = new int[list.size()];
        for(int i = 0 ; i < list.size(); i++){
            result[i] = list.get(i);
        }

        return result;
    }
}
