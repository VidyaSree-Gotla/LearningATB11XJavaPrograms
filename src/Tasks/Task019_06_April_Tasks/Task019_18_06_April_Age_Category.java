package Tasks.Task019_06_April_Tasks;

import java.util.Scanner;

public class Task019_18_06_April_Age_Category {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the age of a person:");
        int age = sc.nextInt();
        if(age<=0 || age>100){
            System.out.println("input correct age between 1 and 100" );
        } else if (age>0 && age<=12) {
            System.out.println("Child");
        } else if (age>12 && age<=19) {
            System.out.println("Teenager");
        } else if (age>19 && age<=64) {
            System.out.println("Adult");
        } else
            System.out.println("Senior Citizen");
    }
}
