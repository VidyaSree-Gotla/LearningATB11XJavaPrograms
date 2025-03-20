package ex_03_Java_Basic;
import java.util.Scanner;

public class Lab005_Factorial_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for Factorial:");
        int value = sc.nextInt();
//        for (int i=value-1;i>=1;i--){
//            int result= value*i;
//            System.out.println(result);
//        }
        int result=1;
        if(value <=1){
            System.out.println(1);
        }
        else {
            for (int i = 2; i <= value; i++) {
                result = result * i;
            }
            System.out.println(result);
        }

    }
}
