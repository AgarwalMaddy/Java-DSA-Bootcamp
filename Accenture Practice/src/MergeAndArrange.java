public class MergeAndArrange {
    public static void main(String[] args) {
        String a = "denim";
        String b = "are";
        System.out.println(mergeRearrange(a, b));

    }
    public static String mergeRearrange(String a , String b){
       StringBuilder leftPart = new StringBuilder();
       StringBuilder rightPart = new StringBuilder();
       int leftCount = 0 , limit = Math.min(a.length() , b.length()) , rightCount = Math.max(a.length() , b.length());
        for (int i = 0; i < limit ; i++) {
            if(a.charAt(i) < b.charAt(i)){
                leftPart.append(a.charAt(i));
                rightPart.append(b.charAt(i));
            } else{
                leftPart.append(b.charAt(i));
                rightPart.append(a.charAt(i));
            }
            leftCount++;
        }
        if(a.length() > b.length()){
            for(int i = leftCount ; i < rightCount ; i++){
                leftPart.append(a.charAt(i));
            }
        } else {
            for(int i = leftCount ; i < rightCount ; i++){
                leftPart.append(b.charAt(i));
            }
        }


       return leftPart + rightPart.reverse().toString();
    }
}
