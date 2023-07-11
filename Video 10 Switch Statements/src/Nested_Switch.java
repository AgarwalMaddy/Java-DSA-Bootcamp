import java.util.Scanner;

public class Nested_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        String query = sc.next();

        switch (id){
            case 1:
                System.out.println("You are viewing the first employee.");
                switch(query){
                    case "Name" :
                        System.out.println("Madhur Agarwal");
                        break;
                    case "Department" :
                        System.out.println("Software Development Department");
                        break;
                    default:
                        System.out.println("Either Name or Department");
                }
            break;
            case 2:
                System.out.println("You are viewing the second employee.");
                switch(query){
                    case "Name" :
                        System.out.println("Sparsh Jain");
                        break;
                    case "Department":
                        System.out.println("Machine Learning Model Development Department");
                        break;
                    default:
                        System.out.println("Either Name or Department");
                }
            break;
            case 3:
                System.out.println("You are viewing the third employee.");
                switch(query){
                    case "Name" :
                        System.out.println("Pranjal Singhal");
                        break;
                    case "Department":
                        System.out.println("Machine Learning Model Development Department");
                        break;
                    default:
                        System.out.println("Either Name or Department");
                }
            break;
            default:
                System.out.println("This Emp ID doesn't exist in our records.");
        }

        // Enhanced version
        switch (id) {
            case 1 -> {
                System.out.println("You are viewing the first employee.");
                switch (query) {
                    case "Name" -> System.out.println("Madhur Agarwal");
                    case "Department" -> System.out.println("Software Development Department");
                    default -> System.out.println("Either Name or Department");
                }
            }
            case 2 -> {
                System.out.println("You are viewing the second employee.");
                switch (query) {
                    case "Name" -> System.out.println("Sparsh Jain");
                    case "Department" -> System.out.println("Machine Learning Model Development Department");
                    default -> System.out.println("Either Name or Department");
                }
            }
            case 3 -> {
                System.out.println("You are viewing the third employee.");
                switch (query) {
                    case "Name" -> System.out.println("Pranjal Singhal");
                    case "Department" -> System.out.println("Machine Learning Model Development Department");
                    default -> System.out.println("Either Name or Department");
                }
            }
            default -> System.out.println("This Emp ID doesn't exist in our records.");
        }
    }
}
