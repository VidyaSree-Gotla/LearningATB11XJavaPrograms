package Tasks.Task021_12_April_Tasks;

import java.util.Scanner;

public class Task021_01_12_April_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to find Factorial");
        int num = sc.nextInt();
        int res =1;
        if(num ==0 || num ==1){
            System.out.println("Factorial is 1");
        }
        else {
            for(int i=1;i<=num;i++){
                res = res *i;
            }
            System.out.println("Factorial of "+num+" is: "+res);
        }
    }
}
