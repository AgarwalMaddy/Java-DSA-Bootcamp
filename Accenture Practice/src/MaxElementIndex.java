public class MaxElementIndex {
    public static void main(String[] args) {
        int[] arr = {1,9,11,144,6,7,112,95};
        int[] outputArr = elementIndex(arr);
        for (int i : outputArr){
            System.out.println(i);
        }
    }
    public static int[] elementIndex(int[] arr){
        int[] output = new int[2];
        int maxElement = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = 0 ; i < arr.length ; i++){
            if(arr[i] > maxElement){
                maxElement = arr[i];
                maxIndex = i;
            }
        }

        output[0] = maxElement;
        output[1] = maxIndex;
        return output;
    }
}
