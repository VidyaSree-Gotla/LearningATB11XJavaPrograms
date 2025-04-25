package ex_20_Exceptions;
import ex_17_Static.Static;

import java.util.Scanner;

public class Throw extends Object {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            ValidateAge(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    private static void ValidateAge(int age) throws ArithmeticException, NullPointerException, Exception{
        if (age < 18) {
            throw new Exception("Not allowed");
        }
    }
}
