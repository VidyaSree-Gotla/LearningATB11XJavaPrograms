package ex_07_OOPs_Inheritance.Multilevel_Inheritance;

public class Father extends GrandFather{
    //Father class inherits the properties of GrandFather class
    void house(){
        System.out.println("Father has 2BHK House");
    }
    void f(){
        System.out.println("Father Class's method");
    }
}
