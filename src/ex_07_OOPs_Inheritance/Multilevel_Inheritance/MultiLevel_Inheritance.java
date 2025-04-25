package ex_07_OOPs_Inheritance.Multilevel_Inheritance;

public class MultiLevel_Inheritance {
    public static void main(String[] args) {
        //Creating Objects for all the classes
        GrandFather gf = new GrandFather();
        Father f = new Father();
        Son s = new Son();

        //calling house method of their respective classes.
        gf.house();
        f.house();
        s.house();

        System.out.println("--------------------------------------------");

        //Father class can call methods of class GrandFather whereas Son class can call GrandFather class's method  and also Father class methods

        f.gf();
        s.gf();
        s.f();

    }
}
