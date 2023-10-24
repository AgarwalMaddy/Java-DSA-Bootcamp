class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        if(arr.length == 1 || arr.length == 2){
            return true;
        }
        int diff = arr[1] - arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            for (int j = i+1; j < arr.length ; j++) {
                if(diff != (arr[j] - arr[i])){
                    return false;
                }
                i++;
            }
        }
        return true;
        
    }
}