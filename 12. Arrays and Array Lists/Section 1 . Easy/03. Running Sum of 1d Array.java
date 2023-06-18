// 1480. Running Sum of 1d Array
// https://leetcode.com/problems/running-sum-of-1d-array/description/

class Solution {
    public int[] runningSum(int[] nums) {
        int digitSum = nums[0];
        int[] resultArray = new int[nums.length];
        resultArray[0] = digitSum;

        for(int i = 1 ; i < nums.length ; i++){
            digitSum += nums[i];
            resultArray[i] = digitSum;
        }

        return resultArray;
    }
}
