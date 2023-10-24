// You are using Java
import java.util.*;
public class Check_String{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(minOperations(s1 , s2));
    }

    public static int minOperations(String s1 , String s2){
        int len1 = s1.length();
        int len2 = s2.length();

        if(len1 < len2){
            System.out.println("The string cannot be transformed");
        }

        int operations = 0;
        int i = len1 - 1;
        int j = len2 - 1;

        while(i >= 0 && j >= 0){
            if(s1.charAt(i) == s2.charAt(i)){
                i--;
                j--;
            }else{
                i--;
                operations++;
            }
        }

        if(j >= 0){
            System.out.println("The string cannot be transformed");
        }


        return operations;
    }
}
