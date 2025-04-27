package Tasks.Task017_04_April_Tasks;

import java.util.Scanner;

public class Task017_03_04_April_MaxOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number to check which is max: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            System.out.println("This is Maximum: "+a);
        }
        else System.out.println("This is maximum: "+b);

    }
}
