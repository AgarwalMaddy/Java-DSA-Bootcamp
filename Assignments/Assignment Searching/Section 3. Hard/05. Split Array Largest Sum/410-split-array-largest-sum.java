class Solution {
    public int splitArray(int[] nums, int k) {
        int result = minLargestSum(nums , k);
        return result;
    }
    public int  minLargestSum(int[] nums , int k){
        int start = 0;
        int end = 0;
        for(int num : nums){
            start = Math.max(start , num);
            end += num;
        }
        
        
        while(start < end){
            int pieces = 1;
            int sum = 0;
            int mid = start + (end - start)/2;
            for(int num : nums){
                if(sum + num > mid){
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if(pieces > k){
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
    }
}