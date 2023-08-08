import java.util.*;

public class AssignCookies {
    public static void main(String[] args) {
        int[] greed = {1,2,3,4};
        int[] cookie = {2,2,1,4};

        int result = findContentChildren(greed , cookie);
        System.out.println(result);
    }

    public static int findContentChildren(int[] g , int[] s){

        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0 , j = 0 , count = 0;
        int N = g.length;
        int M = s.length;
        while(i < N && j < M){
            if(s[j] >= g[i]){
                count++;
                i++;
            }
            j++;
        }

        return count;
    }
}
