package Tasks.Task021_12_April_Tasks;

import java.util.Scanner;

public class Task021_03_12_April_Inverted_Right_Angled_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the n value");
        int n = sc.nextInt();
        for(int i=n-1;i>=0;i--){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
