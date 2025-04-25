package ex_07_OOPs_Inheritance.Multilevel_Inheritance;

public class GrandFather { // this is the base class/Super class/Father Class/ Parent Class
    //This base class has its own attributes and behaviour
    long money = 10L;
    void house(){
        System.out.println("GrandFather has 1BHK House");
    }
    void gf(){
        System.out.println("GrandFather class's method");
    }
}
