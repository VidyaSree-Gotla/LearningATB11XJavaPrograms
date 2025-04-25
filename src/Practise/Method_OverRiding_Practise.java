package Practise;

public class Method_OverRiding_Practise {
    public static void main(String[] args) {
        Dog d1  = new Dog();
        d1.sound();
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
        System.out.println("Bark");
    }
}