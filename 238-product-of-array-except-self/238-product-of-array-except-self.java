class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefixArray = new int[n];
        prefixArray[0] = 1; //First element doesnot have any prefix.
        for(int i = 1 ; i < n ; i++){
            prefixArray[i] = prefixArray[i-1] * nums[i-1];
        }
        
        int[] sufixArray = new int[n];
        sufixArray[n-1] = 1; // Last element doesnot have any suffix.
        for(int i = n-2 ; i >= 0 ; i--){
            sufixArray[i] = sufixArray[i+1] * nums[i+1]; 
        }
        
        int[] answer = new int[n];
        for(int i = 0 ; i < n ; i++){
            answer[i] = prefixArray[i] * sufixArray[i];
        }
        
        return answer;
    }
}