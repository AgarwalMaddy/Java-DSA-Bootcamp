// 1389. Create Target Array in the Given Order
// https://leetcode.com/problems/create-target-array-in-the-given-order/description/

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] result = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            list.add(index[i] , nums[i]);
        }
        for(int i = 0 ; i < list.size() ; i++){
            result[i] = list.get(i);
        }
        return result;
    }
}
