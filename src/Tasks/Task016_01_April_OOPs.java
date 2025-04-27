package Tasks;

public class Task016_01_April_OOPs {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        System.out.println("Address is: "+p1.address);
        System.out.println("Name is: "+p1.name);
        System.out.println("Phone number is: "+ p1.phone);
        System.out.println("Age is: "+p1.age);
        Person1 p2 = new Person1("Haresh",30);
        System.out.println("Name is: " +p2.name);
        System.out.println("Age is: "+p2.age);
        p1.eat();
        p1.sleep();
        p1.walk();
        p1.dohomework();
    }
}
class Person1{
    String name;
    int age;
    String address;
    Double phone;
    boolean isMale;
    Person1(){
        System.out.println("This is Default Constructor");
        name = "Ajay";
        phone = 98757893d;
        age = 35;
        isMale = true;
    }
    Person1(String name, int age){
        System.out.println("This is parameterized constructor");
        this.name = name;
        this.age = age;
    }
    //eat, sleep, walk, doHome, printDetails
    void eat(){
        System.out.println("Person can eat");
    }
    void sleep(){
        System.out.println("Person can sleep");
    }
    void walk(){
        System.out.println("Person can walk");
    }
    void dohomework(){
        System.out.println("Person can do Home Work");
    }
}
