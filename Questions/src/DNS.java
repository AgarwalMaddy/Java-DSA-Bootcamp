import java.util.*;

public class DNS {
    public static void main(String[] args) {
        int cache_size = 3;
        int cache_time = 2;
        int server_time = 5;
        List<String> urls = List.of(
                "http:www.hackerrank.com",
                "http:www.google.com",
                "http:www.gmail.com",
                "http:www.yahoo.com",
                "http:www.hackerrank.com",
                "http:www.gmail.com"
        );
        ArrayList<Integer> result = new ArrayList<>();
        Map<String, Integer> cache = new HashMap<>();
        LinkedList<String> cacheOrder = new LinkedList<>();
        int total_time = 0;
        for (String url : urls) {
            if (cache.containsKey(url)) {
                total_time += cache_time;
                result.add(total_time);
                total_time = 0;
            } else {
                total_time += server_time;
                result.add(total_time);
                total_time = 0;
                if (cache.size() >= cache_size) {
                    String toRemove = cacheOrder.removeFirst();
                    cache.remove(toRemove);
                }
                cacheOrder.addLast(url);
                cache.put(url, 1);
            }
        }
//        int[] result = new int[urls.size()];
//        for (int i = urls.size() - 1; i >= 0; --i) {
//            if (cache.containsKey(urls.get(i))) {
//                result[i] -= cache_time;
//            }
//        }
//        for (int time : result) {
//            System.out.print(time + " ");
//        }
        System.out.println(result);
    }
}