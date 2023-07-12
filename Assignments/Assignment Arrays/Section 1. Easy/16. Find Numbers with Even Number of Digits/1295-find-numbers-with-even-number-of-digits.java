class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i : nums){
            if(checkEven(i)){
                count++;
            }
        }
        return count;
    }
    
    static boolean checkEven(int n){
        int length = (int)(Math.log10(n) + 1);
        if(length % 2 == 0){
            return true;
        }
        return false;
    }
}