package ex_13_Super_Class;

public class Example1 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.Display();
        //System.out.println(super.color);
        Animal a1 = new Animal();
        System.out.println(a1.color);
    }
}

class God{
    void Sound(){
        System.out.println("God!");
    }
}

class Animal extends God{
    protected String color = "White";

    @Override
    void Sound() {
        System.out.println("Animal class Sound");
        super.Sound();
    }
}

class Dog extends Animal{
    private String color = "Black";

    Dog(){
        System.out.println("Dog Class");
    }
    void Display(){
        System.out.println(this.color);
        System.out.println(super.color);
    }
}
