public class Scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a);
        System.out.println(b);
        {
            int c = 30;
            // int a = 40; Cannot be initialized again.
            a = 40; // Can be updated though.
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
        int c = 50; //Can be again initialized though
        System.out.println(c);
        //System.out.println(c); Cannot be utilised outside the block.

        // Anything initialised outside the box can be used inside the box.
        // Anything initialised inside the box can be initialised outside the box.
    }
}
