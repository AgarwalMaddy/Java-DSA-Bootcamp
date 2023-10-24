import java.util.Objects;
import java.util.Scanner;

public class Operations {
    public static int performOperation(int a , int b , String operator){
        int result = 0;
        if(Objects.equals(operator, "+")){
            result = a + b;
        }
        if(Objects.equals(operator, "-")){
            result = a - b;
        }
        if(Objects.equals(operator, "*")){
            result = a * b;
        }
        if(Objects.equals(operator, "/")){
            result = a / b;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String operator = sc.next();
        System.out.println(performOperation(a , b , operator));
    }
}
