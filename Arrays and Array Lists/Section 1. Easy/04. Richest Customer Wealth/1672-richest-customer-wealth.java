class Solution {
    public int maximumWealth(int[][] accounts) {
        int result = Integer.MIN_VALUE;
        for(int[] arr : accounts){
            int sum = 0;
            for(int i : arr){
                sum += i;
            }
            if(sum > result){
                result = sum;
            }
        }
        return result;
    }
}