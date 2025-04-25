package ex_16_IIB;

public class IIB_Example {
    public static void main(String[] args) {
        //just object without reference is also enough to call IIB
        new A(); //First IIB Block is executed and then Default constructor
    }
}
class A{
    A(){
        System.out.println("Default Constructor");
    }
    {
        System.out.println("IIB Means Instance Initialization Block");
        System.out.println("This is called when ever object is created");
    }
}