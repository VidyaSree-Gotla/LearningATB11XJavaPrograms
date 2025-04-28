package Tasks.Task018_05_April_Tasks;

import java.util.Scanner;

public class Task018_07_05_April_SmallestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input two numbers to check which number is smallest");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a<b){
            System.out.println("This number is the Smallest: "+a);
        }
        else
            System.out.println("This number is the smallest: "+b);
    }
}
