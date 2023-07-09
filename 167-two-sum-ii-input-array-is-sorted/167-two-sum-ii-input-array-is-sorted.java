/* Approach 1: Using Binary Search. Used a for loop to iterate in the array and use it as one of the two elements to find the sum. Then inside for loop used binary search to find if the element we are at fits the requirement to complete the sum or not.*/ 

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        for(int i = 0 ; i < numbers.length ; ++i){
            int start = i + 1;
            int end = numbers.length - 1;
            while(start <= end){
                int mid = start + (end - start)/2;
                if(numbers[mid] == target - numbers[i]){
                    result[0] = i + 1;
                    result[1] = mid + 1;
                    break;
                } else if(numbers[mid] > target - numbers[i]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return result;
        
    }
}