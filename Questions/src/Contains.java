import java.util.*;
public class Contains {
    public static void main(String[] args) {
       ArrayList<String> words = new ArrayList<>();
       words.add("one$two$three");
       words.add("four$five");
       words.add("six");
       char separator = '.';
       String[] out = words.get(0).split("\\$");
        System.out.println(Arrays.toString(out));
//       System.out.println(splitWordsBySeparator(words , separator));
    }

    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        String separate = Character.toString(separator);
        ArrayList<String> result = new ArrayList<>();
        for(String s : words){
            String[] temp = s.split(".");
            result.addAll(Arrays.asList(temp));
        }

        return result;
    }
}
