class Solution {
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length - 1 ; i++){
            int diff = arr[i + 1] - arr[i];
            if(diff < minDiff){
                minDiff = diff;
            }
         }
        for(int i = 0 ; i < arr.length - 1 ; i++){
            List<Integer> rows = new ArrayList<>();
            int j = i + 1;
            if(arr[j] - arr[i] == minDiff){
                rows.add(arr[i]);
                rows.add(arr[j]);
                result.add(rows);
            }
        }
        return result;
    }
} 