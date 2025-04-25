package ex_21_Generics;

public class Generic_Class {
    public static void main(String[] args) {
        Generic_Class1<Integer> intref = new Generic_Class1(5);
        Generic_Class1<String> Stringref = new Generic_Class1<>("Hello");
        System.out.println(intref);
        System.out.println(Stringref);
    }
}
class Generic_Class1<T>{
    private T data;
    public Generic_Class1(T data){
        this.data = data;
    }
    public T getData() {
        return this.data;
    }


}
