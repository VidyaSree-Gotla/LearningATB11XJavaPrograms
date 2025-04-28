package Tasks.Task021_12_April_Tasks;

import java.util.Scanner;

public class Task021_04_12_April_Pyramid_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the n value");
        int n = sc.nextInt();
        int count =1;
        for (int i = 0; i < n ; i++) {

            for (int j = 0; j < n-i; j++) {

                System.out.print(" ");
            }
            for (int k = 0; k < count; k ++) {

                System.out.print("*");
            }
            count += 2;
            System.out.println();

        }
    }
}
