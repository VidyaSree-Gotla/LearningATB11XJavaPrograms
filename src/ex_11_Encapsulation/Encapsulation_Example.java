package ex_11_Encapsulation;

public class Encapsulation_Example {
    public static void main(String[] args) {
        //## Encapsulation
        //- Encapsulation is a fundamental concept in object-oriented programming (OOP).
        //- Bundling of data and methods that operate on that data within a single unit.
        //- Data members should be private in nature.
        //- Methods with getter and setter only, you can access the data members / attributes.
        ICICIBank user1 = new ICICIBank("user1", 500);
        long bal = user1.getBalance();
        System.out.println(bal);

    }

}
class ICICIBank{
    private String nam;
    private long bal; //After we declare private variables just do right click and the Generate -->Getters and Setters
    //All the below code will be automatically generated.
    public ICICIBank(String name,long balance){
        this.nam = name;
        this.bal = balance;
    }

    public String getName() {
        return nam;
    }

    public void setName(String name) {
        this.nam = name;
    }

    public long getBalance() {
        return bal;
    }

    public void setBalance(long balance) {
        this.bal = balance;
    }
}
