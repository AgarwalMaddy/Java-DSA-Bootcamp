class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0 , n = nums.length ;
        while(i < n){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                swapIndex(nums , i , correctIndex);
            } else {
                i++;
            }
        }
        int[] result = new int[2];
        for(int j = 0 ; j < n ; j++){
            if(j != nums[j] - 1){
                result[0] = nums[j];
                result[1] = j + 1;
            }
        }
        
        return result;
    }
    
    public void swapIndex(int[] arr, int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}