public class Search_in_a_Range {
    public static void main(String[] args) {
        int[] A = {12,1,3,14,41,14214};
        int target = 14;
        int startIndex = 1;
        int endIndex = 5;

        System.out.println(linearSearch(A,target,startIndex,endIndex));
    }

    static boolean linearSearch(int[] arr , int target , int start , int end){
        if(arr.length == 0){
            System.out.println("No Array Exists");
        }

        for(int i = start ; i <= end ; i++){
            if(arr[i] == target){
                return  true;
            }
        }

        return  false;
    }
}
