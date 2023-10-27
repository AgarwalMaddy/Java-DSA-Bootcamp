public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String input = "abadsxy";
        System.out.println(longestPalindrome(input));
    }

    public static String longestPalindrome(String s){
        int len = s.length();
        int[] indexforlongestPalindrome = {0,0};


        for(int i = 0 ; i < len ; i++) {
            // Odd Length Palindromes
            int[] oddIndexPalindrome = checkPalindrome(s, i, i);

            if (oddIndexPalindrome[1] - oddIndexPalindrome[0] > indexforlongestPalindrome[1] - indexforlongestPalindrome[0]) {
                indexforlongestPalindrome = oddIndexPalindrome;
            }

            // Even Length Palindromes
            if(i + 1 < len && s.charAt(i) == s.charAt(i+1)){
                int[] evenIndexPalindrome = checkPalindrome(s, i , i + 1);

                if(evenIndexPalindrome[1] - evenIndexPalindrome[0] > indexforlongestPalindrome[1] - indexforlongestPalindrome[0]){
                    indexforlongestPalindrome = evenIndexPalindrome;
                }
            }
        }

        return s.substring(indexforlongestPalindrome[0] , indexforlongestPalindrome[1] + 1);
    }

    public static int[] checkPalindrome(String s , int start , int end){
        while(end < s.length() && start >= 0 && s.charAt(start) == s.charAt(end)){
            start--;
            end++;
        }

        return new int[]{start + 1 , end - 1};
    }
}
