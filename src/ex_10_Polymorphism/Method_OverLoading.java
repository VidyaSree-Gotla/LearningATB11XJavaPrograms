package ex_10_Polymorphism;

public class Method_OverLoading {
    //Method Overloading is the concept of same method name with different datatypes and arguments
    public static void main(String[] args) {
        MathematicOperations m1 = new MathematicOperations();
        int result1 = m1.add(5,5);
        System.out.println("Result 1 is: "+result1);
       float result2 = m1.add(3.5F,5.7F);
        System.out.println("Result 2 is: "+result2);
       int result3 = m1.add(5,3,6);
        System.out.println("Result 3 is: "+result3);

    }
}
class MathematicOperations{

    int add(int a, int b){
        return a+b;
    }
    float add(float a,float b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}
