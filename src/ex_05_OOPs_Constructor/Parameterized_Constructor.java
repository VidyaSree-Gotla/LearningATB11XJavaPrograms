package ex_05_OOPs_Constructor;

public class Parameterized_Constructor {
    public static void main(String[] args) {
        //As object is created first constructor is called and executed.
        human h1 = new human(); //Default Constructor is called
        human h2 = new human("Kavya",1997,987878787); //Parameterized Constructor is called
        System.out.println(h1.name);
        System.out.println(h2.name);

    }
}
class human{
    String name;
    int year;
    double Phno;

    human(){
        System.out.println("This is Default Constructor");
        name = "Vidya";
        year = 1999;
        Phno = 984868763;
    }
    human(String Name,int Year,double phNo){
        System.out.println("This is parameterized constructor");
        this.name = Name;
        this.year = Year;
        this.Phno = phNo;
    }
}
