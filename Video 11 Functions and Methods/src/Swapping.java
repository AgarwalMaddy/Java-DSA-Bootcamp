import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2 : ");
        int num2 = sc.nextInt();

        System.out.println(swap(num1 , num2));
    }

    static String swap(int num1 , int num2){
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        return "Swapped values are " + num1 + " " + num2;
    }
}
