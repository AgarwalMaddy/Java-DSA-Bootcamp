/* Approach 2 : Using the Two Pointer Method. Since it is a sorted array therefore we implement two pointers at start and end and calculate their sum. If the sum if greater than the target we move to left else we move to right. */

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int start = 0;
        int end = numbers.length - 1;
        while(start <= end){
            int sum = numbers[start] + numbers[end];
            if(sum == target){
                result[0] = start + 1;
                result[1] = end + 1;
                break;
            } else if(sum > target){
                end--;
            } else {
                start++;
            }
        }
        
        return result;
    }
}
