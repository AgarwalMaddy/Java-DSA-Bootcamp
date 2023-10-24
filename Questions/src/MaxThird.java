import java.util.*;
public class MaxThird {
    public static void main(String[] args) {
        int[] nums = {2,3,2,1};
        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums){
        Arrays.sort(nums);
        int count = 0;
        int ans = nums[nums.length-1];
        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] < ans){
                count++;
                ans = nums[i];
            }
            if(count == 2){
                return ans;
            }
        }

        return nums[nums.length-1];
    }
}
