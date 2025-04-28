package Tasks.Task019_06_April_Tasks;

import java.util.Scanner;

public class Task019_15_06_April_DivisibleBy5and11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number to check if it is divisible by 5 and 11");
        int num = sc.nextInt();
        if(num%5 ==0 && num%11==0){
            System.out.println("The given number is divisible by both 5 and 11");
        }
        else
            System.out.println("The given number is NOT divisible by both 5 and 11");
    }
}
