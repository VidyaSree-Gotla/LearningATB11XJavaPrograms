package ex_07_OOPs_Inheritance.Multilevel_Inheritance;

public class Son extends Father{
    //Son class inherits the properties of Father directly and properties of Grand Father indirectly as father inherits from grand Father
    void house(){
        System.out.println("Son has 3BHK House");
    }
    void s(){
        System.out.println("Son Class's Method");
    }
}
