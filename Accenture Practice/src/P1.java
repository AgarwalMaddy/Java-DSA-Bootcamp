import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        System.out.println("The function takes two integrals m and n as arguments. " + "\n" +
                "You are required to obtain the total of all integers ranging between 1 to n (both inclusive) which are not divisible by m. " + "\n" +
                "You must also return the distinction between the sum of integers not divisible by m with the sum of integers divisible by m.");
        System.out.print("Enter the Integer: ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        System.out.print("Enter the Last Value: ");
        int n = sc.nextInt();

        System.out.print("Required Difference : " + differenceOfSum(m , n));

    }

    public static int differenceOfSum(int m , int n){
        int sum1 = 0 , sum2 = 0;
        for(int i = 1 ; i <= n ; i++){
            if(i % m == 0){
                sum1 += i;
            } else{
                sum2 += i;
            }
        }

        return Math.abs(sum1 - sum2);
    }
}
