import java.util.Scanner;

public class SI_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is a Simple Interest Calculator");

        System.out.println("Enter the principal amount");
        int p = sc.nextInt();

        System.out.println("Enter the rate of interest");
        int r = sc.nextInt();

        System.out.println("Enter the time period for the interest");
        int t = sc.nextInt();

        int interest = (p * r * t)/100;
        System.out.println("The interest on " + p + "for " + t + " years at " + r + " rate of interest is " + interest );

        int amount = interest + p;
        System.out.println("Total amount to be paid is  " + amount );
    }
}
