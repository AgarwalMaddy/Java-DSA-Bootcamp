public class KthSymbolinGrammar {
    public static void main(String[] args) {
        int n = 5;
        int k = 8;
        System.out.println(kthGrammar(n,k));
    }
    public static int kthGrammar(int n, int k) {
        if(n == 1){
            return 0;
        }

        int length = 1 << (n - 2);
        if(k <= length){
            return kthGrammar(n - 1 , k);
        }else{
            return 1 - kthGrammar(n - 1, k - length);
        }
    }
}
