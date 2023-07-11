import java.util.ArrayList;
import java.util.Scanner;

public class Multidimensional_Array_List {
    public static void main(String[] args) {
        /* Declaration of multidimensional ArrayList */
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        /* Initialization of multidimensional ArrayList */
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        /* Taking input in the multidimensional ArrayList */
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }

        /* Printing out the ArrayList */
        System.out.println(list);

    }
}
