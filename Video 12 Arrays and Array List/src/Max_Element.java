import java.util.Scanner;

public class Max_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Max element in array: " + max(arr1));

        System.out.println("Enter the lower limit of the range: ");
        int lower = sc.nextInt();

        System.out.println("Enter the higher limit of the range: ");
        int higher = sc.nextInt();

        System.out.println("Max element in specified range is: " + maxRange(arr1, lower,higher));
    }

    static int max(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    static int maxRange(int[] arr, int index1 , int index2){
        if(index2 < index1){
            return  -1;
        } else if(arr.length == 0){
           return -1;
        } else {

            int max = arr[index1];
            for (int i = index1; i <= index2; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }
    }
}
