package ex_12_Access_Modifiers.Criminal;

import ex_12_Access_Modifiers.Police.Cop;

public class Criminal1 {
    public static void main(String[] args) {
        Cop Thief1 = new Cop(5);
        System.out.println("Thief1.CanIShoot(); //cannot be accessed as method is protected.");
        System.out.println("System.out.println(Thief1.bullets);// cannot be accesses as variable bullets is private");
        //Thief1.CanIShoot(); //cannot be accessed as method is protected.
        //System.out.println(Thief1.bullets);// cannot be accesses as variable bullets is private
    }
}
