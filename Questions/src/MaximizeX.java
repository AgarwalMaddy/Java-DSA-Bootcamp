public class MaximizeX {

    public static int maximizeX(int x, int y, int z, int s) {
        // Calculate the maximum value that can be added to x
        int maxAdd = Math.min(y, z);

        // Calculate the maximum value that can be subtracted from x
        int maxSubtract = Math.min(x - 1, z - maxAdd);

        // Calculate the remaining operations
        int remainingOps = z - (maxAdd + maxSubtract);

        // Distribute remaining operations to maximize x without exceeding s
        int maxAddToX = Math.min(remainingOps, s - maxAdd);
        int maxSubtractFromX = remainingOps - maxAddToX;
        // Calculate the maximum value of x
        int maxX = x + maxAddToX - maxSubtractFromX;

        return maxX;
    }

    public static void main(String[] args) {
        int x = 5; // Initial value of x
        int y = 3; // Maximum additions allowed
        int z = 7; // Maximum total operations
        int s = 10; // Maximum sum of additions

        int result = maximizeX(x, y, z, s);
        System.out.println("Maximum value of x: " + result);
    }
}

