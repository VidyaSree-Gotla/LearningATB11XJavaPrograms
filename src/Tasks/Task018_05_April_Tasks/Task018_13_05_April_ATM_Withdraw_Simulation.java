package Tasks.Task018_05_April_Tasks;

import java.util.Scanner;

public class Task018_13_05_April_ATM_Withdraw_Simulation {
    public static void main(String[] args) {
        int balance = 10000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to be withdraw:");
        int withdraw = sc.nextInt();
        if (withdraw == 0 || withdraw > balance) {
            System.out.println("balance amount in you account is: "+balance+ "\n"+" Please enter amount greater than 0 or less than balance amount");
        }
        else {
            if(withdraw % 100 ==0){
                System.out.println("You have withdrawn this amount: "+ withdraw);
                balance = balance - withdraw;
                System.out.println("Remaining balance in your account is: "+balance);
            }
            else
                System.out.println("Enter amount in multiples of hundreds");
        }

    }
}
