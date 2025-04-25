package ex_17_Static;

public class Static_IIB {
    public static void main(String[] args) {
        System.out.println("SIB is called only ones when ever the class is loaded");
        System.out.println("IIB is called every time when object is created");
        System.out.println("Constructor is called every time class is loaded");
        System.out.println("******************************************************");
        B ref1 = new B();
        B ref2 = new B();
        B ref3 = new B();
    }
}
class B{
    //SIB
    static {
        System.out.println("This is the Static Initialization block(SIB)");
    }
    //IIB
    {
        System.out.println("This is Instance Initialization Block (IIB)");
    }
    //Default Constructor
    B(){
        System.out.println("This is default constructor");
    }
}
