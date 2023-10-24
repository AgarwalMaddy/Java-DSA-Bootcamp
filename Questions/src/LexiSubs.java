import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LexiSubs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();

        System.out.println(lexisubstring(s ,k));
    }

    public static String lexisubstring(String s , int k){
        String smallest = "";
        String largest = "";

        ArrayList<String> subs = new ArrayList<>();
        for(int i = 0 ; i < s.length() - 2 ; i++){
            String temp = "";
            temp = s.substring(i, i+3);
            subs.add(temp);
        }

        Collections.sort(subs);
        smallest = subs.get(0);
        largest = subs.get(subs.size() - 1);



        return smallest + "\n" + largest;
    }
}