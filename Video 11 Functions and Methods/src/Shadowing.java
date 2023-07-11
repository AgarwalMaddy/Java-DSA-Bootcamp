public class Shadowing {
    static int x = 100; //This got shadowed by line number 11
    public static void main(String[] args) {
        System.out.println(x); //Accessing the value initialised earlier

       /* int x;
        System.out.println(x);
        Cannot be done as you have to declare and initialise the variable before using.
        x = 80; */

        int x = 90; //The class variable at line 2 is shadowed by this.
        System.out.println(x); //Accessing the newly initialised value

        print(); //Accessing the function which is accessing the value initialised earlier.
    }

    static void print(){
        System.out.println(x);
    }
}
