import java.util.*;

public class SortVowels {
    public static void main(String[] args) {
        String input = "lEetcOde";
        System.out.println(sortVowels(input));
    }

    public static String sortVowels(String s){
        int n = s.length();
        char[] input = s.toCharArray();
        char[] output = new char[n];
        ArrayList<Character> vowels = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            if(!isVowel(input[i])){
                output[i] = input[i];
            }else{
                vowels.add(input[i]);
            }
        }

        Collections.sort(vowels);
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            if(isVowel(input[i])) {
                output[i] = vowels.get(count);
                count++;
            }
        }

        return new String(output);
    }
    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
