public class Recursion1 {
    public static void main(String[] args) {
        recursionCheck1(1);
        System.out.println(recursionCheck2(22));

    }
    public static int recursionCheck1(int n){
        System.out.println(n);
        if(n < 3){
            n = n + 2;
            recursionCheck1(recursionCheck1(n));
        }
        return n;
    }

    public static int recursionCheck2(int n){
        if(n <= 45){
            recursionCheck2(recursionCheck2(recursionCheck2(n*5+1)));
        }
        return n * 2;
    }
}
