import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value: ");
        int a = sc.nextInt();
        System.out.print("Enter the value to perform shift by: ");
        int b = sc.nextInt();

        int lsCheck = leftShift(a, b);
        System.out.println("Left Shift Value: " + lsCheck);
        int rsCheck = rightShift(a,b);
        System.out.println("Right Shift Value:" + rsCheck);
        if(lsCheck == (a * Math.pow(2,b))){
            System.out.println("Left Shift Doubles the Value");
        }

        if(rsCheck == (a / (int)(Math.pow(2 , b)))){
            System.out.println("Right Shift Divides by Power of 2.");
        }
    }

    public static int leftShift(int a , int b){
        return a << b;
    }

    public static int rightShift(int a, int b){
        return a >> b;
    }
}
