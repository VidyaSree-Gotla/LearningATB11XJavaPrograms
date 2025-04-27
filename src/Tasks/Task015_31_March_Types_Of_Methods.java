package Tasks;

public class Task015_31_March_Types_Of_Methods {
    public static void main(String[] args) {
        person p1 = new person();
        p1.isperson();
        p1.age();
        p1.name("Ajay");
        String place =p1.place("Hyderabad");
        System.out.println(place);
    }
}
class person{
    String name;

void isperson(){
    System.out.println("Yes he is a person");
}
void name(String s){
    System.out.println("Name of the person is: "+s);;
}
public int age(){
    return 35;
}
public String place(String town){
    System.out.println("Town he stays is: ");
    return town;
}
}