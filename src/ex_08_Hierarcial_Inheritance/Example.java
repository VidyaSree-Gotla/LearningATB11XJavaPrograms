package ex_08_Hierarcial_Inheritance;

public class Example {
    public static void main(String[] args) {
        Father f1 = new Father();
        child1 c1 = new child1();
        child2 c2 = new child2();
        f1.home();
        System.out.println("---------------------------------------");
        //every child can inherit the behaviors of parent class
        c1.home();
        c1.c1();
        System.out.println("---------------------------------------");
        c2.home();
        c2.c2();
    }
}
//Super class
class Father{
    void home(){
        System.out.println("Father has Home");
    }
}
//Child class1
class child1 extends Father{
    void c1(){
        System.out.println("Child 1 method");
    }
}
//child class 2
 class child2 extends Father{
    void c2(){
        System.out.println("Child 2 method");
    }
 }
