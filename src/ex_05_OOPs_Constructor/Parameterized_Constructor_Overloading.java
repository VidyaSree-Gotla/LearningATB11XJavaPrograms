package ex_05_OOPs_Constructor;

public class Parameterized_Constructor_Overloading {
    public static void main(String[] args) {
        LivingBeing l1= new LivingBeing(); //No arguments are passed in method
        System.out.println("PC0 is called\n" + l1.name); //PC0 is called which is default constructor

        LivingBeing l2 = new LivingBeing("Dog",true); //PC1 Is called
        System.out.println("PC1 is called \n" + l2.name +"\n" + l2.animal);

        LivingBeing l3 = new LivingBeing("Insect",false,6);
        System.out.println("PC2 is called\n" + l3.type+"\n"+l3.animal+"\n"+l3.legs); //PC2 is called

        LivingBeing l4 = new LivingBeing("Fish","Water Animal",true,0);
        System.out.println("PC3 is called\n"+l4.name+"\n"+l4.type+"\n"+l4.animal+"\n"+l4.legs); //PC3 is called


    }
}
class LivingBeing{
    String name;
    String type;
    boolean animal;
    int legs;
    //PC0
    LivingBeing(){
        name = "Cat";
    }
    //PC1
    LivingBeing(String Name, boolean Animal){ //we have passed only 2 arguments
        this.name = Name;
        this.animal= Animal;
    }
    //PC2
    LivingBeing(String Type, boolean Animal, int Legs){ //we have passed 3 arguments
        this.type = Type;
        this.animal = Animal;
        this.legs = Legs;
    }
    //PC3
    LivingBeing(String Name,String Type, boolean Animal, int Legs){
        this.name = Name;
        this.type = Type;
        this.animal = Animal;
        this.legs = Legs;
    }
}
