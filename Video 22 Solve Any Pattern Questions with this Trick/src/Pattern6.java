import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        Pattern(n);
    }
    static void Pattern(int n){
        for(int i = 1 ; i <= n ; i++){
            for (int j = 1; j <= n - i ; j++) {
                System.out.print(" ");
            }
            for(int k = n - i ; k < n ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
