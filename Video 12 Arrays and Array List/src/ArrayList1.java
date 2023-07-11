import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {
        /* Syntax of an Array List
        ArrayList <Wrapper Class> variableName= new ArrayList<>();
        */

        /* ArrayList don't have a specific size.
        You can add as many elements as you want, even after specifying the initial size.
        */
        ArrayList <Integer> list1 = new ArrayList<>(5);

        /* We can directly add elements to the array list using the .add() method

        /* Printing method of an ArrayList is simple */
        System.out.println(list1);

        /* Some other functions that can be used with an ArrayList */

        /* .contains() : a boolean return function */
        System.out.println(list1.contains(12));

        /* .set() : To update any element of an ArrayList */
        list1.set(1,7);
        System.out.println(list1);

        /* .remove() : To delete any element from an ArrayList */
        list1.remove(2);

        /* .get() : To get item at any index */
        System.out.println(list1.get(0));

        /* Taking input in an ArrayList */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number  of elements to be added to the Array List : ");
        int n = sc.nextInt();
        ArrayList <Integer> list2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list2.add(sc.nextInt());
        }

        /* To print the complete ArrayList */
        System.out.println(list2);

        /* To print element wise */
        for (int i = 0; i < n; i++) {
            System.out.println(list2.get(i));
            
        }
    }


}
