public class NumberOfCards {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(cardsPyramid(n));
    }
    public static int cardsPyramid(int n){
        int numberOfCards = (n * (3 * n + 1))/2;
        return numberOfCards % 1000007;
    }
}
