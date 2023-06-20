// 1832. Check if the Sentence Is Pangram
// https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/

class Solution {
    public boolean checkIfPangram(String sentence) {
        for(int i = 0 ; i < 26 ; i++){
            char c = (char)('a' + i);
            if(sentence.indexOf(c) == -1){
                return false;
            }
        }
        return true;
    }
}
