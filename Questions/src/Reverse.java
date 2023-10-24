import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int n = -123;
        int temp = 0;
        if(n < 0){
            n = n * -1;
            while(n > 0){
                temp = temp * 10 + (n % 10);
                n = n / 10;
            }
        }

        System.out.println(temp * -1);
    }
}
