class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0 ;
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                swap(nums, i , correctIndex);
            } else{
                i++;
            }
        }
        
        for(int j = 0 ; j < nums.length ; j++){
            if(nums[j] != j + 1)
                return nums[j];
        }
        
        return 0;
    }
    public void swap(int[] arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}