public class Function_Overloading {
    public static void main(String[] args) {
        func(20);
        func("Madhur");

        System.out.println(sum( 10, 20));
        System.out.println(sum(10,20,30));
    }

    // Two functions can have same name if they have different parameters as in
    // If the type of arguements is different or if the type of argument is different
    static void func(int age){
        System.out.println("Your age is " + age);
    }

    static void func(String name){
        System.out.println("Your name is " + name);
    }

    static int sum(int a, int b){
        return a + b;
    }
    static int sum(int a, int b, int c){
        return a +  b + c;
    }
}
