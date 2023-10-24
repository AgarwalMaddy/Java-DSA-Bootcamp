import java.util.*;
public class minimum_number_of_operations_to_make_array_continuous {
    public static void main(String[] args) {
        int[] nums = {8,5,9,9,8,4};
        System.out.println(minOperations(nums));

    }
    public static int minOperations(int[] nums) {
        int n = nums.length;
        int ans=n;
        Arrays.sort(nums);
        int m=1;
        int j=0;
        for(int i=1;i<n;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                nums[m]=nums[i];
                m++;
            }
        }
        for(int i=0;i<m;i++)
        {
            while(j<m && nums[j]<nums[i]+n)
            {
                j++;
            }
            ans = Math.min(ans, n-j+i);
        }
        return ans;

    }
}
