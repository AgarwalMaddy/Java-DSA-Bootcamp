class Solution {
    public static int[] intersection(int[] nums1 , int[] nums2){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i< nums1.length; i++){
            int element = nums1[i];
            for(int j = 0 ; j < nums2.length ; j++){
                if(element == nums2[j]){
                    if(!list.contains(element)){
                        list.add(element);
                    }
                }
            }
        }
        int[] result = new int[list.size()];
        for(int i = 0 ; i < list.size() ; i++){
            result[i] = list.get(i);
        }

        return result;
    }
}