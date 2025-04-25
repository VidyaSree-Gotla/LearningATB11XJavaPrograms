package ex_20_Exceptions;
import java.util.Scanner;

public class Try_Catch_Finally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        try{
            int b = a/0;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally { //Finally block will always be executed after Try/Catch.
            //It is used to perform actions that are necessary after completing the execution of program.
            sc.close();
            System.out.println("Scanner class closed");
        }

    }
}
