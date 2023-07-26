public class Special_Array {
    public static int specialArray(int[] nums) {
        int n = nums.length;
        int count;
        for(int i = 0 ; i <= n ; i++){
            count = 0;
            for(int j = 0 ; j < n ; j++){
                if(nums[j] >= i){
                    count++;
                }
            }
            if(count == i){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3,5};
        int[] arr1 = {0,0};
        int[] arr2 = {0,4,3,0,4};

        System.out.println(specialArray(arr2));
    }
}
