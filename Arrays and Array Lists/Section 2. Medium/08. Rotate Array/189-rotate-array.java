class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverseArray(arr, 0 , n-k-1);
        reverseArray(arr, n-k , n-1);
        reverseArray(arr , 0 , n-1);
    }
    
    public static int[] reverseArray(int arr[] , int start , int end){
        int temp = 0;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}