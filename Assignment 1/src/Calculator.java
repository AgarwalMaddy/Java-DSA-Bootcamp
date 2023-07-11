import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any operator");

        while (true){
            char operator = sc.next().trim().charAt(0);
            if(operator == '+' || operator == '-' ||operator == '*' || operator == '/'){
                System.out.println("Enter the first number");
                int num1 = sc.nextInt();

                System.out.println("Enter the second number");
                int num2 = sc.nextInt();

                if(operator == '+'){
                    int result = num1 + num2;
                    System.out.println("Sum of the two number is " + result);
                } else if (operator == '-') {
                    int result = num1 - num2;
                    System.out.println("Difference of the two number is " + result);
                } else if (operator == '*') {
                    int result = num1 * num2;
                    System.out.println("Product of the two numbers is " + result);
                } else if (operator == '/') {
                    double result = num1 / num2;
                    System.out.println("Quotient is " + result);
                } else {
                    System.out.println("Please enter valid input");
                }
            } else {
                System.out.println("Enter valid operator");
            }
        }
    }
}
