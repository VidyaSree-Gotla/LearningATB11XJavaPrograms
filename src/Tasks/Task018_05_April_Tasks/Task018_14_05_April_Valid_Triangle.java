package Tasks.Task018_05_April_Tasks;

import java.util.Scanner;

public class Task018_14_05_April_Valid_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter three values of sides of a triangle");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if((a+b > c) || (b+c > a) ||c+a > b ){
            System.out.println("Given triangle is a Valid Triangle");
        }
        else
            System.out.println("The given Triangle is not Valid Triangle");
    }
}
