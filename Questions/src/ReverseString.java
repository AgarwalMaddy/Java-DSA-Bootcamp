public class ReverseString {
    public static String reverse(String input){
        String[] words = input.split(" ");
        StringBuilder reverseString = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reverseString.append(words[i]).append(" ");
        }
        System.out.println("reverseOrderOfWordsString = " + reverseString);
        return reverseString.toString();
    }

    public static void main(String[] args) {
        String input = "Jfsdanmfsdf fd fdsajk fdsofo jdao aso f jdo jaosj oj dosa a aso j foi";
        System.out.println(reverse(input));
    }
}
