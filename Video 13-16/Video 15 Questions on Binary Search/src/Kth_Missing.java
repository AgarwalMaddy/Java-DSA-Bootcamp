public class Kth_Missing {
    public static void main(String[] args) {
        int[] arr = {32, 59, 77};
        int k = 1;
        System.out.println(missingNumberGFG(arr , k));
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
    public static int missingNumberGFG(int[] arr , int k){
        int n = arr.length;
        int start = arr[0];
        int end = arr[n-1];
        int count = 0;
        for (int i = start; i < end ; i++) {
            boolean present = false;
            for (int j = 0; j < n; j++) {
                if(i == arr[j]){
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
        return -1;
    }
}
