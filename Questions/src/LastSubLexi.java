public class LastSubLexi {
    public static void main(String[] args) {
        String s = "bcba";
        int n = s.length();
        int start = n-1;
        char highest = s.charAt(n-1);
        for(int i = s.length() - 2; i >= 0; i--){
            if(s.charAt(i) >= highest){
                start = i;
                highest = s.charAt(i);
            }
        }
        String subs = s.substring(start);
        System.out.println(subs);
    }
}
