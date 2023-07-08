class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefixArray = new int[n];
        prefixArray[0] = 1; //First element doesnot have any prefix.
        for(int i = 1 ; i < n ; i++){
            prefixArray[i] = prefixArray[i-1] * nums[i-1];
        }
        int sufixElement = 1;
        
        int[] answer = new int[n];
        for(int i = n - 1 ; i >= 0 ; i--){
            answer[i] = prefixArray[i] * sufixElement;
            sufixElement *= nums[i];
        }
        
        return answer;
    }
}
