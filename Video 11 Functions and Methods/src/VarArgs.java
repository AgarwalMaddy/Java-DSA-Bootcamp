import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        func1(1,2,3,5,6,33,3,453,52,24,24,34);
        func2(2 , 4, "Madhur" , "Sparsh");
    }

    static void func2(int a, int b, String ...c){

    }

    /* static void func3(int a , int ...b , int c){}
      Cannot create a function with such pattern of arguments because it is not clear when will the
      infinite input method will end and when the input will be specified for the c variable.
     */
    static void func1(int ...a){
        //(...a) represents that 'n' number of arguments can be taken as an input.
        System.out.println(Arrays.toString(a));
    }
}
