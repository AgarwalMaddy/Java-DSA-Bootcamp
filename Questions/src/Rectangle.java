import java.util.*;
public class Rectangle {
    public static int countGoodRectangles(int[][] rectangles) {
        ArrayList<Integer> squares = new ArrayList<>();
        for(int[] arr : rectangles){
            squares.add(Math.min(arr[0] , arr[1]));
        }


        Collections.sort(squares);
        int count = 0;
        int max = squares.get(squares.size()-1);
        for(int i = 0 ; i < squares.size(); i++){
            if(squares.get(i) == max){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] rectangle = {{5,8},
                             {3,9},
                             {5,12},
                             {16,5}};
        System.out.println(countGoodRectangles(rectangle));
    }
}
