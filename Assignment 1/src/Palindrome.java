import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input any integer to check for Palindrome");
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        int rem;
        while(temp > 0){
            rem = temp % 10;
            sum = (sum * 10 )+ rem;
            temp = temp / 10;
        }
        System.out.println("After reversing " + sum);
        if(sum == num){
            System.out.println("Input is a Palindrome number");
        } else {
            System.out.println("Input is not a Palindrome number");
        }
    }
}
