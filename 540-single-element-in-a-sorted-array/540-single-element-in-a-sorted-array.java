class Solution {
    public int singleNonDuplicate(int[] nums) {
        return binarySearch(nums);
    }
    public int binarySearch(int[] nums){
        int n = nums.length;
        if(n == 1){
            return nums[0];
        } else if(nums[0] != nums[1]){
            return nums[0];
        } else if(nums[n-1] != nums[n-2]){
            return nums[n-1];
        } else {
            int start = 1;
            int end = n - 2;
            while(start <= end){
                int mid = start + (end-start)/2;
                if(nums[mid] != nums[mid + 1] && nums[mid] != nums[mid-1]){
                    return nums[mid];
                } else if((mid % 2 == 0 && nums[mid] == nums[mid - 1]) || mid % 2 == 1 && nums[mid] ==  nums[mid + 1]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        
        return -1;
    }
}