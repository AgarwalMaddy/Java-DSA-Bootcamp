import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        pattern8(5);
    }

    public static void pattern8(int n){
        for(int i= 1 ; i <= n ; i++){
            int totalCol = n * 2 - 1;
            int space = n - i;
            for(int j = 0 ; j < space; j++){
                System.out.print(" ");
            }

            for(int j = 0; j < i ; j++){
                System.out.print("*");
            }

            for(int j = 0 ; j < space; j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
