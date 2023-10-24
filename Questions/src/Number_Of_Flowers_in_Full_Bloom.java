import java.util.*;
import java.util.Comparator;

public class Number_Of_Flowers_in_Full_Bloom {
    public static void main(String[] args) {
        int[][] flowers = {{1,6} , {3,7}, {9,12}, {4,13}};
        int[] persons = {2,3,7,11};
        System.out.println(Arrays.toString(fullBloomFlowers(flowers,persons)));
    }
        public static int[] fullBloomFlowers(int[][] flowers, int[] people) {
            Arrays.sort(flowers, (a, b) -> a[0] - b[0]);
            int n = people.length;
            int[] ans = new int[n];
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < n; i++) {
                if(map.containsKey(people[i])) {
                    ans[i] = map.get(people[i]);
                    continue;
                }

                int low = 0, high = flowers.length - 1;
                int min = -1, max = -1;
                while(low <= high) {
                    int mid = low + (high - low) / 2;
                    if(people[i] >= flowers[mid][0] && people[i] <= flowers[mid][1]){
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }

                min = high;

                low = 0;
                high = flowers.length - 1;
                while(low <= high) {
                    int mid = low + (high - low) / 2;
                    if(people[i] >= flowers[mid][0] && people[i] <= flowers[mid][1]){
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
                max = low;

                ans[i] = (max - min) - 1;
                map.put(people[i], ans[i]);
            }
            return ans;
        }
    }

