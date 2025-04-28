package Tasks.Task021_12_April_Tasks;

import java.util.Scanner;

public class Task021_05_12_April_Inverted_Pyramid_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the n value");
        int n = sc.nextInt();
        for (int i = n; i >= 1 ; i--) {
            for (int j = 0; j < n - i ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2*i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
