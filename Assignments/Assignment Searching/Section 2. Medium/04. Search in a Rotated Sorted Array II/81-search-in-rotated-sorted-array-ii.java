class Solution {
    public boolean search(int[] nums, int target) {
        int pivot = pivotElement(nums);
        int result = -2;
        if(pivot == -1){
            result = binarySearch(nums , target , 0 , nums.length - 1);
            if(result != -1){
                return true;
            } else {
                return false;
            }
        }
        if(nums[pivot] == target){
            return true;
        }
        if(target >= nums[0]){
            result = binarySearch(nums , target , 0 , pivot - 1);
            if(result != -1){
                return true;
            } else {
                return false;
            }
        }
        
        result = binarySearch(nums , target , pivot + 1 , nums.length - 1);
        if(result != -1){
            return true;
        } 
        return false;
    }
    
    public int binarySearch(int[] nums, int target , int start , int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] > target){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    
    public int pivotElement(int[] nums){
        int start = 0 ;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid < end && nums[mid] > nums[mid + 1]){
                return mid;
            } else if(mid > start && nums[mid] < nums[mid-1]){
                return mid - 1;
            }
            
            if(nums[start] == nums[mid] && nums[mid] == nums[end]){
                if(mid > start && nums[start] > nums[start + 1]){
                    return start;
                }
                start++;
                if(mid < end && nums[end] < nums[end - 1]){
                    return end-1;
                }
                end--;
            } else if(nums[mid]>nums[start]||nums[mid]==nums[start]&&nums[mid] > nums[end]){
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }
        return -1;
    }
}