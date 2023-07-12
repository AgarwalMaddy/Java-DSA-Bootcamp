import java.util.Scanner;

public class String_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string to check for Palindrome");

        String input = sc.next();
        String temp = input.toLowerCase();
        System.out.println("Lowercase String : " + temp);
        Character last;
        StringBuilder check = new StringBuilder();
        int length = input.length();
        for(int i = length - 1 ; i >= 0 ; i--){
            last = input.charAt(i);
            check.append(last);
            check = new StringBuilder(check.toString().toLowerCase());
        }
        System.out.println("Reversed String: " + check);
        if(check.toString().equals(temp)){
            System.out.println("It is a Palindrome String");
        } else {
            System.out.println("It is not a Palindrome String");
        }
    }
}
