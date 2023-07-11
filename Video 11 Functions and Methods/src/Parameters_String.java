import java.util.Scanner;

public class Parameters_String {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(greet(name));
    }

    static String greet(String name){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your greeting message: ");
        String message = in.nextLine();
        return message  + " " + name;
    }
}
