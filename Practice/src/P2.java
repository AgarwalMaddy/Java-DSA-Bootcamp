import java.util.*;
public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.next();
        int a = 0, b = 0;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (arr[i].equals("white")) {
                if (!flag)
                    flag = true;
            } else {
                if (flag) {
                    a++;
                    flag = false;
                }
            }
        }
        if (flag)
            a++;
        flag = false;
        for (int i = 0; i < n; i++) {
            if (arr[i].equals("red")) {
                if (!flag)
                    flag = true;
            } else {
                if (flag) {
                    b++;
                    flag = false;
                }
            }
            if (flag)
                b++;
        }
        System.out.println(Math.min(a + 1, b + 1));
    }
}