import java.util.*;
public class KthLargest {
    public static void main(String[] args) {
        int n = 6;
        int k = 2;
        int[] arr = {-2,12,-1,1,20,1};
        System.out.println(Arrays.toString(Klargest(arr , k , n)));
    }
    public static int[] Klargest(int[] a, int k, int n) {
        // Write your code
        int[] result = new int[k];
        ArrayList<Integer> temp = new ArrayList<>();
        Arrays.sort(a);
        for(int i = n - 1 ; i > 0 ; i--){
            if(temp.size() < k){
                temp.add(a[i]);
            }
            if(i == 1 && temp.size() < k){
                temp.add(a[0]);
            }
        }

        Collections.sort(temp);
        for(int i = 0 ; i < k ; i++){
            result[i] = temp.get(i);
        }

        return result;
    }
}
