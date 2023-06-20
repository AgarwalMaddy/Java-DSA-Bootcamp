// 1431. Kids With the Greatest Number of Candies
// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        for(int  i : candies){
            if(i > max){
                max = i;
            }
        }
        ArrayList<Boolean> list = new ArrayList<>();
        for(int  i : candies){
            if(i + extraCandies >= max){
                list.add(true);
            } else {
                list.add(false);
            }
        }

        return list;
    }
}
