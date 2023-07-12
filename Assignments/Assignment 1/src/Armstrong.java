import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check for Armstrong Number");
        int num = sc.nextInt();
        int temp = num;
        int rem;
        int digits = 0;
        int product = 0;
        while(temp > 0){
            temp = temp / 10;
            digits++;
        }
        System.out.println("Number of digits " + digits );
        temp = num;
        while(temp > 0){
            rem = temp % 10;
            product += (Math.pow(rem, digits));
            temp = temp / 10;
        }
        System.out.println("Armstrong Value " + product);

        if(product == num){
            System.out.println("Input is an Armstrong number");
        } else {
            System.out.println("Input is not an Armstrong number");
        }
    }
}
