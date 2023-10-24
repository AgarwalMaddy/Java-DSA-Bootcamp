import java.util.HashMap;

public class UniqueSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1,4,5,6};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int j : arr) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }


        System.out.println(map.get(0));
    }
}
