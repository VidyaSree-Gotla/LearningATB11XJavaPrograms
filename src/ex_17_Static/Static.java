package ex_17_Static;

public class Static {
    public static void main(String[] args) {
        A ref1 = new A(10);
        ref1.display();
        //System.out.println(ref1.b);  cannot be accessed with reference of object
        System.out.println("Static Variables can be accessed with Class name itself and without creating an Object " + A.b);
        A.b = 45; //we changed the value of static variable to 45
        System.out.println("*************************************************************************");
        System.out.println("Changed value of static variable b Value is: "+A.b);
        //If the value of static variable is changed, all objects will share the same instance of value
        A ref3 = new A(20);
        System.out.println(A.b);

    }
}
class A{
    int a; //Non static variable
    static int b = 20;//Static Variable which belong to class Itself
    A(int a){
        this.a = a;
    }
    void display(){
        System.out.println("This is A class Method " + this.a);
    }
}