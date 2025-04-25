package ex_07_OOPs_Inheritance.Multilevel_Inheritance;

public class Dynamic_Dispatch {
    public static void main(String[] args) {
        //Last class can only be called with its own object, but child class can access all its parents behaviour
        Son s1 = new Son();
        s1.f();
        s1.gf();
        s1.s();
        System.out.println("------------------------------------------");
        //Father class can be accessed by both Father and its inherited class which id "Son"
        Father f1 = new Father();
        Father f2 = new Son();
        f1.gf();
        f1.f();
       // f1.s(); -->parent cannot access child's methods
        System.out.println("------------------------------------------");
        //Base class can be accessed by all its child objects references
        GrandFather g1 = new GrandFather();
        GrandFather g2 = new Father();
        GrandFather g3 = new Son();
        g1.gf();
        //Below child's methods cannot be accessed by base class
//        g1.f();
//        g1.s();
    }
}
