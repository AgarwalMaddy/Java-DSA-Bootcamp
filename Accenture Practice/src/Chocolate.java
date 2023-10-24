public class Chocolate {
    public static void main(String[] args) {
        int K = 2;
        int S = 3;
        System.out.println(numberOfWays(K , S));
    }

    public static int numberOfWays(int K , int S){
        int countWays = 0;
        int[] child1 = new int[K+1];
        int[] child2 = new int[K+1];
        int[] child3 = new int[K+1];
        for(int i = 0 ; i <= K ; i++){
            child1[i] = i;
            child2[i] = i;
            child3[i] = i;
        }

        for(int i = 0 ; i <= K ; i++){
            for (int j = 0; j <= K ; j++) {
                for (int k = 0; k <= K; k++) {
                    if(child1[i] + child2[j] + child3[k] == S){
                        countWays++;
                    }
                }
            }
        }
        return  countWays;
    }
}
