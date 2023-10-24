public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("epajfxzfnvte"));
    }
    static int isPalindrome(String S) {
        // code here
        StringBuilder temp = new StringBuilder(S);
        if(temp.reverse().toString().equals(S)){
            return 1;
        }
        return 0;
    }
}
