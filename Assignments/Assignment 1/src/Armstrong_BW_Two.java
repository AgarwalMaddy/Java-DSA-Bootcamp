import java.util.Scanner;

public class Armstrong_BW_Two {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower limit: ");
        int lower = sc.nextInt();
        System.out.println("Enter the higher limit: ");
        int higher = sc.nextInt();


        for(int i = lower; i <= higher; i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }

    static int digitCount(int i){
        int temp = i;
        int digits = 0;
        while(temp > 0){
            int rem = temp % 10;
            digits++;
            temp = temp / 10;
        }
        return digits;
    }

    static boolean isArmstrong(int i) {
        int temp = i;
        double sum = 0;

        while(temp > 0){
           int rem = temp %  10;
           temp = temp / 10;
           int nDigits = digitCount(i);
           double cube = Math.pow(rem , nDigits);
           sum += cube;
        }

        return sum == i;
    }
}
