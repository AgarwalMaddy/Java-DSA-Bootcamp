public class SingleElement {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,1,2,4,6,3};
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = result^ arr[i];
        }

        System.out.println(result);
    }
}
