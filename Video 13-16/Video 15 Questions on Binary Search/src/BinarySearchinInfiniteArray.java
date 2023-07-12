import java.util.Scanner;

public class BinarySearchinInfiniteArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target element: ");
        int target = sc.nextInt();
        int[] indexes = bounds(arr, target);
        System.out.println("First Occurence of Target " + startIndex(arr , target , indexes));
        System.out.println("Last Occurence of Target " + endIndex(arr , target , indexes));

    }
    public static int[] bounds(int[] arr , int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int temp = end + 1;
            end += (end-start + 1)*2;
            start = temp;
        }
        int[] indexes;
        indexes = new int[]{start , end};
        return indexes;
    }

    public static int startIndex(int[] arr , int target ,int[] indexes){
        int start = indexes[0];
        int end = indexes[1];
        int result = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                result = mid;
                end = mid - 1;
            } else if(arr[mid] > target){
                end = mid-1;
            } else {
                start = mid + 1;
            }
        }

        return result;
    }

    public static int endIndex(int[] arr , int target ,int[] indexes){
        int start = indexes[0];
        int end = indexes[1];
        int result = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                result = mid;
                start = mid + 1;
            } else if(arr[mid] > target){
                end = mid-1;
            } else {
                start = mid + 1;
            }
        }

        return result;
    }


}
