class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i = 0 , j = 0 , k = 1;
        int n = nums.length;
        int[] result = new int[n];
        
        while(i < n){
            if(nums[i] % 2 == 0){
                result[j] = nums[i];
                j += 2;
                i++;
            } else {
                result[k] = nums[i];
                k += 2;
                i++;
            }
        }
        
        return result;
    }
}