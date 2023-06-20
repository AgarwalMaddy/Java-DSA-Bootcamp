// 1732. Find the Highest Altitude
// https://leetcode.com/problems/find-the-highest-altitude/

class Solution {
    public int largestAltitude(int[] gain) {
        int[] result = new int[gain.length + 1];
        result[0] = 0;
        for(int i = 0 ; i < gain.length; i++){
            result[i + 1] = result[i] + gain[i];
        }
        Arrays.sort(result);
        return result[result.length - 1];
    }
}
