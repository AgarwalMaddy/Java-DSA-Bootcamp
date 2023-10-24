import java.util.ArrayList;

public class SpecificSum {
    public static void main(String[] args) {
        int n = 5;
        int k = 12;
        int[] arr = {1,2,3,8,5};
        System.out.println(targetSum(arr , n , k));
        ArrayList<Integer> result = targetSum(arr , n , k);
        for(int i : result){
            System.out.println(i);
        }

    }
    public static ArrayList<Integer> targetSum(int[] arr , int n , int k){
        ArrayList<Integer> result = new ArrayList<>();
        result.add(-1);
        for (int i = 0; i < n-1; i++) {
            int sum = arr[i];
            for (int j = i + 1; j < n; j++) {
                sum += arr[j];
                if(sum == k){
                    result.remove(0);
                    result.add(i+1);
                    result.add(j+1);
                    return result;
                }
            }
        }
        return result;
    }
}
