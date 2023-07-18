import java.util.ArrayList;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args)
    {
        //    Write your code here.
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(151,151,167,224,224,227,227,300,300,329,329,392,392,468,468,538,538,583,583,665,665,688,688,710,710,768,768,861,861,937,937,938,938,942,942,1004,1004,1006,1006,1062,1062,1065,1065,1148,1148,1237,1237,1255,1255,1288,1288,1358,1358,1380,1380,1457,1457,1526,1526,1552,1552,1587,1587,1629,1629,1675,1675,1694,1694,1734,1734,1814,1814,1902,1902,1952,1952,2019,2019,2113,2113,2211,2211,2298,2298));
        System.out.println(binarySearch(arr));
    }

    public static int binarySearch(ArrayList<Integer> arr){
        int n = arr.size();
        if(n == 1){
            return arr.get(0);
        } else if(arr.get(0) != arr.get(1)){
            return arr.get(0);
        } else if(arr.get(n-1) != arr.get(n-2)){
            return arr.get(n-1);
        } else{
            int start = 1;
            int end = n-2;
            while(start <= end){
                int mid = start + (end - start)/2;
                if(arr.get(mid) != arr.get(mid-1) && arr.get(mid) != arr.get(mid +1)){
                    return arr.get(mid);
                } else if((mid % 2 == 0 && arr.get(mid) == arr.get(mid -1))||(mid % 2 == 1 && arr.get(mid) == arr.get(mid + 1))){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}