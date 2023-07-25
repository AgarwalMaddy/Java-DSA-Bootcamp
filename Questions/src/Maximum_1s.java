public class Maximum_1s {
    public static void main(String[] args) {
        int[] arr = {0,1};
        int count = 0;
        int maxCount = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1){
                count++;
                maxCount = Math.max(maxCount,count);
            }
            else{
                count = 0;
            }
        }

        System.out.println(maxCount);
    }
}
