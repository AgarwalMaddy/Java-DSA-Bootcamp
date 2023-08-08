class Solution {
    public int maxProduct(int[] nums) {
        int product = 1;
        int maxProduct = Integer.MIN_VALUE;
        int i = 0;
        while(i < nums.length){
            product *= nums[i];
            if(product > maxProduct){
                maxProduct = product;
            }
            if(product == 0){
                product = 1;
            }
            i++;
        }
        product = 1;
        int j = nums.length - 1;
        while(j > 0){
            product *= nums[j];
            if(product > maxProduct){
                maxProduct = product;
            }
            if(product == 0){
                product = 1;
            }
            j--;
        }
        
        return maxProduct;
    }
}