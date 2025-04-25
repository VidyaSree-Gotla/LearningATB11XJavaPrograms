package ex_14_Abstraction_Abstract_class;

public class Abstraction_Example1 {
    //Abstraction in Java is the process of **hiding implementation details and showing only essential information to the user.**
    public static void main(String[] args) {
        Audi A1 = new Audi();
        A1.drive();
    }
}
abstract  class Engine{
    //This is the abstract class which has abstarct methods which are not complete. they are implemented in next class
    abstract void Start_Engine();
    abstract void Stop_Engine();
     void normal(){
         System.out.println("Just normal Function");
     }
}
class Audi extends Engine{

    @Override
    void Start_Engine() {
        System.out.println("Engine Starting");
    }

    @Override
    void Stop_Engine() {
        System.out.println("Stopping the Engine");
    }
    void drive(){
        Start_Engine();
        Stop_Engine();
    }
}