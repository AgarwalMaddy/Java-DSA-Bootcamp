import java.util.ArrayList;
import java.util.List;

public class Operators {
    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        List<Integer> row2 = new ArrayList<>();
        List<Integer> row3 = new ArrayList<>();
        row1.add(11);
        row1.add(2);
        row1.add(4);
        row2.add(4);
        row2.add(5);
        row2.add(6);
        row3.add(10);
        row3.add(8);
        row3.add(-12);

        matrix.add(row1);
        matrix.add(row2);
        matrix.add(row3);
        System.out.println(diagonalDifference(matrix));
    }
    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftSum = 0;
        int rightSum = 0;
        int n = arr.size() - 1;
        for(int i = 0 ; i < arr.size() ; i++){
            leftSum += arr.get(i).get(i);
            rightSum += arr.get(i).get(n-i);
        }
        return rightSum;
    }
}
