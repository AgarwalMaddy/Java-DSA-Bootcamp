public class Powerof4 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(isPowerOfFour(n));
    }
    public static boolean isPowerOfFour(int n) {
        for(int i = 0 ; i < Math.sqrt(n); i++){
            if(n == Math.pow(4 , i)){
                return true;
            }
        }

        return false;
    }
}
