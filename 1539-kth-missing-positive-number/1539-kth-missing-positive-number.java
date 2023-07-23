class Solution {
    public int findKthPositive(int[] arr, int k) {
      return missingNumber(arr , k);
    }
    public static int  missingNumber(int[] arr , int k){
        int n = arr.length;
        int start = 1;
        int end = arr[n-1] + k;

        int count = 0;

        for(int i = start; i <= end ; i++){
            boolean present = false;
            for(int j = 0 ; j < n ; j++){
                if(i == arr[j]) {
                    present = true;
                    break;
                }
            }
            if(!present){
                count++;
            }
            if(count == k){
                return i;
            }
        }
        return 0;
    }
}