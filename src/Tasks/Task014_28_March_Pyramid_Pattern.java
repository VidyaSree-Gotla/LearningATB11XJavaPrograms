package Tasks;

import java.util.Scanner;

public class Task014_28_March_Pyramid_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N value");
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {

            // inner loop to handle number spaces
            // values changing acc. to requirement
            for (int j = n - i; j > 1; j--) {
                // printing spaces
                System.out.print(" ");
            }

            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for (int j = 0; j <= i; j++) {
                // printing stars
                System.out.print("* ");
            }

            // ending line after each row
            System.out.println();
        }
    }
}
