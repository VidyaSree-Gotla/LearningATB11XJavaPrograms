package Tasks.Task018_05_April_Tasks;

import java.util.Scanner;

public class Task018_12_05_April_IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is Prime or Not");
        int num = sc.nextInt();
        int count =0;
        if(num>1){
            for(int i=2;i<num;i++){
                if(num%i ==0){
                    count++;
                }
            }
            if(count>2){
                System.out.println("The given number is prime number");
            }
            else
                System.out.println("The given number is not prime");

        }
        else
            System.out.println("Enter number greater than 1");

    }
}
