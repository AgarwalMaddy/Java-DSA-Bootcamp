public class SumOfXORofAllPairs {
    public static void main(String[] args) {
        int[] arr = {5,9,7,6};
        System.out.println(sumOfXor(arr, 4));
    }

    public static long sumOfXor(int[] arr , int n){
        int start = 0; long xor = 0;
        int i = start + 1;
        while(i < n){
            xor += arr[start] ^ arr[i];
            if(i == n - 1){
                start+= 1;
                i = start + 1;
            }else {
                i++;
            }
        }

        return xor;
    }
}
