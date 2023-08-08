class Solution {
    public int missingNumber(int[] nums) {
        return cycleSort(nums);
    }
    public static int cycleSort(int[] arr){
        int n = arr.length;
        int i = 0;
        while(i < n){
            if(arr[i] < n && arr[i] != i){
                swap(arr, i , arr[i]);
            } else {
                i++;
            }
        }
        int j = 0;
        while(j < n){
            if(j != arr[j]){
                return j;
            } else{
                j++;
            }
        }
        return n;
    }

    public static void swap(int[] arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}