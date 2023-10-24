import java.util.HashSet;

public class DistinctDuplicateDifference {
    public static void main(String[] args) {
        int a = -1 , b = 3 , c = 8 , d = -6;
        System.out.println(AddDistinctDuplicate(a , b , c , d));

    }

    public static int AddDistinctDuplicate(int a , int b , int c , int d){
        int distinct_sum = 0 , duplicate = 0;
        if(a == b || a == c || a == d){
            duplicate = a;
        } else {
            distinct_sum += a;
        }
        if(b == a || b == c || b == d){
            duplicate = b;
        } else {
            distinct_sum += b;
        }
        if(c == b || c == a || c == d){
            duplicate = c;
        } else {
            distinct_sum += c;
        }
        if(d == b || d == c || d == a){
            duplicate = d;
        } else {
            distinct_sum += d;
        }
        return distinct_sum - duplicate;
    }
}
