public class SortEvenOdd {
    public int[] sortEvenOdd(int[] nums) {
        int i = 0 , j = 0 , k = 1;
        int n = nums.length;
        int[] result = new int[n];

        while(i < n){
            if(nums[i] % 2 == 0){
                result[j] = nums[i];
                j += 2;
                i++;
            } else {
                result[k] = nums[i];
                k += 2;
                i++;
            }
        }

        for(i = 2 ; i < n ; i += 2){
            if(nums[i-2] > nums[i]){
                swap(nums , i , i+2);
            }
        }
        return  result;

    }

    public void swap(int[] nums , int a , int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
