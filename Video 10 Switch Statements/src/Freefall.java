import java.util.Scanner;

public class Freefall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Basic Freefall Switch Statement
        switch (n){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("It's a weekday");
                break;
            case 6:
            case 7:
                System.out.println("It's a weekend");
                break;
            default:
                System.out.println("Week consists of 7 days only");
        }

        // Enhanced Freefall Switch Statement
        switch (n) {
            case 1, 2, 3, 4, 5 -> System.out.println("It's a weekday");
            case 6, 7 -> System.out.println("It's a weekend");
            default -> System.out.println("Week consists of 7 days only");
        }
    }
}
