package ex_10_Polymorphism.Method_OverRiding;

public class Method_OverRiding_Example {
    public static void main(String[] args) {
        Dog d1  = new Dog();
        d1.sound();
        Animal a1 = new Animal();
        a1.sound();
        Animal a2 = new Dog(); //Dynamic Dispatch concept
        a2.sound();
    }


}

class Animal{
    void sound(){
        System.out.println("Animal Sound!");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Bark!");
    }
}

