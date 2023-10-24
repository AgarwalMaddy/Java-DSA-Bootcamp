public class SumOfDigits {
    public static void main(String[] args) {
        int[] arr = {16,18,20};
        System.out.println(DifferenceOfDigits(arr));
    }
    public static int DifferenceOfDigits(int[] arr){
        int digitSum = 0 , valueSum = 0;
        for (int j : arr) {
            digitSum += DigitSum(j);
        }
        digitSum %= 10;
        for(int j : arr){
            valueSum += j;
        }
        valueSum %= 10;
        return digitSum - valueSum;
    }

    public static int DigitSum(int a){
        int sum = 0;
        while(a > 0){
            sum += a % 10;
            a = a / 10;
        }
        return sum;
    }
}
