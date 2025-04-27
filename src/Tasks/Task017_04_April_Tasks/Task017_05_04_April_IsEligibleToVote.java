package Tasks.Task017_04_April_Tasks;

import java.util.Scanner;

public class Task017_05_04_April_IsEligibleToVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the person: ");
        int age = sc.nextInt();
        if(age<18){
            System.out.println("Person is not eligible to vote");
        }
        else
            System.out.println("Person is elegible to Vote");
    }
}
