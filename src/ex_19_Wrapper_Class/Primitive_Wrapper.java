package ex_19_Wrapper_Class;

public class Primitive_Wrapper {
    public static void main(String[] args) {
        int a = 10;
        //this is primitive data type for which we cannot create objects and do not have any attributes or behaviour.
        //We have Wrapper class which allows us to create objects and can have attributes and behaviours.
        //Integer,Float,Short,Boolean,Character etc.
        Integer b = 20; //Non Primitive data type variable
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(b);
        System.out.println(b.intValue());


    }
}
