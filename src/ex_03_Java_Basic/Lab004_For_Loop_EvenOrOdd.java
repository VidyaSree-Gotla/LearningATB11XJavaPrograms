package ex_03_Java_Basic;

public class Lab004_For_Loop_EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Even Numbers from 1 to 50 are:");
        for(int i=1;i<=50;i++){
            if(i%2==0){
                System.out.println(i);// can also be used with continue keyword.
            }

        }
    }
}
