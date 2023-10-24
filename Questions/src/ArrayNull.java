import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayNull {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;
        n = 4;
        m = 2;
        List<Integer> change = new ArrayList<>();
        change.add(0);
        change.add(1);
        change.add(0);
        change.add(2);
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
//        for (int i = 0; i < m; ++i) {
//            change.add(scanner.nextInt());
//        }
        for (int i = 0; i < n; ++i) {
            int index = change.get(i);
            arr.set(index, Math.max(arr.get(index) - 1, 0));
        }
        int operations = 0;
        int current_value = Integer.MAX_VALUE;
        for (int i = 1; i <= m; ++i) {
            if (arr.get(i) > 0) {
                if (current_value == Integer.MAX_VALUE) {
                    System.out.println(-1);
                    return;
                }
                operations += current_value - arr.get(i);
            } else {
                current_value = Math.min(current_value, arr.get(i));
            }
        }
        System.out.println(operations);
    }
}