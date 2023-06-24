class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int rightElement = 1;
        int leftElement = -1;
        int mid = n / 2;
        if(n % 2 != 0){
            for(int i = mid + 1 ; i < n ; i++){
                result[i] =  rightElement++;
            }
            for(int i = mid - 1 ; i >= 0 ; i--){
                result[i] = leftElement--;
            }
        } else {
            for(int i = mid ; i < n ; i++){
                result[i] = rightElement++;
            } 
            for(int i = mid - 1; i>= 0 ; i--){
                result[i] = leftElement--;
            }
        }
        
        return result;
    }
}