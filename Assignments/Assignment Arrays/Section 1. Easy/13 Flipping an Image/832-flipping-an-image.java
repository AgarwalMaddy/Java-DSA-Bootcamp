class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] arr : image){
            int start = 0;
            int end = arr.length - 1;
            while(end > start){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            for(int i = 0 ; i < arr.length ; i++){
                if(arr[i] == 0){
                    arr[i] = 1;
                } else if(arr[i] == 1){
                    arr[i] = 0;
                }
            }
        }
        
        return image;
    }
}