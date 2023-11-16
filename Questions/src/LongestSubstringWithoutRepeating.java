public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        String input = "pwwkew";
        int n = input.length();
        System.out.println(longestUniqueSubstring(input, n));
    }

    public static int longestUniqueSubstring(String s , int n){
        String check = s.charAt(0) + "";
        int minLength = check.length();
        int maxLength = Integer.MIN_VALUE;
        int index = 1;
        for(int i = 1 ; i < n ; i++){
            if(!check.contains(s.charAt(i) + "")){
                check += s.charAt(i) + "";
                minLength = check.length();
            }else{
                if(maxLength < minLength){
                    maxLength = minLength;
                }
                check = s.charAt(index) + "";
                i = index;
                index++;
            }
        }

        return Math.max(minLength, maxLength);
    }
}
