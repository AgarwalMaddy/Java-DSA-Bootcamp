class Solution {
    public static int[] intersection(int[] nums1 , int[] nums2){
        Arrays.sort(nums2);
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums1){
            if(binarySearch(nums2 , num)){
                set.add(num);
            }
        }
        int i = 0;
        int[] result = new int[set.size()];
        for(int num : set){
            result[i] = num;
            i++;
        }
        
        return result;
    }
    
    public static boolean binarySearch(int[] nums , int target){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return true;
            } else if(nums[mid] < target){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}
