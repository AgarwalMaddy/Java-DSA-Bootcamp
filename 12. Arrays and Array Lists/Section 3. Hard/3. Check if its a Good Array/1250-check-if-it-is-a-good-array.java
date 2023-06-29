class Solution {
    public boolean isGoodArray(int[] nums) {
        int x = nums[0] , y;
        for(int i : nums){
            while(i > 0){
                y = x % i;
                x = i;
                i = y;
            }
        }
        
        return x == 1;
    }
}