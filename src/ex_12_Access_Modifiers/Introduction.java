package ex_12_Access_Modifiers;

import org.w3c.dom.ls.LSOutput;

public class Introduction {
    public static void main(String[] args) {
//        Son s1 = new Son ();
//        String s2= s1.getGold();
//        System.out.println(s2);
        Son s1 = new Son();
        s1.getGold();
    }

    //the access modifiers in java are 1. Private  2. Protected  3.Public  4.Default
//    1. public:
//    Members (classes, methods, variables) declared as public are accessible from anywhere, regardless of the package.
//        2. private:
//    Members declared as private are only accessible within the same class where they are declared.
//
//            3. protected:
//    Members declared as protected are accessible within their own package, as well as by subclasses (regardless of whether they are in the same package).
//    This allows subclasses to inherit and access protected members of their parent class.
//            4. Default (Package-Private):
//    Members with no access modifier specified (default access) are accessible within the same package.
//    They are not accessible from classes in other packages.
}

//Consider a class below who have private and protected variables
class Father{
    private int gold = 10;
    protected String house = "3BHK";

}
//and below child class inherits from Father class which is super

class Son extends Father{
  void getGold(){
        //System.out.println(gold);  gold cannot be accesses as it is private type so cannot be accesses in other class
      System.out.println(house); //can be accessed as it is protected which can be accessible with in a package.
    }

}