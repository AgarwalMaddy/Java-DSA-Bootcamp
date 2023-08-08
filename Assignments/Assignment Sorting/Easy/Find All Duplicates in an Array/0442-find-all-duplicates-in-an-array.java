class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0 , n = nums.length;
        while(i < n){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                swapIndex(nums, i , correctIndex);
            } else{
                i++;
            }
        }
        
        for(int j = 0 ; j < n ; j++){
            if(j != nums[j] - 1){
                list.add(nums[j]);
            }
        }
        
        return list;
    }
    
    public void swapIndex(int[] nums, int a , int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}