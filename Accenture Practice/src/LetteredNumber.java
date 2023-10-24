public class LetteredNumber {
    public static void main(String[] args) {
        String input = "GBCE";
        char[] str = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            str[i] = input.charAt(i);
        }

        System.out.println(LetteredNumberSum(str , 4));
    }
    public static int LetteredNumberSum(char[] str, int len){
        int sum = 0;
        int a = 1;
        int b = 10;
        int c = 100;
        int d = 1000;
        int e = 10000;
        int f = 100000;
        int g = 1000000;

        if(len == 0){
            System.out.println("Null");
        }
        for(char letter : str){
            if(letter == 'A'){
                sum += a;
            } else if (letter == 'B') {
                sum += b;
            } else if (letter == 'C') {
                sum += c;
            } else if (letter == 'D') {
                sum += d;
            } else if (letter == 'E') {
                sum += e;
            } else if (letter == 'F') {
                sum += f;
            } else if (letter == 'G') {
                sum += g;
            } else {
                sum += 0;
            }
        }
        return sum;
    }
}
