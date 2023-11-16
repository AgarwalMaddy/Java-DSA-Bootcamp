import java.util.ArrayList;
import java.util.List;

public class Occurence{

    public static int sumNumbersWithSetBits(int n, int set) {
        if (set < 0 || set > n) {
            return 0; // Invalid input
        }

        List<String> combinations = generateCombinations(n, set);
        int sum = 0;

        for (String binaryStr : combinations) {
            int decimalValue = Integer.parseInt(binaryStr, 2);
            sum += decimalValue;
        }

        return sum;
    }

    private static List<String> generateCombinations(int n, int set) {
        List<String> combinations = new ArrayList<>();
        generateCombinationsHelper(combinations, "", n, set);
        return combinations;
    }

    private static void generateCombinationsHelper(List<String> combinations, String current, int n, int set) {
        if (n == 0) {
            if (set == 0) {
                combinations.add(current);
            }
            return;
        }

        if (set > 0) {
            generateCombinationsHelper(combinations, current + "1", n - 1, set - 1);
        }
        generateCombinationsHelper(combinations, current + "0", n - 1, set);
    }

    public static void main(String[] args) {
        int n = 3; // Number of bits
        int set = 2; // Number of set bits
        int result = sumNumbersWithSetBits(n, set);
        System.out.println("Sum of numbers with " + set + " set bits in " + n + " bits is: " + result);
    }
}
