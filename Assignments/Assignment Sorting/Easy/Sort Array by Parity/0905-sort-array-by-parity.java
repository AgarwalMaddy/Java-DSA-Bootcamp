class Solution {
    public static int[] sortArrayByParity(int[] nums) {
        int i = 0 , j = 0 , k = 0;
        int[] result = new int[nums.length];
        while(i < nums.length){
            if(nums[i] % 2 == 0){
                result[j] = nums[i];
                j++;
                i++;
            } else{
                result[nums.length - k - 1] = nums[i];
                k++;
                i++;
            }
        }

        return result;
    }
}