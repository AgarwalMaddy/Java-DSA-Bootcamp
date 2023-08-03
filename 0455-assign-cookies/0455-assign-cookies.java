class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gLength = g.length , sLength = s.length;
        int i = 0 , j = 0;
        int count = 0;
        while(i < gLength && j < sLength){
            if(s[j] >= g[i]){
                count++;
                i++;
            }
            j++;
        }
        
        return count;
    }
}