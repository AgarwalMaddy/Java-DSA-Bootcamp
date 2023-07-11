import java.util.Scanner;

public class Parameters_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.println("The sum is: " + sum(num1, num2));
    }

    static int sum(int a, int b){
        return a + b;
    }
}
