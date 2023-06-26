class Solution {
    public int minCostToMoveChips(int[] position) {
        int evenChips = 0;
        for(int i : position){
            if(i % 2 == 0){
                evenChips++;
            }
        }
        
        return Math.min(evenChips , position.length - evenChips);
    }
}