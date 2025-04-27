package Tasks.Task017_04_April_Tasks;

import java.util.Scanner;

public class Task017_01_04_April_Positive_Negitive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is positive or negitive");
        int n = sc.nextInt();
        if(n==0){
            System.out.println("Zero is neither positive not negitive");
        }
        else if(n>0){
            System.out.println("Number is Positive");
        }
        else {
            System.out.println("Number is negitive");
        }
    }
}
