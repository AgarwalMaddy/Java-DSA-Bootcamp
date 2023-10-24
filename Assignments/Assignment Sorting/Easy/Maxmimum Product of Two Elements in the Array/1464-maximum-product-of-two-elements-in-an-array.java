class Solution {
    public int maxProduct(int[] nums) {
        int maxValue = Integer.MIN_VALUE;
        int product = 0 ;
        for(int i = 0 ; i < nums.length - 1 ; i++){
            for(int j = i + 1; j  < nums.length ; j++){
                product = (nums[i] - 1) * (nums[j] - 1);
                if(product > maxValue){
                    maxValue = product;
                }
            }
        }

        return maxValue;
    }
}