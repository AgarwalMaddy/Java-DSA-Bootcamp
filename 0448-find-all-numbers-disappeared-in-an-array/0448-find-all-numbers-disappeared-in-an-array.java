class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length , i = 0;
        while(i < n){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                swap(nums, i , correctIndex);
            } else {
                i++;
            }
        }
        
        for(int j = 0 ; j < n ; j++){
            if(nums[j] != j+1){
                list.add(j+1);
            }
        }
        
        return list;
    }
    
    public void swap(int[] arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}