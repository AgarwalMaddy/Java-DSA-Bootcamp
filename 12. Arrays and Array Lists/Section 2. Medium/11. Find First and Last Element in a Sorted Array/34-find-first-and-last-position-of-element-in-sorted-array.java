class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] resultArray = new int[2];
        resultArray[0] = startIndex(nums , n , target);
        resultArray[1] = endIndex(nums, n , target);
        return resultArray;
    }
    
    public int startIndex(int[] nums, int n , int target){
        int start = 0;
        int end = n - 1;
        int result = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                result = mid;
                end = mid - 1;
            } else if(nums[mid] > target){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        return result;
    }
     public int endIndex(int[] nums, int n , int target){
        int start = 0;
        int end = n - 1;
        int result = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                result = mid;
                start = mid + 1;
            } else if(nums[mid] > target){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        return result;
    }
}