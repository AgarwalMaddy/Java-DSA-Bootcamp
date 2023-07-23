public class Arranging_Coins {
    public static void main(String[] args) {
        int pivot = 4;
        System.out.println(coins(pivot));
    }

    public static int coins(int n){
        long start = 0;
        long end = n;
        while(start <= end){
            long mid = start + (end -start)/2;
            long coins = mid * (mid + 1)/2;
            if(coins == n){
                return (int)mid;
            } else if(coins > n){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return (int)end;
    }
}
