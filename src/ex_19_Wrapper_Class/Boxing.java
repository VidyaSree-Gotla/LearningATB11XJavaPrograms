package ex_19_Wrapper_Class;

public class Boxing {
    public static void main(String[] args) {
        int a=10;
        Integer b =a; //JVM does boxing Automatically
        System.out.println(b.intValue());
        System.out.println(Integer.MIN_VALUE);
        Integer c = 38;
        int d = c; //Unboxing -->Wrapper to primitive data type conversion
        System.out.println(d);

    }
}
