class Solution {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        for(int i : arr1){
            count[i]++;
        }
        int i = 0;
        for(int num : arr2){
            while (count[num]-- > 0){
                arr1[i++] = num;
            }
        }
        for (int j = 0; j < 1001; j++) {
            while (count[j]-- > 0){
                arr1[i++] = j;
            }
        }
       return arr1;
    }
}