package ex_05_OOPs_Constructor;

public class Constructor {
    public static void main(String[] args) {
        baby one = new baby();
        //in above line just object is created for the class,
        // so just creating an object invokes the constructor and
        // statements in default constructor are executed
    }
}
class baby {
    //Behaviours of the class baby
void cry(){
    System.out.println("Baby will Cry");
    }
void eat(){
    System.out.println("Baby can't eat food");
}
    baby(){
        System.out.println("This is the default constructor and will be executed when ever the object is created");
    }
}

