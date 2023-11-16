public class UniqueBinary {
    public static void main(String[] args) {
        String[] arr = {"11", "00"};
        System.out.println(uniqueBinaryString(arr));
    }
    public static String uniqueBinaryString(String[] arr){
        int n = arr.length;
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i < n ; i++){
            String temp = arr[i];
            if(temp.charAt(i) == '0'){
                result.append('1');
            }else{
                result.append('0');
            }
        }
        return result.toString();
    }
}
