import java.util.Scanner;

public class Enhanced_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a fruit name: ");
        String fruit  = sc.next();

        switch (fruit){
            case "Mango" -> System.out.println("King of Fruits");
            case "Apple" -> System.out.println("An apple a day keeps the doctor away");
            default -> System.out.println("Enter either Mango or Apple");
        }
    }


}
