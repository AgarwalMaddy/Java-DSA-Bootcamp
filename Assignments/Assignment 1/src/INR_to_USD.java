import java.util.Scanner;

public class INR_to_USD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in INR");
        float inr = sc.nextFloat();
        float usd = inr * 0.0122f;

        System.out.println("The value in USD is : " + usd);
    }
}
