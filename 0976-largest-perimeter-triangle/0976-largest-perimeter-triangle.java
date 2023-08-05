class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int maxPeri = 0;
        int currPeri = 0;
        for(int i = 0 ; i < nums.length - 2 ; i++){
            int a = nums[i];
            int b = nums[i + 1];
            int c = nums[i + 2];
            
            if(validTriangle(a , b , c)){
                currPeri = a + b + c;
                if(currPeri > maxPeri){
                    maxPeri = currPeri;
                }
            }
        }
        
        return maxPeri;
    }
    public boolean validTriangle(int a , int b , int c){
        return ((a + b > c) && (a + c > b) && (b + c > a)) ;
    }
}