public class BinarySearch {
    public static void main(String[] args) {
        int[] A = {-18, -12, -6, -4, 0, 1, 4, 7, 10, 12, 23, 34, 45, 67};
        int element1 = -12;
        int element2 = 4;
        int element3  = 45;
        int element4 = 100;

        System.out.println(searchIndex(A , element1));
        System.out.println(searchIndex(A , element2));
        System.out.println(searchIndex(A , element3));
        System.out.println(searchIndex(A , element4));
    }

    static int searchIndex(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start +  (end - start) / 2 ;

            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
