package Tasks.Task017_04_April_Tasks;

import java.util.Scanner;

public class Task017_02_04_April_Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is Even Or Odd");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("number is even");
        }
        else
            System.out.println("Number is odd");
    }
}
