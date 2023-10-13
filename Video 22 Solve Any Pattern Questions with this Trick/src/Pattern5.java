import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        Pattern(n);
    }
    static void Pattern(int n){
        int k = 1;
        for(int i = 1 ; i <= 2*n-1 ; i++){
            if(i <= n){
                for(int j = 1; j <= i ; j++){
                    System.out.print("*");
                }
            }else{
                for(int j = 1; j <= n - k; j++){
                    System.out.print("*");
                }
                k++;
            }
            System.out.println();
        }
    }
}
