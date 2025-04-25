package ex_15_Abstraction_Interface;

public class Example0 {
    public static void main(String[] args) {
        Son s = new Son();
        s.money();
    }
}
interface Mother{
void money();
}
interface  Father{
void money();
}
class Son implements Mother,Father{
    @Override
    public void money() {
        System.out.println("Child money = mother money + Father money");
    }
}