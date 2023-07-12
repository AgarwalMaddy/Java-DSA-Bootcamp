public class Minimum_Element {
    public static void main(String[] args) {
        int[] A = {12,4,131,12,433,7653,342,5,36,6};
        System.out.println(min(A));
    }

    static int min(int[] arr){
        if(arr.length == 0){
            System.out.println("Array NOT Exists");
        }
        int minElement = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < minElement){
                minElement = arr[i];
            }
        }
        return  minElement;
    }
}
