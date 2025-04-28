package Tasks.Task018_05_April_Tasks;

import java.util.Scanner;

public class Task018_06_05_April_LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers to check which number is largest");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("this is the largest number: "+a);
            }
        } else if (b>c) {
            System.out.println("This number is largest: "+b);
        }
        else
            System.out.println("This is the largest number:" +c);
    }
}
