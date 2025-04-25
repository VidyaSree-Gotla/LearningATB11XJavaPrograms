package ex_06_OOPS_Inheritance.Single_Inheritance;

public class Single_Inheritance_Example {
    public static void main(String[] args) {
        //Object is created to child class TestCase1 and TestCase2
        TestCase1 t1 = new TestCase1();
        TestCase2 t2 = new TestCase2();

        //Child Methods are called by using its respective object references
        t1.RunTC1();
        System.out.println("****************************");
        t2.RunTC2();
    }
}
