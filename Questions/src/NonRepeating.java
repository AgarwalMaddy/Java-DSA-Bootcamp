import java.util.HashMap;

public class NonRepeating {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2};
        System.out.println(unique(arr));
    }
    public static int unique(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }
        for(int i = 0 ; i < map.size(); i++){
            if(map.get(arr[i]) == 1){
                return arr[i];
            }
        }
        return -1;
    }
}
