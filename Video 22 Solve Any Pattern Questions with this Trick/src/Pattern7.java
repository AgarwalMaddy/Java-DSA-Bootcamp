import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern7(n);
    }

    public static void pattern7(int n){
        /* *****
            ****
             ***
              **
               *
        */

        for(int i = 1; i <= n ; i++){
            int k = 0;
            for(int j = 1 ; j < i ; j++){
                System.out.print(" ");
                k = j;
            }
            for(k = k + 1; k <= n; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
