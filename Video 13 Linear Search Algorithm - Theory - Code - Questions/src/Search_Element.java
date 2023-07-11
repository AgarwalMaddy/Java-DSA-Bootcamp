import java.util.Arrays;

public class Search_Element {
    public static void main(String[] args) {
        int[] A = {11,12,13,14,15,16,17,18,19};
        int element1 = 18;
        int element2 = 20;

        System.out.println(linearSearch1(A,element1));
        System.out.println(linearSearch1(A,element2));

        System.out.println(linearSearch2(A,element1));
        System.out.println(linearSearch2(A,element2));

        System.out.println(linearSearch3(A,element1));
        System.out.println(linearSearch3(A,element2));

        String name = "Madhur";
        char element3 = 'M';
        char element4 = 'S';

        System.out.println(stringSearch(name , element3));
        System.out.println(stringSearch(name,element4));

        System.out.println(stringSearch2(name,element3));
        System.out.println(stringSearch2(name,element4));

        //toCharArray Explanation
        System.out.println(Arrays.toString(name.toCharArray()));

    }

    // Returning the Index of the Target Element
    static int linearSearch1(int[] arr , int target){
        if(arr.length == 0){
            System.out.println("No Array Exists");
        }

        for(int i = 0 ; i < arr.length ; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    // Return the Element Itself
    static int linearSearch2(int[] arr , int target){
        if(arr.length == 0){
            System.out.println("No Array Exists");
        }

        for(int i : arr){
            if(i == target){
                return i;
            }
        }

        // Can't return -1 as -1 can be an element of the array.
        return Integer.MAX_VALUE;
    }

    // Return True or False based on the search result.
    static boolean linearSearch3(int[] arr , int target){
        if(arr.length == 0){
            return false;
        }

        for(int i : arr){
            if(i == target){
                return true;
            }
        }

        return false;
    }

    // Search for a character in a String using For Loop
    static boolean stringSearch(String s , char target){
        if(s.length() == 0){
            return false;
        }

        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == target){
                return true;
            }
        }

        return false;
    }

    // Search for  a character in a String using For-Each Loop
    static boolean stringSearch2(String s , char target){
        if(s.length() == 0){
            return false;
        }

        for(char c : s.toCharArray()){
            if(c == target){
                return true;
            }
        }
        return false;
    }
}
