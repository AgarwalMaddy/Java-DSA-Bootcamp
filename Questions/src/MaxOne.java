import java.util.Stack;

public class MaxOne {
    public static void main(String[] args) {
        int n = 13;
        Stack<Integer> binary = new Stack<>();
        while(n > 0){
            binary.push(n % 2);
            n = n / 2;
        }
        int countOne = 0;
        int maxCount = 0;

        while(!binary.isEmpty()){
            if(binary.pop() == 1){
                countOne++;
                if(maxCount < countOne){
                    maxCount = countOne;
                }
            }else {
                countOne = 0;
            }
        }

        System.out.println(maxCount);
    }
}
