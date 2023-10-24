import java.util.ArrayList;

public class CamelCaseString {
    public static void main(String[] args) {
        String input = "helloWorld";
        ArrayList<String> result = new ArrayList<>(camelCase(input));
        for(String s : result){
            System.out.println(s);
        }

    }

    public static ArrayList<String> camelCase(String s){
        StringBuilder str = new StringBuilder();
        ArrayList<String> output = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLowerCase(s.charAt(i))){
                str.append(Character.toUpperCase(s.charAt(i)));
            } else if (Character.isUpperCase(s.charAt(i))) {
                output.add(str.toString());
                str = new StringBuilder();
                str.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        output.add(str.toString());
        return output;
    }
}
