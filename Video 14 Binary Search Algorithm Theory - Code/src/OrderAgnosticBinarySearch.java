public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] A = {-18, -12, -6, -4, 0, 1, 4, 7, 10, 12, 23, 34, 45, 67};
        int element1 = -12;
        int element2 = 4;
        int element3  = 45;
        int element4 = 100;

        System.out.println(orderAgnosticBS(A , element1));
        System.out.println(orderAgnosticBS(A , element2));
        System.out.println(orderAgnosticBS(A , element3));
        System.out.println(orderAgnosticBS(A , element4));

        int[] B = {90, 89, 78, 67, 56, 45, 34, 23, 12, 1, -12, -23, -34};
        int element5 = -12;
        int element6 = 34;
        int element7  = 12;
        int element8 = 100;

        System.out.println(orderAgnosticBS(B , element5));
        System.out.println(orderAgnosticBS(B , element6));
        System.out.println(orderAgnosticBS(B , element7));
        System.out.println(orderAgnosticBS(B , element8));

    }

    static int orderAgnosticBS(int[] arr , int target){

        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

      while(start <= end){

          int mid = start + (end - start)/2;
          if(target == arr[mid]){
              return mid;
          }

          if(isAsc){
              if(target < arr[mid]){
                  end = mid - 1;
              } else {
                  start = mid  + 1;
              }
          } else {
              if(target > arr[mid]){
                  end = mid - 1;
              } else {
                  start = mid + 1;
              }
          }
      }

        return -1;
    }
}