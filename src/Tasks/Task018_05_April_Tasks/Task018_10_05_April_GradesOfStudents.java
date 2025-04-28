package Tasks.Task018_05_April_Tasks;

import java.util.Scanner;

public class Task018_10_05_April_GradesOfStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of the student");
        int marks = sc.nextInt();
        if(marks>=0 && marks <=100){
            if(marks>=90){
                System.out.println("Grade is A+");
            } else if (marks>=80 && marks<=89) {
                System.out.println("Grade is A");
            } else if (marks>=70 && marks<=79) {
                System.out.println("Grade is B");
            } else if (marks >=60 && marks <=69) {
                System.out.println("Grade is C");
            } else if (marks>=50 && marks <=59) {
                System.out.println("Grade is D");
            } else if (marks >=40 && marks<=49) {
                System.out.println("Grade is E");
            }
            else
                System.out.println("Student is Failed");
        }
        System.out.println("Please enter marks starting from 0 to 100");
    }
}
