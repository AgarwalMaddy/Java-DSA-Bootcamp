import java.util.Scanner;

public class Sum_Method_Int {
    public static void main(String[] args) {
        //Calling function first time
        int output = sum();
        System.out.println(output);

        // Calling function second time
        System.out.println(sum());
    }

    static int sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();

        return num1 + num2;
    }
}
