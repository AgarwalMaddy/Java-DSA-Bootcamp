import java.util.HashSet;

public class CommonSuperSequence {
    public static void main(String[] args) {
        String X = "abcd";
        String Y = "xycd";
        int m = X.length();
        int n = Y.length();
        System.out.println(superSequence(X , Y , m , n));
    }

    public static int superSequence(String X , String Y, int m , int n){
        String combined = X + Y;
        HashSet<Character> unique = new HashSet<>();
        for(char c : combined.toCharArray()){
            unique.add(c);
        }

        return unique.size();
//        return combined.length();
    }
}
