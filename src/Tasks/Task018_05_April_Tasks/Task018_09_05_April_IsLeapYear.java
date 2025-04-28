package Tasks.Task018_05_April_Tasks;

import java.util.Scanner;

public class Task018_09_05_April_IsLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year to check if it is leap year or not:");
        int n = sc.nextInt();
        if(n%4==0){
            System.out.println("Is a leap Year");
        }
        else
            System.out.println("Is not a leap year");
    }
}
