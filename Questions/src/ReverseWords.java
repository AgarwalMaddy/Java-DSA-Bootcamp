public class ReverseWords {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i < words.length ; i++){
            StringBuilder temp = new StringBuilder(words[i]);
            temp.reverse();
            if(i != words.length - 1)
                result.append(temp).append(" ");
            else
                result.append(temp);
        }
        return result.toString();
    }
}
