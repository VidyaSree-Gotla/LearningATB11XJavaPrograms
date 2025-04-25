package ex_05_OOPs_Constructor;

public class Default_Constructor {
    public static void main(String[] args) {
        car c1 = new car();
        c1.name = "Tesla"; //changing the value of constructor variable and at this instance the updated value is considered.
        System.out.println(c1.name); //name = "Tesla"
        System.out.println(c1.year);
        System.out.println(c1.Model);

        System.out.println("  --------- ");

        car c2 = new car(); //values from constructor are considered here
        System.out.println(c2.name);
        System.out.println(c2.year);
        System.out.println(c2.Model);
    }
}
class car{
    String name;
    int year;
    String Model;
    car(){
        name = "Audi";
        year = 1999;
        Model = "Audi";
    }
}
