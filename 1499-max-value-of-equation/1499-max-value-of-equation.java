class Solution {
    public static int findMaxValueOfEquation(int[][] points, int k) {
        int value = Integer.MIN_VALUE;
        int modValue = 0;
        int maxValue = Integer.MIN_VALUE;
        int i = 0 ; int flag = 1;
        while(i < points.length){
            if(flag < i+1){
                flag = i + 1;
            }
            for(int j = flag ; j < points.length ; j++){
                modValue = points[j][0] - points[i][0];
                if(modValue > k){
                    break;
                }
                value = points[i][1] + points[j][1] + modValue;
                if(value > maxValue){
                    maxValue = value;
                    flag = j - 1;
                }
            }
            i++;
        }

        return maxValue;
    }
}