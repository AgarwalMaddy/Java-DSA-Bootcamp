import java.util.*;
public class SubarrayWithSum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here
        ArrayList<Integer> indexes = new ArrayList<>();
        int sum = arr[0];
        int leftIndex = 1;
        int rightIndex = n-1;
        int counter = 0;
        for(int i = leftIndex ; i < n ; i++){
            sum += arr[i];
            if(sum > s){
                sum = 0;
                leftIndex += 1;
                counter++;
                i = counter-1;
            } else if(sum == s){
                rightIndex = i+1;
                break;
            } else {
                continue;
            }
        }

        if(leftIndex < rightIndex){
            indexes.add(leftIndex);
            indexes.add(rightIndex);
        } else
            indexes.add(-1);

        return indexes;
    }

    public static void main(String[] args) {
        int n = 5;
        int s = 12;
        int[] arr = {1,2,3,8,6};
        System.out.println(subarraySum(arr , n ,s));

    }
}
