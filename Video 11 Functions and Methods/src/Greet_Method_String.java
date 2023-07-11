import java.util.Scanner;

public class Greet_Method_String {
    public static void main(String[] args) {
        System.out.println(greeting());
    }

    static String greeting(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");

        return sc.nextLine();
    }
}
