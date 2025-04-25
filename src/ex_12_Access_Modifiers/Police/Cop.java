package ex_12_Access_Modifiers.Police;

public class Cop {
    //assume that there are two packages Criminal and Police, and there are bullets variable and CanIShoot method only needed for Police.
    //if there are public then criminal can also those variable and method which is not good.
    //
     private int bullets;
     public Cop(int NoOBullets){
         this.bullets = NoOBullets;
     }
     protected void CanIShoot(){
         System.out.println("Yes, You can Shoot");
     }
}
