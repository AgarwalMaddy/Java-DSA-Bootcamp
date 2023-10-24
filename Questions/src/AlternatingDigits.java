public class AlternatingDigits {
    public static void alternateDigitSum(int n) {
        String num = Integer.toString(n);
        int sum = 0;
        for(int i = 0; i < num.length(); i++){
            if(i % 2 == 0){
                int A = num.charAt(i) - '0';
                sum += A;
            } else {
                int A = ((num.charAt(i) - '0' )* -1);
                sum += A;
            }
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        int n = 521;
        alternateDigitSum(n);
    }
}
